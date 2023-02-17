package test ;

import domain.Kangaroo;

public class TestAnimal extends Kangaroo
{
	
	public static void main(String[] args) {
            Kangaroo myKangaroo = new Kangaroo();
            System.out.println(myKangaroo);
            myKangaroo.speak();
            myKangaroo.eat();
            myKangaroo.run();
            myKangaroo.sleep();
            myKangaroo.jumpLong();
            myKangaroo.swim();
	}
	
}

