package git;

import java.util.Scanner;

public class Second {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in); 
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Given number is EVEN number");
		}
		else
		{
			System.out.println("Given number is ODD number");
		}

	}

}