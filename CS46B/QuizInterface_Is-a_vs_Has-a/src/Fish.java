import java.util.*;
// fix by implementing interface Comparable<Fish>
// xxx your codes
public class Fish implements  Comparable<Fish> { 
    protected double length;

    public Fish (double x ) { length = x; }
    @Override 
    public String toString () {
       return "length=" + length;
    }
    @Override
    public boolean equals (Object o) { // fix by overridding equals
      if (this == o){
         return true;
      }

      if (!(o instanceof Fish)){
         return false;
      }

      Fish other = (Fish) o;
      return Double.compare(length, other.length) == 0;
    }

    @Override
    public int compareTo (Fish o) { // fix by adding compareTo
      return Double.compare(this.length, o.length);
    }

 public static void main(String[] args) {
    double[] arr = {10.0, 15.0, 12.0, 11.0, 3.0};
    ArrayList<Fish> fish = new ArrayList<Fish>();
    for (int i=0; i < arr.length; ++i ) {
       fish.add( new Fish( arr[i] )) ;
    }
    TreeSet<Fish> sortedFish = new TreeSet<Fish>(fish);
       System.out.println ( sortedFish ); 
    }
}