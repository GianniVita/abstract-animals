package org.lessons.animals;

public class Passerotto extends AbstractAnimal implements IVolante {

    @Override
    public void vola(){
        System.out.println("Sto volandooooooo!!!!!!!!!!");
    }

    @Override
    public void verso() {
        System.out.println("Cip Cip!!!");
    }

    @Override
    public void mangia() {
        System.out.println("Mangia semini e vermicelli!!");
    }
    

    
}
