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
	
	public void  adding_Two_Numbers_Separated_By_Comma(){
		
		assertEquals(stringcalculator.Add("1,2"),3);

	}
	
	public void adding_Three_Numbers(){
		
		assertEquals(stringcalculator.Add("1,3,3"),7);

	}
	
	
	
}
