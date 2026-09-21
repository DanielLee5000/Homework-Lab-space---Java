package dotlab;

public class Dot {

    private static String[] LEGAL_COLOR_NAMES = {
            "RED", "YELLOW", "BLUE", "CYAN", "GREEN", "MAGENTA", "ORANGE", "BLACK"
    };

    private String Color;
    private int X, Y;
    private int Radius;


    public Dot(String Color, int X, int Y, int Radius) throws IllegalArgumentException{
        String colorName = Color;
        boolean colorExist = false;

        try {
            for (String string : LEGAL_COLOR_NAMES){
                if (colorName.equals(string)){
                    colorExist = true;
                    break;
                }
            }

            if (!(colorExist)){
                throw new IllegalArgumentException(colorName + " is a bad color name");
            }

        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        
        this.Color = Color;
        this.X = X;
        this.Y = Y;
        this.Radius = Radius;
    }

    public String getColorName(){
        return Color;
    }

    public int getX(){
        return X;
    }

    public int getY(){
        return Y;
    }

    public int getRadius(){
        return Radius;
    }

    @Override 
    public String toString(){
        return Color + X + Y + Radius;
    }

    public static void main(String[] args) {
        Dot dot = new Dot("RED", 2, 2, 2);
        System.out.println(dot.toString());
    }
}
