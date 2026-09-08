package callByReference;

public class p1Service {
 public static void setDetails(p1 x,int age,double salary ){
   x.age =age;
   x.salary=salary;
 }
 public static String getDetails(p1 x) {
   return "Age is: "+x.age+"\tSalary is: "+x.salary;
 }
}
