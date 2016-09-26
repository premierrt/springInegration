package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kod.GreeterService;
import kod.RadomInputService;
import kod.RandomInputServiceImpl;

/**
 * Main entry-point into the test application
 */
public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext( "spring_xml.xml" );

     GreeterService greeterService = applicationContext.getBean( "greeterServiceImpl", GreeterService.class );
//
      // greeterService.greet( "Spring Integration!" );
   //   greeterService.greet2( "Spring Integration (with response)!");

  RadomInputService rrr= applicationContext.getBean("randomInputServiceImpl", RadomInputService.class);
     
  rrr.pomnozLosowo(2);
    }
}

