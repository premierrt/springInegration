package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kod.GreeterService;

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
       greeterService.greet( "Spring Integration!" );
    }
}

