package fit2drive;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExampleTest {

	@BeforeClass
	public static void beforeClass() {
//		System.out.println();
//		System.out.println("before class");
//		System.out.println();
	}
	
    @Before
    public void beforeTest() {
//    	System.out.println("before method");
    }

    
    @Test
    public void test1() {
//    	System.out.println("test1");
    }
    
    
    @Test
    public void test2() {
//    	System.out.println("test2");
    }
    
    
    @After
    public void afterTest() {
//        System.out.println("after method");
//        System.out.println();
    }
    
    @AfterClass
    public static void afterClass() {
//    	System.out.println();
//    	System.out.println("after class");
//    	System.out.println();
    }
	
}
