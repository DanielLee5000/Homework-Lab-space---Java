/*Daniel Lee, CS1A, 3/17/2025, Dr.Harden, 7.26 LAB: Artwork label (classes/constructors)
 * Initial file comment:
 * The program will help user to set and print Artwork info.
 * With two variables and one artist object comes from Artist program.
 * This program will print out the info of Artwork, after call the printinfo function of Artist.
 */

public class Artwork {
   private String title;
   private int yearCreated;

   private Artist artist;

   public Artwork(){
      title = "unknown";
      yearCreated = -1;
   }

   public void setTitle(String userTitle){
      title = userTitle;
   }

   public void setYCreated(int userYearCreated){
      yearCreated = userYearCreated;
   }
   
   public String getTitle(){
      return title;
   }

   public int getYearCreated(){
      return yearCreated;
   }

   public Artwork(String title, int yearCreated, Artist artist) {
        this.title = title;           
        this.yearCreated = yearCreated;   
        this.artist = artist;            
    }

    public void printInfo(){
      artist.printInfo();
      System.out.println();
      System.out.println("Title: " + title + ", " + yearCreated); 
    }                                                                                       

}
