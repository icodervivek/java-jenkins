import java.util.Date;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hello There!");
        System.out.println("Date: " + new Date());
        System.out.println("This is after commit 2.");

        Student student = new Student();
        student.getStudent();
        student.getCourse();
        student.getDepartment();
        student.getKey();
        student.getChoice();
        student.getResult();
        student.getName();
        student.getMoreInfo();
        student.getSubject();
        student.getYear();
        student.getUniversity();
        
        System.out.println("Let's test after pushing to ec2");

        System.out.println("Test 123");

        System.out.println("EC2 not working...");

        System.out.println("Did a good job while integrating this app from local to EC2 to Jenkins!");

        System.out.println("Animal test starting...");
        Animal animal = new Animal();
        animal.setName("Leo");
        animal.setAge(5);
        System.out.println("Animal name: " + animal.getName());
        System.out.println("Animal age: " + animal.getAge());
    }
}
