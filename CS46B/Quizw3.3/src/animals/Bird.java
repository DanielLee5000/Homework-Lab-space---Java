package animals;
public class Bird {
      int wingspan;
      String species;
           public Bird(int wingspan,String species) {
            this.wingspan = wingspan;
            this.species = species;
      }     
      // @Override
      public boolean equals(Object o) { //?
            Bird b = (Bird) o;
            return wingspan == b.wingspan && species.equals(b.species);
      }

      public int hashCode() {
            return (int)(wingspan*Math.random());
      }     
      public static void main(String[] args) {
            Bird blue = new Bird(10,"bluebird");
            Bird bluey = new Bird(10,"bluebird");
            Object o = new Bird(10,"bluebird");
           System.out.println(blue == bluey);
           System.out.println(blue.equals(bluey));
           System.out.println(blue.equals(o));
      }
}