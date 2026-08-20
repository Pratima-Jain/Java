package oops.constructor;

public class p1Driver {
    public static void main(String[] args){
        p1 o1=new p1();
        p1 o2=new p1();
        p1 o3=new p1();
        p1 o4=new p1();
        System.out.println(o1.toString());
        System.out.println(o2.toString());
        System.out.println(o3.toString());
        System.out.println(o4.toString());

        System.out.println("---------------------------");
        
        
        System.out.println(o1.getDetails());
        System.out.println("---------------------------");
        System.out.println(o2.getDetails());
        System.out.println("---------------------------");
        System.out.println(o3.getDetails());
        System.out.println("---------------------------");
        System.out.println(o4.getDetails());
    }
}
