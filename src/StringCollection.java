
import java.util.HashSet;
import java.util.Iterator;

public class StringCollection {

    public static void main(String[] args) {
        HashSet <String> x= new HashSet <String>();
        x.add("Bob");
        x.add("Charlie");
        x.add("Sam");
        x.add("Tom");
        System.out.println(x);
        x.remove("Bob");
        System.out.println(x);
        System.out.println("There are "+x.size()+" people left");
        System.out.println("Removing all people");
        Iterator it= x.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();
        }
        System.out.println("All gone? "+x.isEmpty());
        
    }
    
}
