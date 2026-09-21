public class MassAverager {
    // planet[] MassAverager() and getMeanPlanetaryMass @ Jason
    private Planet[] planets;

    public MassAverager(Planet[] planets){
        this.planets = planets;
    }

    // Complete this. Retrieve the array of planets, then compute average mass.
    public float getMeanPlanetaryMass(Planet[] planets) {
        float mean = planets[0].getMass();
        for(Planet p : planets){
                mean += p.getMass();
            }
        return mean / planets.length;
    }

    //
    // In almost all classes in almost all 46B homework assignments, the main()
    // method is for you to test your code. The autograder doesn't look at the
    // output from main().
    //
    // Since this assignment is simple, there's really only 1 useful version of
    // main(), and you can fill it in here. Later, when your assignments are more
    // complicated, your main() will change several or many times as you develop
    // different pieces of your assignment. It also serves as a great place to writ
    // test cases. Later in the semester, we will learn even more ways to guarantee
    // your code is correct
    public static void main(String[] args) {
        float MASS_UNIT = 1.0e24f; 

        Planet[] planets = {
            new Planet("Mercury", 0.33f * MASS_UNIT),
            new Planet("Venus", 4.87f * MASS_UNIT),
            new Planet("Earth", 5.97f * MASS_UNIT),
            new Planet("Mars", 0.642f * MASS_UNIT),
            new Planet("Jupiter", 1898 * MASS_UNIT),
            new Planet("Saturn", 568 * MASS_UNIT),
            new Planet("Uranus", 86.8f * MASS_UNIT),
            new Planet("Neptune", 102f * MASS_UNIT)
    };

        MassAverager averager = new MassAverager(planets);
        System.out.println(averager.getMeanPlanetaryMass(planets));
    }
}
 //It's better to divide the sum-of-masses by applying array.length than hardcoding the number of planets because it makes the code more flexible and maintainable.
    //  If the number of planets changes in the future, using array.length ensures that
    //  the calculation will still be correct without needing to update the hardcoded value.
    //  This approach reduces the risk of errors and makes the code easier to read and understand.//
    //-Jason//