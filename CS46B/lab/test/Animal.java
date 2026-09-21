package test;

public class Animal {
    private String name;
    private float weight;
    protected void setWeight(float  newWeight) { weight = newWeight; }
    protected float getWeight() { return weight; }
    protected boolean isBigger (Animal animal) { return weight > animal.weight; }
}

class Tiger extends Animal {
}
class Bear extends Animal {

    public String speaks () { return "Rawr"; }

    public static void main (String[] args) {
        Bear yogiBear = new Bear (); 
        Tiger tonyTiger = new Tiger(); 
        Animal annieAnimal = new Animal();  
        
        System.out.println(annieAnimal.speaks());

        }
    }