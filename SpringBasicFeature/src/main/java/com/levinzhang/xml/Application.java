package com.levinzhang.xml;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;;

public class Application {
 

  public static void main(String[] args) {
      ApplicationContext context = 
          new GenericXmlApplicationContext("classpath:com/levinzhang/xml/applicationContext.xml");
      MessageService printer = context.getBean(MessageService.class);
      System.out.println(printer.getMessage());
  }
}
