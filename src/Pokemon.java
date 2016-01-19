
public class Pokemon {
    private int id;
    private String name;
    
    public Pokemon(int i, String n){
        id=i;
        name=n;
    }
    
    public String toString(){
        return id +"->"+name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pokemon other = (Pokemon) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
