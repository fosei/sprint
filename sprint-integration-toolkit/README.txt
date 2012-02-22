###############################################################################
# README.txt
###############################################################################

This package is intended to get a developer up and running with a SOAP client 
that can exchange SOAP messages with a Sprint web service.  The test web 
service used by the client is exposed through two URLs: one that is secured 
with WS-Security 1.0 digital signature; and a second anonymous URL.  Per the 
WS-Security specification, the secured Sprint web service requires all SOAP 
requests to be digitally signed by the client.  The signature and binary-encoded
client public certificate must be included in the WS-Security 1.0 header of each
SOAP request.  The anonymous URL does not impose this requirement and is meant 
to be used for simple connectivity tests.

The sample client will digitally sign the request, but can also be configured
to validate the signature for signed responses from the server.  The
sample uses the Apache Axis 1.x SOAP engine and includes custom handlers that 
extend the Axis BasicHandler class to implement the request signature and 
response verification steps.  For a more detailed explanation of Apache Axis, 
please see the resources section at the end of this file.  It should be 
relatively easy to extend this sample to use other features of WS-Security 
once the core concepts of SOAP, Axis, and WS-Security are understood.

DISCLAIMER:
This client is NOT production-ready code and is not intended to be used as-is
in production environments.  It is merely provided to illustrate how to 
integrate with web services secured with the WS-Security 1.0 protocol.  It is 
always prudent to conduct thorough functional and performance testing on all 
code intended for a production environment, especially for high-volume and/or
mission-critical applications.

############
# OVERVIEW
############

The sample is a web service client that uses the Apache Axis SOAP engine and 
WSS4J security handlers to connect to a web service.  It was developed and
tested on Microsoft Windows XP SP2, but should run on unix platforms with 
little or no tweaking.  This README explains the build steps in detail, however
the high-level steps are:

(0) Environment/Keystore configuration
(1) Generate code from the WSDL hosted at the Sprint URL using WSDL2Java
(2) Compile both the sample client and generated beans using the included libs
(3) Package the code for easy distribution (jarfile)
(4) Run the anonymous SOAP test
(5) Run the signed SOAP test
(6) Cleanup

##########
# MANIFEST
##########

After unzipping this package you should find:

lib					Required libraries for the package
resources				Resource files (e.g. properties, keys)
src					Source files for the package
tools					Contains the Keytool GUI and Apache ant
build.xml				Ant build file
clean.bat				Shortcut to cleaning the environment
keytool.bat				Launches the included keytool utility
LICENSE					Apache license for included code
README.txt				This file
runAnon.bat				Launches the anonymous SOAP test.
runSigned.bat				Launches the signed SOAP test.
tcpmon.bat				Launches the included tcpmon utility

Additionally, after running a full build you should see the following folders
created (and subsequently removed after invoking the clean target):

build					Compiled classfiles
dist					Distribution dir for the target jarfile
gensrc					Contains all generated src from the WSDL

Under the src directory, here are the notable files and directories:

*.java		Sample client(s) for testing the web svc
com 		Src tree for the security handlers written by Sprint.
dom		Sample Apache code for message writing DOMs.
wssec		Sample Apache code for SOAP message manipulation.

###############
# PREREQUISITES
###############

This package was developed and tested using the following tools and versions.
Because web services security is a rapidly evolving standard, many changes
take place between versions of the required libraries.  Therefore, if you do
not use the recommended versions, YMMV.  It is strongly recommended to use
the versions specified below.  The required libraries should already be
included in the lib folder of this distribution and are listed here as a 
convenience.  

Tool				Location
----				--------
Java SDK 1.4.2_14 (or later)	java.sun.com
Apache Ant 1.7.0		www.apache.org
Apache Tomcat 5.5.20		www.apache.org
Tomcat JDK 1.4 Compat Libs	www.apache.org
Apache Axis 1.4			www.apache.org
Apache WSS4J 1.5.0		ws.apache.org/wss4j
Xerces 2.7.0			www.apache.org


###################
# INSTALLATION
###################

Unzip this package into the desired working folder.  To reduce the size
of the CLASSPATH and avoid the Windows CLASSPATH limitation, avoid using deeply
nested folders (e.g. install into C:\projects\Sprint, etc).  From this point
on, the root folder of the installed package will be referred to as 
TOOLKIT_HOME.

When installing Java, you should choose the custom installation options and 
avoid installing to paths containing spaces (e.g. Program Files\Java) as some 
cross-platform tools don't deal well with spaces in filenames or pathnames.

***IMPORTANT***

This package assumes you have a valid keystore containing a valid certificate
provided by Sprint and a public/private keypair generated from that certificate.  
The keystore is required to create and validate the digital signature.  The 
keystore is normally created and configured during the Sprint beta integration
process.  Please ensure this keystore is placed into the ant directory 
${resources}.  Also be sure to configure ${resources}/client-crypto.properties 
appropriately.

***IMPORTANT***


#######################
# ENVIRONMENT SETUP
#######################

This project is designed to enable integration as quickly as possible and 
therefore includes all of the required libraries.  After unzipping the package
some minimal environmental setup is required.  In particular, both JAVA_HOME
and ANT_HOME must be set in your environment and added to your PATH to pick up 
their respective executables.

JAVA:

This project has been tested with and is known to work with jdk1.4.2_14 and 
jdk1.5.0_09.  There are at least two ways to set Windows environment variables:
through the system control panel or on the command line.

CONTROL PANEL METHOD (Windows XP):

Start->Settings->Control Panel
Double-click on System
Click on the Advanced tab
Click on the Environment Variables button (bottom)
Select User variables (top half)

If JAVA_HOME already exists, just click on the edit button for it.  Otherwise,
select New and complete the fields appropriately:

Variable name: JAVA_HOME 
Variable value: C:\java\jdk1.5.0_09 (example)

Click Ok twice to save your changes and exit the dialog boxes.  If you have any
command prompts open, you'll need to close them and re-open new ones to pick up
the new environment changes.

COMMAND-LINE METHOD:

If you don't already have a command prompt open, start a new one by running
start->run->cmd

set JAVA_HOME="C:\java\jdk1.5.0_09"

Note: Although this method is easier, the environment settings only apply to
the current command window and therefore you'll need to repeat this step for
every new command window.  This is why the control-panel method is the
preferred method.  Alternatively, you can edit the included setenv.bat file and 
just execute this file from each new command window.

ANT:

This toolkit requires the 1.7 version of Apache Ant.  For simplicity, you can
use the one included in the tools folder of the toolkit.  Using the same method
you applied for JAVA_HOME, simply set ANT_HOME to point to the toolkit:

set ANT_HOME="C:\sprint-integration-toolkit\tools\ant"

PATH:

Once JAVA_HOME and ANT_HOME have been set for your environment, you'll need to
ensure that the ant, java, and javac executables can be found.  Do this by
adding to the PATH environment variable.  Following the same procedure as
above, _prepend_ ANT_HOME and JAVA_HOME to the Windows path as below.

Note: It's important to prepend the path to avoid picking up other versions of
Java and Ant.

set PATH="%JAVA_HOME%\bin;%ANT_HOME%\bin;%PATH%"

UNIX/CYGWIN:

If you're in a Unix or Cygwin environment, the environment settings will look
something like this:

export JAVA_HOME="C:/Java/jdk1.5.0_09"
export ANT_HOME="C:/sprint-integration-toolkit/tools/ant"
export PATH="$ANT_HOME/bin:$JAVA_HOME/bin:$PATH"

PROJECT-CONFIGURATION:

Below are some descriptions of the configuration files and their purpose:

client.properties			Config values for the java test client
client-crypto.properties		Defines the security parameters for jks
client-sign-deploy.wsdd			Defines axis engine config (signed)
client-nosign-deploy.wsdd		Defines axis engine config (anonymous)
log4j.properties			Controls logging properties for the sample
SprintCA.cer				Sprint public cert used to create CSRs.

Most of the project configuration is found in resources/client.properties.  In
particular, this file is used to configure the URLs for the signed and 
anonymous SOAP endpoint URLs, proxy configuration (if used), and any test data 
required for the java client.  Make sure the values in this file are correct for
your environment.

You'll also need to examine the values configured in 
resources/client-crypto.properties to make sure they match your keystore.  This
file is used by your client's signing handler when hitting the secured URL.  
Keystore configuration is usually done during the Sprint beta integration 
session.

##############
# QUICK START
##############

For the impatient, assuming you've already installed the JDK and have set 
JAVA_HOME, you should be able to use the included .bat files to execute the 
sample:

runAnon.bat	runs the sample client, which posts to the anonymous Sprint URL
runSigned.bat	copy of run.bat
clean.bat	cleans generated files

If you're a developer and want to learn how the sample works, read on...

######################
# BUILDING THE PROJECT
######################

The following commands can be run in either a Windows command prompt (cmd) or
a cygwin bash session.

Generate the java client code from the provided WSDL:

   ant gen-src

This should create a new folder called "gensrc" and populate it with the client
stubs generated from the WSDL referenced in resources/client.properties.  This 
directory will be removed when the deep-clean target is invoked.

Next, compile the code:

   ant build

	or simply
   ant

This should create a "build" directory and populate it with the compiled classes
assuming the build ran correctly.  If you encounter build errors, check the output
of "ant env-help" to make sure all variables are being set correctly for your env.

Next, assemble the loose classes into a jarfile:

   ant dist

This will create a folder called "dist" and place the assembled jar, 
<ant-project-name>.jar (defined at the top of build.xml) into it.  The jar is 
used (along with the properties in ${resources}) to execute the sample.

Cleanup

The clean target removes all generated files from build and dist.
 
   ant clean

The deep-clean target is meant to return the distribution to a pristine state,
and so it removes the gensrc directory and all backup files (*.bak, *.~).  Be 
careful with this one!  If you have hand-edited anything under gensrc (not 
recommended) you will lose those files as well as any manually created backups
after running this target.

   ant deep-clean

The above descriptions are merely meant to provide you a step-by-step of the build 
process.  Ant automatically runs all dependent targets that are out of date, 
so for most debugging cycles, the targets "clean, run-anon, run" will 
meet most of your needs.

#########################
# Running the Client
#########################

This section assumes you've successfully completed the above steps to build
the sample.

   ant run-anon

      OR
   
   execute the included runAnon.bat file

This target should invoke the Main method of the java client using the 
parameters specified in resources/client.properties.  Assuming a successful 
execution, you should see a "SUCCESS!" response logged in the console window.  
For more detailed output, the client is also instrumented with Apache log4j 
(see resources/log4j.properties for configuration details).  This is helpful
for reviewing the request and response SOAP messages with and without the security
headers and can be useful for troubleshooting.  By default the sample is 
configured to log to $TOOLKIT_HOME/<client-name>.log.  You can modify 
resources/log4j.properties to create this file anywhere on your system.

#########################
# Troubleshooting
#########################

You can change the log-levels in log4j.properties to "DEBUG" to enable more 
verbose logging.  By default, the log4j properties file is configured to write
debug information to C:/temp/<project-name>.log.

Check the output of running "ant env-help".  Look for any variables that are
unset.  They typically look like this: ${some-unset-variable}.

Make sure you have the correct URLs configured in resources/client.properties.

If you're behind a firewall and require a proxy configuration, make sure you
have defined that proxy configuration in resources/client.properties.

Make sure you have the correct values configured for your keystore in
resources/client-crytpo.properties.

Check your CLASSPATH to ensure you have accounted for all required classes,
libraries, AND resource files.  Also watch out for the WINDOWS path limitation
and spaces in any of your path names.

Check to make sure you've defined JAVA_HOME correctly for your environment and
that it points to a jdk (Java development kit) and not a jre (Java runtime 
engine).

Your errors might be data-related.  Try changing the values in client.properties
to some known, working values.  

Something could be fouled up with the generated code, especially if it was
hand-edited after generation.  Try running an "ant deep-clean" and 
"ant build" to start with a fresh environment.

#########################
# Extending the sample
#########################

One should be able to use this same framework with any provided WSDL, simply
by changing the build file to accept a different project name and new WSDL, 
and of course writing a simple client driver to execute the service.  The 
${client-service-name} is configurable at the top of build.xml.  The URLs are
configured in resources/client.properties.

Different security models can be achieved by modifying or extending the included
handlers to fit your needs.  If you change the security handlers, be sure to 
modify the handler reference(s) under <globalConfiguration> in 
${resources}/client-[sign|no-sign]-deploy.wsdd.

###########
# Resources
###########

The following links are invaluable sources of information on Java, SOAP, 
web services, and security.

http://wiki.apache.org/ws/
http://ws.apache.org/wss4j/axis.html
http://ws.apache.org/wss4j/api.html
http://ws.apache.org/axis/java/index.html
http://ws.apache.org/axis/java/apiDocs/index.html
http://java.sun.com/j2ee/1.4/docs/tutorial/doc/
http://ant.apache.org/manual/index.html
http://www.nabble.com/Apache-Web-Services-f215.html

and of course, Google!

It is also a good idea to walk through the Apache WSS4J installation tutorial.
The tutorial walks you through the steps to securing a web service using a 
password callback handler and will give you a starting point to understanding 
how the WSS4J security libraries work within Axis.  The tutorial can be found 
at: http://ws.apache.org/wss4j/axis.html.

######
# TODO
######

-Refactor the handlers to extend from a common handler class and remove
 duplicated code.
-Parameterize the name of the crypto config file for all handlers.  It is
 currently hardcoded to look for "client-crypto.properties" in the CLASSPATH.
