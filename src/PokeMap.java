
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;


public class PokeMap {

    public static void main(String[] args) {
        HashMap<String, HashSet> pm =new HashMap<String, HashSet>();
        pm.put("Electric", new HashSet<Pokemon>());
        pm.put("Water", new HashSet<Pokemon>());
        pm.put("Fire", new HashSet<Pokemon>());
        pm.put("Plant", new HashSet<Pokemon>());
        //add pikachu to electric
        pm.get("Electric").add(new Pokemon(25,"Pikachu"));
        pm.get("Electric").add(new Pokemon(26,"Raichu"));
        pm.get("Water").add(new Pokemon(6,"Squirtle"));
        pm.get("Water").add(new Pokemon(12,"Blastoise"));
        pm.get("Fire").add(new Pokemon(7,"Charizard"));
        System.out.println(pm);
        System.out.println("The water pokemon are");
        Iterator it= pm.get("Water").iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("The types I have are: ");
        for (Map.Entry<String, HashSet> entry : pm.entrySet()) {
            String type = entry.getKey();
            System.out.println(type+", ");
        }
        System.out.println("Remove Blastoise");
        
//This was when it was String, Pokemon
//        pm.put("Electric", new Pokemon(25,"Pikachu"));
//        pm.put("Plant", new Pokemon(1,"Bulbasaur"));
//        pm.put("Fire", new Pokemon(7,"Charizard"));
//        pm.put("Water", new Pokemon(6,"Squirtle"));
//        pm.put("Electric", new Pokemon(26,"Raichu"));
//        System.out.println(pm);
//        Pokemon water =pm.get("Water");
//        System.out.println(water);
        
    }
    
}
