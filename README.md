# EmployeeRegistryH2
This is a spring boot application. 

Working on compiling spring boot maven app, still working on it. Removed enironmental variable path.

Update Jenkins config file - # make jenkins listen on IPv4 address
#JAVA_ARGS="-Xmx2048m -XX:MaxPermSize=512m -Djava.net.preferIPv4Stack=true"

#adding it to catalina.sh
JAVA_HOME = /usr/lib/jvm/java-8-openjdk-amd64/jre/bin

#Changing JAVA_HOME
root@lfarul:/# gedit /etc/environment
JAVA_HOME="/usr/lib/jvm/java-8-openjdk1.8.0_212"
