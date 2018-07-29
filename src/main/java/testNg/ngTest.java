package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ngTest {
	
	
	@BeforeClass
	public static void test2() {
		System.out.println("test2");
	}
	
	@BeforeMethod
	public void test4() {
		System.out.println("test4");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	
	@AfterMethod
	public void test5() {
		System.out.println("test5");
	}
	
	@AfterClass
	public static void test3() {
		System.out.println("test3");
	}
	
	@AfterSuite
	public void test7() {
		System.out.println("test7");
	}
	@BeforeGroups
	public void test8() {
		System.out.println("test8");
	}
	@AfterGroups
	public void test9() {
		System.out.println("test9");
	}
	@BeforeTest
	public void test10() {
		System.out.println("test10");
	}
	@AfterTest
	public void test11() {
		System.out.println("test11");
	}
	@BeforeGroups
	public void test12() {
		System.out.println("test12");
	}

}
