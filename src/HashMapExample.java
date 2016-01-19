
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String,String> prov = new HashMap<String,String>();
        prov.put("ON", "Toronto");
        prov.put("MB", "Winnipeg");
        prov.put("SK", "Regina");
        prov.put("AB", "Edmonton");
        prov.put("BC", "Vancouver");
        prov.put("BC", "Victoria");
        System.out.println(prov);
        prov.remove("ON");
        System.out.println(prov);
        System.out.println("The capital of BC is: "+ prov.get("BC"));
        Iterator it= prov.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(Map.Entry<String, String> entry : prov.entrySet()){
            String string = entry.getKey();
            String string1 = entry.getValue();
            System.out.println("The capital of "+string +" is ");
        }
    }
    
}
