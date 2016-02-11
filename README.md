# java ant demo

mkdir -p src/oata
mkdir -p  build/classes
cd src/oata/
vim HelloWorld.java
cd ../../
javac -sourcepath src -d build/classes/ src/oata/HelloWorld.java 
java -cp build/classes/ oata.HelloWorld
