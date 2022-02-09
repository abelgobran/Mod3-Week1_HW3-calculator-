package m3;


import java.util.Scanner;
public class Mod3Week1_HW3calculator {
	
	
	
	 static int addNums(int x, int y) {
		 
		return x+y;
	}
	
	static int subtractNums(int x, int y) {
		return x-y;
	}
	
	static int multiplyNums(int x,int y) {
		return x*y;
	}
	
	static int divideNums(int x,int y) {
		
		return x/y;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number from the selection...");
		System.out.println( "OPTIONS");
		System.out.println(" 1.Add /n 2.Subtract /n 3.Multiply /n 4.Division /n 5.Exit");
		int inp = input.nextInt();
		System.out.println("");
		System.out.println("Enter first number");
		int input1 = input.nextInt();
		System.out.println("Enter second number...");
		int input2 = input.nextInt();

		
		
		
		switch (inp){		
		case 1: int addIt =addNums(input1,input2);
				System.out.println(addIt);
				break;
		case 2: int subtractIt = subtractNums(input1,input2);
				System.out.println(subtractIt);
				break;
		case 3: int multiplyIt = multiplyNums(input1,input2);
				System.out.println(multiplyIt);
				break;
		case 4: int divideIt = divideNums(input1,input2);
				System.out.println(divideIt);
				break;
		case 5: System.out.println("thanks for using");
				
				break;
		
		}System.exit(0);
			

	}

}

/*Build a calculator:

Write a program to create a calculator that can Add, Subtract, Multiply, 
and Divide 2 numbers entered by the user. Also, add an option to exit out from the program.

  OPTIONS
1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit

1. Write different methods for each module (add, subtract, multiply, and divide).
2. Use switch/case to call the particular method.
3. Take input inside the methods to perform the related operation.
4. Return the answer and display it inside the main method.
5. Display a default message (ex. "Invalid Entry, Try Again") if 
	any number other than 1-5 is entered by the user*/
