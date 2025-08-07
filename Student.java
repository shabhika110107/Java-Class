//name , roll no , dept , mobile , address, email , 5 sub mark , dob ,total , avg , grade

import java.util.Scanner;
public class Student{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ur name:");
		String name =sc.nextLine();
		System.out.print("Enter ur rollno:");
		int rollno =sc.nextInt();
                sc.nextLine();
		System.out.print("Enter ur department:");
		String dept=sc.nextLine();
		System.out.print("Enter ur mob.no:");
		int mobno =sc.nextInt();
                sc.nextLine();
		System.out.print("Enter ur address:");
		String address =sc.nextLine();
		System.out.println("Enter ur email:");
		String email =sc.nextLine();
		System.out.println("Enter ur dob:");
		String dob =sc.nextLine();
		System.out.println("Enter ur m1:");
		int m1 =sc.nextInt();
		System.out.println("Enter ur m2:");
 		int m2 =sc.nextInt();
		System.out.println("Enter ur m3:");
 		int m3 =sc.nextInt();
		System.out.println("Enter ur m4:");
 		int m4 =sc.nextInt();
		System.out.println("Enter ur m5:");
 		int m5 =sc.nextInt();

		int total = m1+m2+m3+m4+m5;
		float avg=total/5;
		
		string grade;
		if(avg>=90.0)
 			grade='A';
		else if(avg>=80.0)
 			grade='B';
		else if(avg>=70.0)
 			grade='C';
		else if(avg>=60.0)
 			grade='D';
		else
 			grade='F';
                System.out.println("You name is " +name);
 		System.out.println("You rollno is " +rollno);
 		System.out.println("You dept is " +dept);
 		System.out.println("You mob.no is " +mobno);
 		System.out.println("You address is " +address);
 		System.out.println("You email is " +email);
 		System.out.println("You dob is:" +dob);
 		System.out.println("You total is: " +total);
 		System.out.println("You avg is " +avg);
 		System.out.println("You grade is " +grade);
	}
}






		