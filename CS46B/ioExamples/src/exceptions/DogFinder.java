package exceptions;

import java.io.*;
import java.util.HashSet;

public class DogFinder {
	
	public static HashSet<String> dogBreeds = new HashSet<String>();
	
	public static void populateBreeds() {
		dogBreeds.add("Labrador");
		dogBreeds.add("Labradoodle");
		dogBreeds.add("Golden Retriever");
		dogBreeds.add("Terrier");
		dogBreeds.add("Poodle");
		dogBreeds.add("Australian Shephard");
		dogBreeds.add("Border Collie");
		dogBreeds.add("Bernese Mountain Dog");
		dogBreeds.add("Chihuahua");
	}
	
	public static void addDog (HashSet<String> dogs,String s) throws DogException{
		if(dogBreeds.contains(s)) {
			dogs.add(s);
		}
		else {
			throw new DogException(s + " isn't a valid dog breed.");
		}
	}
	
	public static HashSet<String> readDogs() throws DogException {
		HashSet<String> allDogs = new HashSet<String>();
		File dirf = new File("data");
		for (int i=1; i<=2; i++) {
			File listf = new File(dirf, "Day" + i + ".txt");
			try {
				FileReader fr = new FileReader(listf);
				BufferedReader br = new BufferedReader(fr);
				String line;
				boolean done = false;
				while (!done) {
					line = br.readLine();
					if (line == null)
						done = true;// EOF (end of file)
					else
						addDog(allDogs,line);
		         }
				br.close();
				fr.close();
			}
			catch (FileNotFoundException x) {
				System.out.println("No such file: " + listf);
			}
			catch (IOException x) {
				System.out.println("IO trouble");
			}
		}
		return allDogs;
		
	}
	
	public static void main(String[] args) {
		
		//Experiment with Exceptions but uncommenting out each line
		//and running the code
		//File blah = new File("/users/agc/Desktop");
		//File blah = new File("blah");
		File blah = new File("data/Day1.txt");

		try {
			FileReader fr = new FileReader(blah);
			BufferedReader br = new BufferedReader(fr);
			// System.out.println(br.readLine());
			br.close();
			fr.close();
		}
		catch(IOException ex) {
			System.out.println(ex);
		}
		
		populateBreeds();
		try {
        	String s = "Number of unique breeds: " + readDogs().size() ;
        	System.out.println( s );
		}
		catch(DogException dex) {
			System.out.println(dex.getMessage());
		}
		
		
		

	}

}
