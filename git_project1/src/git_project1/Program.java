package git_project1;

import git_project1.model.Classy;

public class Program 
{
	public static void main(String[] args) 
	{		
		Classy classy = new Classy();
		int sum = 0;
		int diff = 0;
		
		sum = classy.sum();
		diff = classy.diff();
				
		System.out.println("The sum is: " + sum);	
		
		System.out.println("The diff is: " + diff);
	}
}
