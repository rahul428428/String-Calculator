
public class StringCalculator {

	public int Add(String numbers){
	
	String[]  integers = numbers.split(",");
		
	 if(numbers.isEmpty())	
		return 0;  
	 else{
		int sum=0 ;
		  for(String curr:integers){
			  
			  sum += Integer.parseInt(curr);			
	     	}
		return sum; 
	 }
	}
}
