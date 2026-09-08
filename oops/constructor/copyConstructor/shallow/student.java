package copyConstructor.shallow;

public class student {
    String name;
    int rollno;
    address a;

    student() {

    }

    student(String name, int rollno, address a) {
        this.name = name;
        this.rollno = rollno;
        this.a = a;
    }

    // Shallow Copy Constructor
    student(student x) {
        this.name = x.name;
        this.rollno = x.rollno;
        this.a = x.a;
    }

    // public String toString() {

    //     return "Name is: " + name + "\tRollNo is: " + rollno + "\tAddress Details[" + a + "]";
    // }
}
