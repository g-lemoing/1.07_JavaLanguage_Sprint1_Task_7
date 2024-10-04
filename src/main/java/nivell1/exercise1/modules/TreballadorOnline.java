package nivell1.exercise1.modules;

public class TreballadorOnline extends Treballador{
    private final double INTERNET_FEE = 30.00;
    public TreballadorOnline(String name, String surname, double hourPrice) {
        super(name, surname, hourPrice);
    }

    @Override
    public double calcularSou(int hours) {
        return super.calcularSou(hours) + INTERNET_FEE;
    }

}
