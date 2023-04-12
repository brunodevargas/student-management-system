package studentdatabaseapp;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.enroll();
        std1.payTuition();
        System.out.println(std1.toString());
        // Ask how many users we want to add

        // Create n numbers of new students
    }
}