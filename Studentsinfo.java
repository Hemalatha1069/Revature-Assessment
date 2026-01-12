package assignments;

import java.util.Scanner;
public class Studentsinfo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student Id");
		int sid = sc.nextInt();
	    sc.nextLine();
	    
	    System.out.println("Enter Student name :");
        String sname = sc.nextLine();
	    
        System.out.println("Enter marks of the student (0 to 100):");
        int marks = sc.nextInt();
        
        System.out.println("Enter fee paid status (true/false):");
        boolean feePaid = sc.nextBoolean();

        String result;
        if (marks >= 40) 
        {
            result = "Student Passed";
        } 
        else 
        {
            result = "Student Failed";
        }
        
        char grade;
        if (marks >= 85) 
        {
            grade = 'A';
        } 
        else if (marks >= 70) 
        {
            grade = 'B';
        } 
        else if (marks >= 50) 
        {
            grade = 'C';
        } 
        else 
        {
            grade = 'D';
        }
        
        String certificateEligibility;
        if (marks >= 40 && feePaid) 
        {
            certificateEligibility = "Eligible for Certificate";
        } 
        else 
        {
            certificateEligibility = "Not Eligible for Certificate";
        }
        
        String course;
        switch (grade) 
        {
        case 'A':
            course = "Data Science";
            break;

        case 'B':
            course = "Java Full Stack";
            break;

        case 'C':
            course = "Web Development";
            break;

        case 'D':
            course = "Basic Programming";
            break;

        default:
            course = "Counseling";
        }
        
        System.out.println("\n===== STUDENT SUMMARY =====");
        System.out.println("Student ID   : " + sid);
        System.out.println("Student Name : " + sname);
        System.out.println("Marks        : " + marks);
        System.out.println("Result       : " + result);
        System.out.println("Grade        : " + grade);
        System.out.println("Fee Paid     : " + feePaid);
        System.out.println("Certificate  : " + certificateEligibility);
        System.out.println("Course       : " + course);
	}

}
