package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.service.HelloWorldService;

public class DemoTest {
	public static DemoTest self = new DemoTest();  
    private HelloWorldService helloWordClient;  
      
   private DemoTest() {  
          ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"com/demo/service/ws-client-beans.xml"});  
          helloWordClient = (HelloWorldService) context.getBean("helloWorldService");  
      }  
      

   public HelloWorldService getServer() {  
          return helloWordClient;  
      }  

   public String getText(String text) throws Exception {  
          String response = getServer().sayHi(text);  
          return response;  
      }  

   public static void main(String[] args) {  
      try {  
          System.out.println(self.getText("eric"));  
      } catch (Exception e) {  
          e.printStackTrace();  
      }  
        
  }  
}
