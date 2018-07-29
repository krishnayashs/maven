package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class unitJ {

	@Test
	public void method1(){
		System.out.println("test");
	}
	
	@Before
	public void method(){
		System.out.println("before");
	}
	@After
	public void method3(){
		System.out.println("after");
	}
	@BeforeClass
	public static void method4(){
		System.out.println("Before Class");
	}
	@AfterClass
	public static void method5(){
		System.out.println("after class");
	}
}
