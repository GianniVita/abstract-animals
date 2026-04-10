import org.lessons.animals.Aquila;
import org.lessons.animals.Cane;
import org.lessons.animals.Delfino;
import org.lessons.animals.Passerotto;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("");


        Aquila newAquila = new Aquila();
        newAquila.dormi();
        newAquila.verso();
        newAquila.mangia();


        Cane newCane = new Cane();
        newCane.dormi();
        newCane.verso();
        newCane.mangia();

        Delfino newDelfino = new Delfino();
        newDelfino.dormi();
        newDelfino.verso();
        newDelfino.mangia();

        Passerotto newPasserotto = new Passerotto();
        newPasserotto.dormi();
        newPasserotto.verso();
        newPasserotto.mangia();


    }
}
