package oops.variables.task2;

public class laptop {
    String lname;
    String lcolor;
    double lprice;

    public void setData(String lname, String lcolor, double lprice) {
        this.lname = lname;
        this.lcolor = lcolor;
        this.lprice = lprice;
    }

    public void getData() {
        System.out.println("============LAPTOP============");
        System.out.println("Laptop name is: " + lname);
        System.out.println("Laptop color is: " + lcolor);
        System.out.println("Laptop price is: " + lprice);
    }

}
