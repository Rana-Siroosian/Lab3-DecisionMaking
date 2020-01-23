
import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner (System.in);
		String cont="";
		String name = "";
		
		System.out.print("Please enter your name: ");
		name = scnr.nextLine();
		
		do {
			
			
			System.out.print("Please enter an integer number between 1 to 100: ");
			int userInput = scnr.nextInt();
			
			int remainder = userInput % 2;
			if (userInput < 1 || userInput > 100) {
				System.out.println("Always follow the instructions!");
				break;
			}
			else if (remainder != 0) {
				
				if (userInput > 60) {
						System.out.println(userInput + " Odd and over 60");
				}
				else {	
					System.out.println(userInput + " Odd");
				}
			}

			else if ((remainder == 0) && (userInput > 2 && userInput < 25 )){
				System.out.println("Even and less than 25");
			}
			else if ((remainder == 0) && (userInput > 26 && userInput < 60)) {
				System.out.println("Even");
			}
			else if (remainder == 0 && userInput > 60) {
				System.out.println(userInput + " Even");
			}

			System.out.println("Would you like to continue? y or n");
			cont = scnr.next();

	}	while (cont.equals ("Y") || cont.equals("y")); 
		
		System.out.println("Thank you " + name + ", Goodbye.");
		
		scnr.close();

	}
}
	
