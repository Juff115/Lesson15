import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.ImageIcon;

public class Conference {
    private String name;
    private String desc;
    private HashSet<Guest> people;
    private ImageIcon image;
    
    public Conference(String n, String d, String img){
        name=n;
        desc=d;
        image = new ImageIcon(getClass().getResource(img));
        people = new HashSet();
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public HashSet<Guest> getPeople() {
        return people;
    }

    public ImageIcon getImage() {
        return image;
    }
    
    public boolean signup(Guest g){
        if(people.contains(g)) return false;
        else{
            people.add(g);
            return true;
        }
    }
    
    public boolean remove(Guest g){
        if(people.contains(g)){
            people.remove(g);
            return true;
        }
        else return false;
    }
    
    public void save(PrintWriter pw, String key){
        Iterator it = people.iterator();
        while(it.hasNext()){
            pw.println(key);
            pw.println(it.next());
        }
        
    }
    
}
