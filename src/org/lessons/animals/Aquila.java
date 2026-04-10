package org.lessons.animals;

public class Aquila extends AbstractAnimal implements IVolante {

    @Override
    public void vola() {
        System.out.println("Sto volandooooooo!!!!!!!!!!");
    }

    @Override
    public void verso(){
        System.out.println("key key!!!");

    }

    @Override
    public void mangia(){
        System.out.println("Mangia conigli e topi");
    }
    
}
