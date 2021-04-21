
public class StringCalculator {
  
 	 
	public int Add(String numbers) throws Exception{
	 
	 
		return(getSum(numbers));
	
	}
	
	
        public int getSum(String str) throws Exception{
		
        String[] splitted = str.split("\n");
		String delimiter = "\n|,";
	 
		if(str.startsWith("//") && str.contains("]["))
		{  
			int indx = splitted[0].indexOf("][");
			int length = splitted[0].length();
			String delimiter1,delimiter2,delimeter3;	
			delimiter1 = splitted[0].substring(3,indx); 
			delimiter2 = splitted[0].substring(indx+2,length-1);	 
			delimiter = "[" + delimiter1 + delimiter2 + "]" ;
			str = splitted[1];
		}
		
		if(str.startsWith("//") && !(str.contains("[")))
		{	 								
			delimiter = splitted[0].substring(2);
			str = splitted[1];
		}  
		
		if(str.startsWith("//")){
			 
            delimiter = splitted[0].substring(2);
            str = splitted[1];
            
		}
		String[]  integers = str.split(delimiter);
		
		 if(str.isEmpty())	
			return 0;  
		 else{
			int sum=0 ;
			  for(String curr:integers){
				   
				  if(curr.isEmpty())
					 continue; 
				  
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

