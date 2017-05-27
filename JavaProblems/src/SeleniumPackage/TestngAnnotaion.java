package SeleniumPackage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotaion {

	// test case 1

	@BeforeMethod
	public void setUp() {
		System.out
				.println("@BeforeMethod: The annotated method will be run before each test method.");
	}

	@Test
	public void validateSum() {
		System.out.println("@Test : validateSum()");
		int a = 5;
		int b = 10;
		Assert.assertEquals(a + b, 15);
	}

	@Test
	public void validateDifference() {
		System.out.println("@Test : validateDifference()");
		int a = 5;
		int b = 10;
		Assert.assertEquals(b - a, 5);
	}
}
