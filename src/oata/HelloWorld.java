package oata;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;


public class HelloWorld {
    static Logger logger = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
    //    System.out.println("Hello World");
        BasicConfigurator.configure();
        logger.info("Hello World");  
    }
}

