package log4j;


import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.net.SMTPAppender;
import org.junit.Test;



public class Log4jTest {
    private static Logger logger = Logger.getLogger(Log4jTest.class);
    SMTPAppender appender = new SMTPAppender();
   //测试log4j配置文件
    @Test
    public void test1(){
        logger.info("info");
//        logger.error("this is error");
        logger.debug("this is debug");
        logger.warn("warn");
    }

    //测试日志--邮件发送功能
    @Test
    public void test2(){
        try{
            appender.setSMTPUsername("zhomp1202@163.com");
            appender.setSMTPPassword("zhp951000");
            appender.setTo("1404008071@qq.com");
            appender.setFrom("zhomp1202@163.com");
            //SMTP服务器  smtp.163.com
            appender.setSMTPHost("smtp.163.com");
            appender.setLocationInfo(true);
            appender.setSubject("Test Mail From Log4j");
            appender.setLayout(new DefineLayout());
            logger.addAppender(appender);
            logger.error("测试");
        }catch (Exception e){
            e.printStackTrace();
            logger.info("Printing ERROR Statements");
        }
    }
}


class DefineLayout extends HTMLLayout{
    public String getContentType(){
        return "text/html;charset=utf-8";
    }
}
