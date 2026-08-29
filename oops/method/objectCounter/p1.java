package objectCounter;

public class p1 {
    static int count = 0;
    {
        count++;
        System.out.println("p1 object " + count + " is created!");
    }
}
