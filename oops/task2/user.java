package oops.task2;

public class user {
    String uname;
    int uage;
    int uid;

    public void setData(String uname, int uage, int uid) {
        this.uname = uname;
        this.uage = uage;
        this.uid = uid;
    }

    public void getData() {
        System.out.println("============USER============");
        System.out.println("User name is: " + uname);
        System.out.println("User age is: " + uage);
        System.out.println("User ID is: " + uid);
    }
}
