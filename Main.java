import java.util.Date;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello There!");
        System.out.println("Date: " + new Date());
        System.out.println("This is after commit 2.");

        Student student = new Student();
        student.getStudent();
        
        System.out.println("Let's test after pushing to ec2");

        System.out.println("Did a good job while integrating this app from local to EC2 to Jenkins!");
    }
}