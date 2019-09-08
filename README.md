# java_basics

installing java on ubantu
 
  sudo apt-get install openjdk-8-jdk
 
  sudo add-apt-repository ppa:webupd8team/java
 

 sudo apt-get update
Ign:1 http://dl.google.com/linux/chrome/deb stable InRelease
Hit:2 http://ppa.launchpad.net/deadsnakes/ppa/ubuntu xenial InRelease          
Hit:3 http://dl.google.com/linux/chrome/deb stable Release                     
Get:4 http://ppa.launchpad.net/webupd8team/java/ubuntu xenial InRelease [17.6 k

 sudo update-alternatives --config java
There are 2 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                            Priority   Status
------------------------------------------------------------
* 0            /usr/lib/jvm/java-9-openjdk-amd64/bin/java       1091      auto mode
  1            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1081  


for Environments
 sudo nano /etc/environment
 source /etc/environment
 echo $JAVA_HOME
/usr/lib/jvm/java-8-oracle
vikas@vikas-Inspiron-5520:~$ java
 
