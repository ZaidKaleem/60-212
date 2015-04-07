package Lab6_P1.Q6;


public class PersonTester {
    public static void main(String[] args){

        //Test input

        Person bob = new Person("Jack Bob", 22, "M");
        System.out.println(bob);
        Student linda = new Student("Linda Brooke", 17, "F", "HS59921", 3.5);
        System.out.println(linda);
        Teacher mrJava = new Teacher("Dave Java", 24, "M", "Computer Science", 51234);
        System.out.println(mrJava);
        UniversityStudent dave = new UniversityStudent
                ("Dave Frosh", 18, "F", "UCB321", 4.0, 1, "English");
        System.out.println(dave);
    }
}
