package stacklab;

import java.io.*;
import java.util.Stack;


public class Lister {
	
	private File file;
	private boolean showHidden;
	
	public Lister(File f, boolean showH) {
		file = f;
		showHidden = showH;
	}
	
	public void list() {
		//listFilesRecurse(file);
		listFilesStack(file);
	}
    
	private void listFilesRecurse(File f) {
		if(f.isDirectory()) {				//check the file
			File[] files = f.listFiles();   //get the files
			for(File file:files) {          //go through every object
				listFilesRecurse(file);		//recursive call
			}
		}
		else {
			if(showHidden || !f.isHidden()) {       //base case
				System.out.println(f.getName());    //print file name
			}
		}
			
	}
    
    //fill this in
    private void listFilesStack(File f) {
		Stack<File> stack = new Stack<>();
		stack.push(f);

		while(!stack.isEmpty()) {
			File file = stack.pop();
			if(file.isDirectory()) {
				listFilesStack(file);
			}
			else {
				if(showHidden || !file.isHidden()) {
					System.out.println(file.getName());
				}
			}
		}
    }
	
	public static void main(String[] args) {
        //replace with a directory of your own
        String directory = "/Users/agc/eclipse-workspace/homework5";
		File dir = new File(directory);
		Lister l = new Lister(dir,true);
		l.list();
	}

}
