package animal;

public class Animal {
    private boolean canHop;
    private boolean canSwim;
    private String species;

    public Animal(String specisName, boolean hopper, boolean swimmer) {
        this.species = specisName;
        this.canHop = hopper;
        this.canSwim = swimmer;
    }

    public Boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}
