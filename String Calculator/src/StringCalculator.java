
public class StringCalculator {

	public int Add(String numbers){
	
	String[]  integers = numbers.split(",");
		
	 if(numbers.isEmpty())	
		return 0;
	 
	 if(numbers.length()==1)
		return Integer.parseInt(numbers);
	 else
		return Integer.parseInt(integers[0]) + Integer.parseInt(integers[1]);
		
	}
}
