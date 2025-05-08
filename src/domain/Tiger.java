package domain;

public class Tiger extends Predator {

    private String kind;

    public Tiger(String name, int weight, String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public Tiger() {
        this("Fluffy",4,"Tiger");
    }

    public Tiger(String name) {
        this(name,4,"Tiger");
    }
        
    
    public void catches() {
        System.out.println("Tiger catches fish...");
    }

    @Override
    public void hunt() {
        System.out.println("Tiger hunting for a zebra...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\n\nThis is Tiger!";
    }

    @Override
    public void speak() {
        System.out.println("Rrrr! Rrrr!");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eats meat...");
    }
    
    
}
