package oops.variables.task1;

public class animal {
   String name;
   int age;
   String color;
   double weight;

   // public void setData(String a, int b, String c) {
   // name = a;
   // age = b;
   // color = c;
   // }
   // public void getData(){
   // System.out.println("============ANIMAL============");
   // System.out.println("Name of Animal is:"+name);
   // System.out.println(a1.age);
   // System.out.println(a1.color);
   // }
   public void printTotalWeight() {
      double total = weight * age;
      System.out.println(total);
   }

}
