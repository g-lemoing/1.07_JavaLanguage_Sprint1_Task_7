package nivell1.exercise2.modules;

public class TreballadorOnline extends Treballador {
    private final double INTERNET_FEE = 30.00;
    public TreballadorOnline(String name, String surname, double hourPrice) {
        super(name, surname, hourPrice);
    }

    @Override
    public double calcularSou(int hours) {
        return super.calcularSou(hours) + INTERNET_FEE;
    }

    @Deprecated
    public static void method1(){
        System.out.println("Has invocat un mètode obsolet de la subclasse TreballadorOnline.");
    }
}
