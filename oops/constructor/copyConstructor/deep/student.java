package copyConstructor.deep;

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

    // Deep Copy Constructor
    student(student x) {
        this.name = x.name;
        this.rollno = x.rollno;
        address add = new address(x.a.city, x.a.state, x.a.pin);
        this.a = add;
    }

    // public String toString() {

    //     return "Name is: " + name + "\tRollNo is: " + rollno + "\tAddress Details[" + a + "]";
    // }
}
