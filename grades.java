import java.util.Scanner;


public class grades
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int students,i,j;
		double sum = 0,lowest,highest;
		System.out.println("Input number of students : ");
		students = sc.nextInt();
		
		double[] sGrades = new double[students];
		
		for (i=0;i<students;i++)
		{
			System.out.println("Enter grade of student #"+(i+1));
			sGrades[i]=sc.nextDouble();
		}
		
		for (i=0;i<students;i++)
			sum += sGrades[i];
		
		System.out.println("Average= "+(sum/students));
		
		highest = lowest = sGrades[0];
		for (i=1;i<students;i++)
		{
			if (highest < sGrades[i])
				highest = sGrades[i];
			else if (lowest > sGrades[i]);
				lowest = sGrades[i];
		}
		System.out.println("Highest Grade = "+highest);
		System.out.println("Lowest Grade = "+lowest);
		
		
		
		
	}
}