package test ;

import domain.Kangaroo;


 /**
 * The class Test animal extends kangaroo
 */ 
public class TestAnimal extends Kangaroo
{
	

/** 
 *
 * Main
 *
 * @param args  the args
 */
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

