import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		int expected = 5555;
		assertEquals (expected,actual);
	}
	
	@Test
	public void testSubtract() {
		int a = 90;
		int b = 80;
		
		Calculator cal = new Calculator();
			int actual = cal.substract(a, b);
			int expected = 10;
			assertEquals (expected,actual);
	}
	
	@Test
	public void testMultiple() {
		int a = 12;
		int b = 12;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		int expected = 144;
		assertEquals (expected,actual);
	}
	
	@Test
	public void testDivide() {
		int a = 100;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 10;
		assertEquals (expected,actual);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}


}
