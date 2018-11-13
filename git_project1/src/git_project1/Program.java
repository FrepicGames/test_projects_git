package git_project1;

import git_project1.model.Classy;

public class Program 
{
	public static void main(String[] args) 
	{		
		Classy classy = new Classy();
		int sum = 0;
		
		sum = classy.sum();
		
		System.out.println("The sum is: " + sum);		
	}
}
