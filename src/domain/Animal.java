package domain ;

public class Animal
{

	protected String name;

	protected int weight;
	

	public Animal() {
	name = "generic animal";
        weight = 15;
            
	}
	
	public void eat() {
            System.out.println("Animal eat");
	}
	

	
	public void speak() {
            System.out.println("Animal speak");	
	}
	

	public void run() {
            System.out.println("Animal run");
	}

	public void sleep() {
            System.out.println("Animal sleep");	
	}

    @Override
    public String toString() {
        return "My animal:" + "\nName: " + name + "\nWeight: " + weight+" kg";
    }

        
	
}

