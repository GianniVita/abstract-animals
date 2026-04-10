package org.lessons.animals;

public class Delfino extends AbstractAnimal implements INuotante{

    @Override
    public void nuota(){
        System.out.println("I'm Swimminggggg!!!");
    }
    
    @Override
    public void verso() {
        System.out.println("turu turu!!!");

    }

    @Override
    public void mangia() {
        System.out.println("Mangia pesci picooli!!");
    }

}
