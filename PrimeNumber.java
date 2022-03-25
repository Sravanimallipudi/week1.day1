package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int input = 13; //Assigning 13 value to input
		
		boolean flag = false; // declaring a boolean variable false 
		
		//for loop start
		
		for(int i=2 ; i<= input/2 ; i++) {
		
		 if (input % i == 0) {
			 
			 flag = true;
			 
			 break;
			 
		 }
		 
		 }
		
		if (flag != true) {
			
			System.out.println("Input is a prime number");
			
			} else {
				
				System.out.println("Input is not a prime number");
			}

	}

}
