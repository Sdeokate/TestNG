package addition;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;

public class TestJunit {

	@Test

	public void test() {
		//fail("Not yet implemented");
		int number3=9;
		
		Assert.assertEquals(number3, AdditionProgram.addValues());
		//AssertJUnit.assertEquals(number3, AdditionProgram.addValues());
		//System.out.println(" Addition of 2 numbers is - ");
		
	}
 
	
}
