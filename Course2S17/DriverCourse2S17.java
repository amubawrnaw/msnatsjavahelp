/* This program assigns classes and one faculty member. 
 * It also adds students to the classes offered.
 * Driver Template: Lim-Cheng N. 
 * @author: Giselle Nodalo S17
 * Date Created: June 22, 2016
 */

import java.util.Scanner;

public class DriverCourse2S17
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		Course2S17 c = new Course2S17("OBJECTP", "S17B", "G302B");
		
		int j, classes; 
		String Code, Sec, Rm;
		
		//Create a Series of Classes offered
		System.out.print("Enter Number of Classes to be created: ");
		classes = s.nextInt();
		s.nextLine();
		
		Course2S17[] arrCourse = new Course2S17[classes];
		for(j = 0; j < classes; j++){
			
			System.out.println("\nClass " + (j+1));
			System.out.print("Enter Course Code: ");
			Code = s.nextLine();
			
			System.out.print("Enter Section: ");
			Sec = s.nextLine();
			
			System.out.print("Enter Room: ");
			Rm = s.nextLine();

			arrCourse[j] = new Course2S17(Code, Sec, Rm);
			
		}
		
		//Assign a teacher
		String tName;
		System.out.print("\nEnter Name of Faculty: ");
		tName = s.nextLine();
		TeacherS17 t = new TeacherS17(tName);
		c.assignFaculty(t);
		
		//Enter Student objects
		int n, i;
		System.out.print("\nEnter number of students:");
		n = s.nextInt();
		StudentS17[] dlsuS = new StudentS17[n];
		s.nextLine();
		
		String name;
		int id;
		for(i = 0; i < dlsuS.length; i++){
			System.out.println("Student " + (i+1));
			System.out.print("Enter id number :");
			id = s.nextInt();
			s.nextLine();
			System.out.print("Enter name of student: ");
			name = s.nextLine();
			
			dlsuS[i] = new StudentS17(id, name);
			c.addStudent(dlsuS[i]); //add student to class list
			
		}
		
		//Display contents of the class offered and assigned faculty
		int k;
		System.out.println("\n\nCourses Offered: ");
		for(k = 0; k < classes; k++){
			System.out.println((k+1)+ ". " + arrCourse[k].toString());
		}
		System.out.println("\nFaculty Assigned: " + c.getFaculty().toString());
		
		//Student Select Course
		int courses;
		int CourseIndex;
		for(i = 0; i < dlsuS.length; i++){
			System.out.println(" Student " + (i+1) + ": " + dlsuS[i].getName());
			System.out.print("Number of courses to enter: ");
			courses = s.nextInt();
			s.nextLine();
			
			for(j = 0; j < courses; j++){
				System.out.print("Enter Course Index: ");
				CourseIndex = s.nextInt();
				arrCourse[CourseIndex-1].addStudent(dlsuS[i]);
				s.nextLine();
			}
			System.out.println("\n");
			
		}
		
		//Display Class List for each class offered. 
		int b; 
		System.out.println("\nClass Lists\n");
		for(b = 0; b < classes; b++){			
			StudentS17[] temp = arrCourse[b].getClasslist();
			System.out.println("Course " + arrCourse[b].getCode() +
			" has the following students: ");
		
			for(i = 0; i < temp.length && temp[i] != null; i++)
				System.out.println(temp[i].getID() + " " + temp[i].getName());
			System.out.println();
		}
		//Release objects
		s.close();
		c = null;
		dlsuS = null;
		
	}
}
	