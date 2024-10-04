package nivell1.exercise2.java.com.main;

import nivell1.exercise2.java.com.modules.*;
import nivell1.exercise2.java.com.modules.TreballadorOnline;
import nivell1.exercise2.java.com.modules.TreballadorPresencial;
import nivell1.exercise2.java.com.modules.Utilities;

public class Main {
    public static void main(String[] args) {
        final int WORKED_HOURS = 160;
        System.out.println("Creem 3 intàncies, una de Treballador, una de Treballador Presencial i l'última de Treballador Online");
        Treballador worker1 = new Treballador("Joan", "Amigó", 19.30);
        TreballadorPresencial worker2 = new TreballadorPresencial("Glòria", "Fernández", 23.90);
        TreballadorOnline worker3 = new TreballadorOnline("Arturo", "Gómez", 17.50);
        System.out.println("Tots els empleats treballen 160 hores al mes.");
        System.out.println("El sou de l'empleat de la classe Treballador " + worker1 + " és:" + worker1.calcularSou(WORKED_HOURS));
        System.out.println("El sou de l'empleat de la classe TreballadorPresencial " + worker2 + " és:" + worker2.calcularSou(WORKED_HOURS));
        System.out.println("El sou de l'empleat de la classe TreballadorOnline " + worker3 + " és:" + worker3.calcularSou(WORKED_HOURS));
        Utilities.invokeMethods();
    }
}
