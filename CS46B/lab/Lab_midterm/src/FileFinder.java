import java.io.*;
public class FileFinder {
    public static void findFiles(File dir, String ext, PrintWriter pw) {
        File[] files = dir.listFiles(); if (files == null) return;
        for (File f : files) {
            if (f.isFile()) { // Step 2
                if (f.getAbsolutePath().endsWith(ext)) { System.out.println(f); pw.println(f.getAbsolutePath()); }
            } else if (f.isDirectory()) { findFiles(f, ext, pw); } // Step 3 & 4
        }
    }
}