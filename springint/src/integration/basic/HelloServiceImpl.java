package integration.basic;


	import org.springframework.stereotype.Service;

	@Service
	public class HelloServiceImpl implements HelloService
	{
	    @Override
	    public void hello(String name)
	    {
	        System.out.println( "Hello, " + name );
	    }
	    
	    @Override
	    public String getHelloMessage(String name)
	    {
	        return( "Hello, " + name + "dodane w service" );
	    }
	}
