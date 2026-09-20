import java.util.*;
// fix by implementing interface Comparable<Fish>
// xxx your codes
public class Fish ___xxx___ ___xxx___ <___xxx___> { 
    protected double length;

    public Fish (double x ) { length = x; }
    @Override 
    public String toString () {
       return "length=" + length;
    }
    @Override
    public boolean equals (Object o) { // fix by overridding equals
       // xxx
       // your codes 
    }
    @Override
    public int compareTo (Fish o) { // fix by adding compareTo
       // xxx
       // your codes
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