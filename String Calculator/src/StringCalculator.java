
public class StringCalculator {

	public int Add(String numbers) throws Exception{
	 
		return(getSum(numbers));
	
	}
	
	
        public int getSum(String str) throws Exception{
		
		String delimiter = "\n|,";
	
		
		if(str.startsWith("//")){
			String[] splitted = str.split("\n");
            delimiter = splitted[0].substring(2);
            str = splitted[1];
		}
		String[]  integers = str.split(delimiter);
		
		 if(str.isEmpty())	
			return 0;  
		 else{
			int sum=0 ;
			  for(String curr:integers){
				   
				  if(Integer.parseInt(curr) <0){
	    		      throw new Exception("negatives not allowed");
	    		     } 
				  
				  if(Integer.parseInt(curr)>1000)
	    			   continue;
				  
				  sum += Integer.parseInt(curr);			
		     	}
			return sum; 
		 }
	}
	}

