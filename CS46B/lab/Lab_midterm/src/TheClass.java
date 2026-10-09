import java.io.*;
class InvalidLengthException extends Exception { public InvalidLengthException(String msg) { super(msg); } }
public class TheClass {
    int retrieveATextLine(File aFile) throws IOException, InvalidLengthException {
        try (BufferedReader br = new BufferedReader(new FileReader(aFile))) {
            String s = br.readLine(); int len = (s == null) ? 0 : s.length();
            if (len >= 10) return len; else throw new InvalidLengthException(String.valueOf(len));
        }
    }
    int callRetrieveATextLine(File aFile) {
        try { return retrieveATextLine(aFile); }
        catch (InvalidLengthException e) { return -2; } catch (IOException e) { return -1; }
    }
}