

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Solution {
	
		

	public static void main(String[] args) {
		
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		

		
        System.out.print("Enter number:\n");  
        
        try {
        String s = br.readLine().trim().toLowerCase().replace(" ", "");
		                   
		
		System.out.println("The number of combinations is: "+permute(s).size());
		System.out.println("\n"+permute(s));
					

        }catch(Exception e) {
        	System.out.println("Invalid input.\nEnter numbers only.");
        }
		

	}
	
	
	
	
	public static Set<String> permute(String chars)
	  {

	    Set<String> set = new TreeSet<String>();

	    if (chars.length() == 1)
	    {
	      set.add(chars);
	    }
	    else
	    {

	      for (int i=0; i<chars.length(); i++)
	      {

	        String pre = chars.substring(0, i);
	        String post = chars.substring(i+1);
	        String remaining = pre+post;

	        for (String permutation : permute(remaining))
	        {
	        	
	          String value = (chars.charAt(i) + permutation);	          	          
	          
	          if(!"0".equals(permutation)) {
	        	  set.add(value);
	          }    
	          
	          
	        }
	      }
	    }
	    return set;
	  }
	
	
	
	

}
