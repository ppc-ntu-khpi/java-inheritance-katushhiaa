package domain;


 /**
 * The class Kangaroo extends predator
 */ 
public class Kangaroo extends Predator {

    private String variety;
    private String placeOfResidence;


/** 
 *
 * Kangaroo
 *
 */
    public Kangaroo() { 

        this("Kangu", 42, "Red kangaroo", "Australia");
    }


/** 
 *
 * Kangaroo
 *
 * @param name  the name
 * @param weight  the weight
 * @param variety  the variety
 * @param placeOfResidence  the place of residence
 */
    public Kangaroo(String name, int weight, String variety, String placeOfResidence) { 

        this.name = name;
        this.weight = weight;
        this.variety = variety;
        this.placeOfResidence = placeOfResidence;
    }


/** 
 *
 * Kangaroo
 *
 * @param name  the name
 */
    public Kangaroo(String name) { 

        this(name, 42, "Red kangaroo", "Australia");
    }


/** 
 *
 * Jump long
 *
 */
    public void jumpLong() { 

        System.out.println("Leaning on its tail like a pole, this animal can jump 10-12 meters in length");
    }


/** 
 *
 * Swim
 *
 */
    public void swim() { 

        System.out.println("Kangaroos can swim and usually do so to cross rivers or to defend themselves and avoid predators.");
    }

    @Override

/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("A kangaroo, like any other animal, sleeps to rest");
    }

    @Override

/** 
 *
 * Run
 *
 */
    public void run() { 

        System.out.println("They can run both for fun and to find food");
    }

    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("They speak by drumming Â? beating their feet and tail on the ground");
    }

    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Kangaroos are herbivorous mammals that eat a large amount of various greens: grass, shoots, leaves of trees and shrubs");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString() + "\nVariety: " + this.variety + "\nPlace of residence: " + this.placeOfResidence + "\n\nThis is a very nice kangaroo";
    }

}
