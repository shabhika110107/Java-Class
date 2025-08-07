import java.util.Scanner;

class Student {
    void getDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the asked details");
        
        System.out.println("Enter Roll Number:");
        int rollNo = sc.nextInt();
        
        System.out.println("Enter Name:");
        String name = sc.next();
        
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        
        System.out.println("Enter City:");
        String city = sc.next();
        
        System.out.println("Enter Course:");
        String course = sc.next();
        
        System.out.println("Enter marks for 5 subjects:");
        
        System.out.print("Subject 1: ");
        int mark1 = sc.nextInt();
        
        System.out.print("Subject 2: ");
        int mark2 = sc.nextInt();
        
        System.out.print("Subject 3: ");
        int mark3 = sc.nextInt();
        
        System.out.print("Subject 4: ");
        int mark4 = sc.nextInt();
        
        System.out.print("Subject 5: ");
        int mark5 = sc.nextInt();
        
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
        System.out.println("Subject 4: " + mark4);\\\\\\\\\\\\\\\\\\\\\jm\]a
        System.out.println("Subject 5: " + mark5);
        
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.getDetails();
    }
}