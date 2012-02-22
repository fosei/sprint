import java.net.URL;
import java.io.*;
import java.util.Properties;

import com.sprint.integration.canonical.v1.interfaces.QuerySystemStatusService_wsdl.*;
import com.sprint.integration.canonical.v1.interfaces.PingRequest_xsd.*;
import com.sprint.integration.canonical.v1.interfaces.PingResponse_xsd.*;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.configuration.FileProvider;


public class TestQuerySystemStatus {

	public static String inputPropertyFile = "client.properties";
	public static String proxyURL = "http://localhost:2222";  // WS End Point URL
	private static Properties props;

public static void main(String args[]) throws Exception {
	loadProps();

    proxyURL = (props.getProperty("URL") != null && props.getProperty("URL").trim().length() > 0) ? props.getProperty("URL") : System.getProperty("url");

    EngineConfiguration config = null;

    if (System.getProperty("client.deploy.file.location") != null) {
		config = new FileProvider(System.getProperty("client.deploy.file.location"));
	}

    QuerySystemStatusServiceLocator locator = new QuerySystemStatusServiceLocator(config);
    QuerySystemStatusPortType pingPort = locator.getQuerySystemStatusPortType(new URL(proxyURL));
    PingResponseType resp = pingPort.ping(new PingRequestType());

	if (resp.isStatus())
	{
		System.out.println("SUCCESS!  Endpoint is available");
		//boolean retval = resp.isStatus();
		//System.out.println(retval);
	}
	else
		System.out.println("FAILURE...Endpoint is NOT available");
}

// Utility method to load properties
	private static void loadProps()
	{
		try
		{
	    	    ClassLoader cl = TestQuerySystemStatus.class.getClassLoader();
            	    InputStream in = cl.getResourceAsStream(inputPropertyFile);
		    props = new Properties();
		    props.load(in);

		    System.out.println("Using properties file...");

		    proxyURL = props.getProperty("URL", "http://localhost:2222");

		}
		catch (Exception e)
		{
		    System.out.println("Cannot locate properties file, please ensure it is in the CLASSPATH.");
		    System.out.println(e.toString());
		    System.exit(0);
		}
	}

}
