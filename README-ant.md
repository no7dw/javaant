# java ant demo

ant compile  --execdebug
ant jar
ant run


if you run in trouble with ant compile, output :

$ ant compile  --execdebug
exec "/Library/Java/JavaVirtualMachines/jdk1.7.0_79.jdk/Contents/Home/jre/bin/java" -classpath "/usr/local/lib/ant-launcher.jar" -Dant.home="/usr/local" -Dant.library.dir="/usr/local/lib" org.apache.tools.ant.launch.Launcher -cp "" "compile"
Error: Could not find or load main class org.apache.tools.ant.launch.Launcher


[trouble with ant][1]

install ant completely , not just 
 
    cp ant /usr/local/bin

instead put the whole lib bin to /usr/local/lib /usr/local/bin

or just export PATH=$PATH:YOUR_ANT_PATH

also this [command][2] will help:

    $ant -diagnostics


  [1]: http://stackoverflow.com/questions/2336299/what-is-wrong-with-my-ant-configuration
  [2]: http://ant.apache.org/problems.html
