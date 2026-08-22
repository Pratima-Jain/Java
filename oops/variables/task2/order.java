package oops.variables.task2;

public class order {
    int oid;
    String oname;

    public void setData(int oid, String oname) {
        this.oid = oid;
        this.oname = oname;
    }

    public void getData() {
        System.out.println("============ORDER============");
        System.out.println("Order ID is: " + oid);
        System.out.println("Order name is: " + oname);
    }

}
