package common;


import org.apache.log4j.Logger;

public class Log4jProp {

    private static Logger logger = Logger.getLogger(Log4jProp.class);

    public static void test(){
        logger.info("this is info");
        logger.error("this is error");
        logger.debug("this is debug");
    }

    public static void main(String[] args) {
        test();
    }
}
