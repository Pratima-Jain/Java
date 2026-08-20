package collectionFramework;
import java.util.Set;
import java.util.LinkedHashSet;

public class p4{
    public static void main(String[] args){
        Set s = new LinkedHashSet();
        
        s.add(34);
        s.add(40);
        s.add(112);
        s.add(90);
        s.add(67);
        System.out.println(s);
        System.out.println(s.contains(50));


    }
    
}
