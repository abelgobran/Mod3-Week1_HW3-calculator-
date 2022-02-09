package m3;
import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Today is the day");
		
		Scanner input = new Scanner(System.in);
		//1. Write a Java program to display the total numbers of characters in a 
		//user entered String
		System.out.println("Enter a String....");
		String in =input.nextLine();
			
		System.out.println(in.length());
		System.out.println("type something long");
		
		//2. Using a while loop, print each character of the string ‘Hello World’
		int i = 0;
		String in2 = input.nextLine();
		while(i<in2.length()) {
			System.out.println(in2.charAt(i)+ " ");
			i++;
		}
		
		//3. Take two strings form the user and compare if they're equal or not. 
		//Display a message saying the strings are equal or not equal
		 
		System.out.println("enter String...");
		String input1 = input.nextLine();
		System.out.println("enter one more...");
		String input2= input.nextLine();
		
		if(input1.equals(input2)) {
			System.out.println("both strings are same");
		}else if (input1.equalsIgnoreCase(input2)){
			System.out.println("they are Almost the same");
		}else
			System.out.println("not same");
		
		//4. Print a given string in reverse order without using the reverse( ) method
		System.out.println("Entetr another String to see it in reverse");
		String forward = input.nextLine();
		
		for (int j=forward.length() - 1;j>=0;j--) {
			System.out.println(forward.charAt(j));
			
		}
		
		
		
	}

}
