package ebatson3_lab04_q2; //Package name

import java.util.Scanner; //Importing Scanner for user input

public class Main {
	public static void main(String[] xyz) {
		int size = 0, numofReps; //Declaring and naming variables
		Scanner input = new Scanner(System.in);
		String s = " "; //Declaring and naming string
		String n = "# "; //Declaring and naming string
	
		System.out.println("Please enter the size: "); //Prompts user to input the size
		size = input.nextInt(); //Assigns this value to the variable
	
		do {
			System.out.println("\n Please enter the number of repititions (gretaer than zero)"); //Asks for number of repetitions
			numofReps=  input.nextInt(); //Assigns this value to the variable
			
			if (numofReps==0)
				break; //Ends the program if input is zero
			
			for(int k = size; k>0 ; k--) {
				
			if (k==size || k==1) {
				for (int i = k; i>=0; i--) 
					System.out.print(s); //Prints out the string s
				for (int j = 0; j < size ; j++)
					System.out.print(n); //Prints out the string n
				for (int l = 1; l < numofReps; l++) {
					System.out.print(s+s); // Prints out string s and then string s again
					
					for (int o = 0; o<size; o++)
						System.out.print(n); //Outputs string n
					}	
				}
			else {
				for (int i = k; i>=0 ; i--) 
					System.out.print(s); //Prints string s, which is the whitespace between sides
				for (int j = 0; j<size; j++) {
					if(j==(size-1) || j==0)
						System.out.print(n); //Prints out string n, which is the symbol at either end of a side
					else
						System.out.print("   "); // Prints out whitespace between the parallelograms
				}
				for (int l=1; l<numofReps; l++) {
					System.out.print(s+s); // This repeats string s, whitespace
					
					for (int o = 0; o<size; o++) 
						if (o==0 || o==(size-1))
							System.out.print(n); //Prints out string n, which is the symbol at either end of a side
						else
								System.out.print("   "); // Prints out whitespace between the parallelograms
				}
			}
					
			System.out.println(""); //This outputs the space between the repetitions
		}
		}
		while (numofReps!=0); //Only outputs this when numofReps isn't zero
			System.out.println("Goodbye!"); //Outputs goodbye to the user
			
		input.close();	//Closes the program
		}	
	}

