class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age  = age;
    }
    void showRole() {
        System.out.println("I am a Person in the school system.");
    }
}
class Teacher extends Person {
    String subject;
    double salary;
    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary  = salary;
    }
    @Override
    void showRole() {
        System.out.println("I am a Teacher. I teach students.");
    }
    void displayInfo() {
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Subject : " + subject);
        System.out.println("Salary  : Rs. " + salary);
    }
}
class Student extends Person{
    int rollNumber;
    String course;
    public Student(String name, int age, int rollNumber, String course) {
        super(name, age);
        this.rollNumber = rollNumber;
        this.course     = course;
    }
    @Override
    void showRole(){
        System.out.println("I am a Student. I study subjects.");
    }
    void displayInfo(){
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Roll No. : " + rollNumber);
        System.out.println("Course   : " + course);
    }
}
public class SchoolAdministrationSystem{
    public static void main(String[] args){
        Teacher t1 = new Teacher("Alice Sharma", 35, "Mathematics", 45000);
        Teacher t2 = new Teacher("Bob Verma",    42, "Physics",     52000);
        Student s1 = new Student("Rahul Singh", 20, 101, "B.Tech CSE");
        Student s2 = new Student("Priya Patel", 19, 102, "B.Tech AI-ML");
        System.out.println("    SCHOOL ADMINISTRATION SYSTEM        ");
        System.out.println("\n--- Teacher Records ---");
        System.out.println("\nTeacher 1:");
        t1.displayInfo();
        System.out.println("\nTeacher 2:");
        t2.displayInfo();
        System.out.println("\n--- Student Records ---");
        System.out.println("\nStudent 1:");
        s1.displayInfo();
        System.out.println("\nStudent 2:");
        s2.displayInfo();
        System.out.println("  POLYMORPHISM DEMO  (Person[] Array)   ");
        Person[] people = new Person[4];
        people[0] = t1;
        people[1] = t2;
        people[2] = s1;
        people[3] = s2;
        for (Person p : people) {
            p.showRole();
        }
    }
}




// ...OUTPUT...

//     SCHOOL ADMINISTRATION SYSTEM        

// --- Teacher Records ---

// Teacher 1:
// Name    : Alice Sharma
// Age     : 35
// Subject : Mathematics
// Salary  : Rs. 45000.0

// Teacher 2:
// Name    : Bob Verma
// Age     : 42
// Subject : Physics
// Salary  : Rs. 52000.0

// --- Student Records ---

// Student 1:
// Name     : Rahul Singh
// Age      : 20
// Roll No. : 101
// Course   : B.Tech CSE

// Student 2:
// Name     : Priya Patel
// Age      : 19
// Roll No. : 102
// Course   : B.Tech AI-ML
//   POLYMORPHISM DEMO  (Person[] Array)
// I am a Teacher. I teach students.
// I am a Teacher. I teach students.
// I am a Student. I study subjects.
// I am a Student. I study subjects.
