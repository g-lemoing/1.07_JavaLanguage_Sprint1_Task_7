package nivell1.exercise2.java.com.modules;

public class TreballadorPresencial extends Treballador {
    private static double fuel = 50.00;

    public TreballadorPresencial(String name, String surname, double hourPrice) {
        super(name, surname, hourPrice);
    }

    @Override
    public double calcularSou(int hours) {
        return super.calcularSou(hours) + fuel;
    }

    @Deprecated
    public static void method2(){
        System.out.println("Has invocat un mètode obsolet de la subclasse TreballadorPresencial.");
    }
}
