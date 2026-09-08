package callByValue;

public class employ {
    int age;
    double salary;

    public void setDetails(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    public String getDetails() {
        return "Age is: " + this.age + "\tSalary is: " + salary;
    }
}
