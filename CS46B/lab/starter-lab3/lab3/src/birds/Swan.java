package lab3.src.birds;

public class Swan extends Bird{
    public void glide(){
        System.out.println("I'm Graceful");
    }

    public static void main(String[] args) {
        //instantiate Objects 
        Bird duck = new Duck(); 
        Swan s = new Swan();
        Bird b = s;

        // Duck1 code block
        Duck d1 = (Duck)duck; 
        /*  Fixed by casting: RHS type = <Bird>, LHS type = <Duck>, RHS is
            <subclass | superclass> of LHS
        */
        d1.quack();

        // Duck code block 
        Duck d = (Duck)b;
        /*  Fixed by casting: RHS type = <Bird>, LHS type = <Duck>, RHS is
            <subclass | superclass> of LHS
        */
        d.quack();
    }
}