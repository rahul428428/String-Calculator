import static org.testng.AssertJUnit.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestClass {

	private StringCalculator stringcalculator;

	@BeforeTest
	public void init(){
		
		stringcalculator = new StringCalculator();
	}
	
	public void  empty_String_ReturnZero() {
		
		assertEquals(stringcalculator.Add(""),0);

	}
	
	public void adding_Single_Number_itself(){
		
		assertEquals(stringcalculator.Add("1"),1);

	}
	
	
	
}
