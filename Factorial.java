package week1.day1;

public class Factorial {
	
	static int input = 5;

	public static void main(String[] args) {
		
		int fact = 1;
	
	for(int i=1 ; i<= input ; i++) {
		
		fact = fact * i;
		
	}
 System.out.println(fact);
 
 // sum of 5 numbers : 1 + 2 + 3 + 4 + 5 = 15
 
   int sum = 0;
   
   for(int i=1 ; i<= input ; i++) {
	   
	   sum = sum + i;
	   
   }  
   
   System.out.println(sum);
	
	}
	

}
