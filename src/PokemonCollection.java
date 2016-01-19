
import java.util.HashSet;

public class PokemonCollection {

    public static void main(String[] args) {
        HashSet <Pokemon> ball= new HashSet<Pokemon>();
        ball.add(new Pokemon(25,"Pikachu"));
        ball.add(new Pokemon(26,"Riachu"));
        ball.add(new Pokemon(1,"Bulbasaur"));
        ball.add(new Pokemon(25,"Pikachu"));
        System.out.println(ball);
        
    }
    
}
