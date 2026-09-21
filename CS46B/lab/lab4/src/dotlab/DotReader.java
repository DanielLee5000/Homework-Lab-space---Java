package dotlab;

import java.io.*;

public class DotReader {

    private BufferedReader br;

    public DotReader(BufferedReader br) {
        this.br = br;
    }

    public Dot readDot() throws IOException, DotException{
        String line = br.readLine();

        if (line == null){
            return null;
        }

        String[] colorString = line.split(",");

        if (colorString.length != 4){
            DotException de = new DotException("DotException, invalid input");
            throw de;
        }

        String color = colorString[0];
        int x = Integer.parseInt(colorString[1]);
        int y = Integer.parseInt(colorString[2]);
        int radius = Integer.parseInt(colorString[3]);
        

        return new Dot(color, x, y, radius);
    }

}
