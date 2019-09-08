# java_basics

installing java on ubantu
 
 vikas@vikas-Inspiron-5520:~$ sudo apt-get install openjdk-8-jdk
[sudo] password for vikas: 
Reading package lists... Done
Building dependency tree       
Reading state information... Done
vikas@vikas-Inspiron-5520:~$ sudo add-apt-repository ppa:webupd8team/java
 The Oracle JDK License has changed for releases starting April 16, 2019.

vikas@vikas-Inspiron-5520:~$ sudo apt-get update
Ign:1 http://dl.google.com/linux/chrome/deb stable InRelease
Hit:2 http://ppa.launchpad.net/deadsnakes/ppa/ubuntu xenial InRelease          
Hit:3 http://dl.google.com/linux/chrome/deb stable Release                     
Get:4 http://ppa.launchpad.net/webupd8team/java/ubuntu xenial InRelease [17.6 k

vikas@vikas-Inspiron-5520:~$ sudo update-alternatives --config java
There are 2 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                            Priority   Status
------------------------------------------------------------
* 0            /usr/lib/jvm/java-9-openjdk-amd64/bin/java       1091      auto mode
  1            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1081  


for Environments
vikas@vikas-Inspiron-5520:~$ sudo nano /etc/environment
vikas@vikas-Inspiron-5520:~$ source /etc/environment
vikas@vikas-Inspiron-5520:~$ echo $JAVA_HOME
/usr/lib/jvm/java-8-oracle
vikas@vikas-Inspiron-5520:~$ java
Usage: java [options] class [args...]
           (to execute a class)
   or  java [options] -jar jarfile [args...]
           (to execute a jar file)
