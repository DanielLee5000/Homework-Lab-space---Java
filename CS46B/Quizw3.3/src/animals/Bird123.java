package animals;
import java.util.*;
public class Bird implements Comparable<Bird> { 
    // xxx fill in missing codes

      int wingspan;
      String species;
      public Bird(int wingspan, String species) {
        this.wingspan = wingspan;
        this.species = species;
      }    

      @Override 
      public String toString () {
        String f = "wingspan=%d, species = %s";
        f = String.format (f, wingspan, species);
        return f;
      }
      @Override 
      public int compareTo(Bird that) { 
            // xxx fill in missing codes
            if (this.wingspan != that.wingspan){
                return this.wingspan - that.wingspan;
            }
            else{
                return this.species.compareTo(that.species);
            }
      }


      @Override 
      public boolean equals(Object o) { 
            // xxx fill in missing codes
            if (!(o instanceof Bird)){
                return false;
            }
            
            Bird that = (Bird) o;
            return this.compareTo(that) == 0;
      }


      @Override 
      public int hashCode() {
            return (int)(wingspan*Math.random());
      }     
      public static void main(String[] args) {
            Bird blue = new Bird(30,"bluebird");
            Bird bluey = new Bird(10,"bluebird");
            Bird o = new Bird(20,"bluebird");
            Bird snow = new Bird(20,"snowbird");
            TreeSet<Bird> birds = new TreeSet<> ();
            birds.add ( blue);
            birds.add (bluey);
            birds.add (o);
            birds.add(snow);
            birds.stream().forEach(System.out::println);
      }
}