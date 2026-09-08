package oops.variables.task2;

public class product {
    String pname;
    int pid;
    String pcolor;

    public void setData(String pname, int pid, String pcolor) {
        this.pname = pname;
        this.pid = pid;
        this.pcolor = pcolor;
    }

    public void getData() {
        System.out.println("============PRODUCT============");
        System.out.println("Product name is: " + pname);
        System.out.println("Product ID is: " + pid);
        System.out.println("Product color is: " + pcolor);
    }
}
