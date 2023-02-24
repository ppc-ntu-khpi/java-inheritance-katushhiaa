package domain;

/**
 * The class Animal
 */
public class Animal {

    protected String name;

    protected int weight;

    /**
     *
     * It is a constructor.
     *
     */
    public Animal() {

        name = "generic animal";
        weight = 15;

    }

    /**
     *
     * Eat
     *
     */
    public void eat() {

        System.out.println("Animal eat");
    }

    /**
     *
     * Speak
     *
     */
    public void speak() {

        System.out.println("Animal speak");
    }

    /**
     *
     * Run
     *
     */
    public void run() {

        System.out.println("Animal run");
    }

    /**
     *
     * Sleep
     *
     */
    public void sleep() {

        System.out.println("Animal sleep");
    }

    @Override

    /**
     *
     * To string
     *
     * @return String
     */
    public String toString() {

        return "My animal:" + "\nName: " + name + "\nWeight: " + weight + " kg";
    }

}
