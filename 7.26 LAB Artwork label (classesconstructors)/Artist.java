/*Daniel Lee, CS1A, 3/17/2025, Dr.Harden, 7.26 LAB: Artwork label (classes/constructors)
 * Initial file comment:
 * The program will help user to set and print Artist info.
 * With three variables artistName, birthYear and deathYear.
 * And it will print out the info of artistName, birthYear and deathYear, if there is any part don't have input or get wrong input.
 * The program will use if-else statement to classificate what should it print.
 */

public class Artist {
   private String artistName;
   private int birthYear;
   private int deathYear;

   public Artist(){
      artistName = "unknown";
      birthYear = -1;
      deathYear = -1;
   }

   public Artist(String artistName, int birthYear, int deathYear){
      this.artistName = artistName;
      this.birthYear = birthYear;
      this.deathYear = deathYear;
   }
   
   public String getName(){
      return artistName;
   }

   public int getBirthYear(){
      return birthYear;
   }

   public int getDeathYear(){
      return deathYear;
   }

   public void printInfo(){
      System.out.print("Artist: " + artistName + " ");
      if (birthYear > 0 && deathYear > 0) {
         System.out.print("(" +birthYear + " to " + deathYear + ")");
      }else if (birthYear > 0){
         System.out.print("(" + birthYear + " to present" + ")");
      }else{
         System.out.print("(" + "unknown" + ")");
      }
   }
}