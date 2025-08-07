import java.io.BufferedReader; //java.io.* - to import all packages
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    void getDetails() {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Input the asked details");
        
        System.out.println("Enter Roll Number:");
        int rollNo = Integer.parseInt(sc.readline());
        
        System.out.println("Enter Name:");
        String name = sc.readline();
        
        System.out.println("Enter Age:");
        int age = Integer.parseInt(sc.readline());
        
        System.out.println("Enter City:");
        String city = sc.readline();
        
        System.out.println("Enter Course:");
        String course = sc.readline();
        
        System.out.println("Enter marks for 5 subjects:");
        
        System.out.print("Subject 1: ");
        int mark1 = Integer.parseInt(sc.readline());
        
        System.out.print("Subject 2: ");
        int mark2 = Integer.parseInt(sc.readline());
        
        System.out.print("Subject 3: ");
        int mark3 = Integer.parseInt(sc.readline());
        
        System.out.print("Subject 4: ");
        int mark4 = Integer.parseInt(sc.readline());
        
        System.out.print("Subject 5: ");
        int mark5 = Integer.parseInt(sc.readline());
        
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = total / 5.0;
        
        System.out.println("\n--- Inputted Student Details ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Course: " + course);
        
        System.out.println("\nMarks:");
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
        System.out.println("Subject 4: " + mark4);
        System.out.println("Subject 5: " + mark5);
        
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

class Mainclass {
    public static void main(String[] args) {
        Student st = new Student();
        st.getDetails();
    }
}