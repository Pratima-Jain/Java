package oops.staticBlock;

public class p1 {
    static int x;
	static{
		test();
		System.out.println("This is static block-1 x is: "+x);
		x=45;
	}
	public static void main(String[] args){
		System.out.println("This is main method x is: "+x);
		test();
		System.out.println("============");
		System.out.println("Car x is: "+car.x);
		System.out.println("============");
		System.out.println("Car x is: "+car.x);
	}
	public static void test(){
		System.out.println("This is test method x is: "+x);
	}
	static{
		System.out.println("This is static block-2 x is: "+x);
	}
}
