import org.lessons.animals.Aquila;
import org.lessons.animals.Cane;
import org.lessons.animals.Delfino;
import org.lessons.animals.INuotante;
import org.lessons.animals.Passerotto;
import org.lessons.animals.IVolante;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------");

       faiVolare(new Aquila());
       faiVolare(new Passerotto());

       faiNuotare(new Delfino());


        Aquila newAquila = new Aquila();
        newAquila.dormi();
        newAquila.verso();
        newAquila.mangia();
        newAquila.vola();

        System.out.println("---------------------------");

        Cane newCane = new Cane();
        newCane.dormi();
        newCane.verso();
        newCane.mangia();

        System.out.println("---------------------------");

        Delfino newDelfino = new Delfino();
        newDelfino.dormi();
        newDelfino.verso();
        newDelfino.mangia();
        newDelfino.nuota();

        System.out.println("---------------------------");

        Passerotto newPasserotto = new Passerotto();
        newPasserotto.dormi();
        newPasserotto.verso();
        newPasserotto.mangia();
        newPasserotto.vola();

        System.out.println("---------------------------");

    }

    public static void faiVolare(IVolante animale){
        animale.vola();
    }

    public static void faiNuotare(INuotante animale){
        animale.nuota();
    }

}

