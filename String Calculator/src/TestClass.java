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
	
	public void  empty_String_ReturnZero() throws Exception {
		
		assertEquals(stringcalculator.Add(""),0);

	}
	
	public void adding_Single_Number_itself() throws Exception{
		
		assertEquals(stringcalculator.Add("1"),1);

	}
	
	public void  adding_Two_Numbers_Separated_By_Comma() throws Exception{
		
		assertEquals(stringcalculator.Add("1,2"),3);

	}
	
	public void adding_Three_Numbers() throws Exception{
		
		assertEquals(stringcalculator.Add("1,3,3"),7);

	}
	
	public void adding_Two_Numbers_With_NewLine() throws Exception{
		
		assertEquals(stringcalculator.Add("1\n2,3"),6);
		
	}
	
  public void adding_Two_Numbers_StartWith_double_Slash() throws Exception{
	   assertEquals(stringcalculator.Add("//;\n1;2"),3);
  }
  
  @Test(expectedExceptions=Exception.class)
  public void negetive_Number_Input() throws Exception{
	  
	    stringcalculator.Add("-1");
  }
  
  @Test(expectedExceptions=Exception.class)
  public void Multiple_negetive_Number_Input() throws Exception{
	  stringcalculator.Add("-1,-2,-3");
  }
	
	
}
