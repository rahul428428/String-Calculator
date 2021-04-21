
public class StringCalculator {

	public int Add(String numbers){
	 
		return(getSum(numbers));
	
	}
	
	
	public int getSum(String str){
		
		String[]  integers = str.split(",");
		
		 if(str.isEmpty())	
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
