package callByReference;

public class p1Driver {
    public static void main(String[] args) {
        p1 a=new p1();
        p1 b=new p1();
        p1 c=new p1();
        
        p1Service.setDetails(a,23,30000);       //Call by refrence
        p1Service.setDetails(b,29,29000);
        p1Service.setDetails(c,33,35000);
        
        System.out.println("Employ1 details: "+p1Service.getDetails(a));
		System.out.println("Employ2 details: "+p1Service.getDetails(b));
		System.out.println("Employ3 details: "+p1Service.getDetails(c));
    }
}
