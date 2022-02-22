package com.Junit.Junits;


import static org.junit.Assert.*;
import org.junit.Test;

public class GreetingImplTest {
	

	@Test
	public void greetshouldReturnAValidOutput() {
		Greeting greeting = new GreetingImpl();
		String result=greeting.greet("Junit");
		assertNotNull(result);
	    assertEquals("Hello Junit", result);
	}
   @Test(expected = IllegalArgumentException.class)
   public void greetShouldThrowAnException_For_NameIsNull()
   {
	   Greeting greeting= new GreetingImpl();
	   greeting.greet(null);
	   
	   
   }
   @Test(expected = IllegalArgumentException.class)
   public void greetShouldThrowAnException_For_NameIsBlank()
   {
	   Greeting greeting= new GreetingImpl();
	   greeting.greet("");
	   
   }
   
	
	
}
