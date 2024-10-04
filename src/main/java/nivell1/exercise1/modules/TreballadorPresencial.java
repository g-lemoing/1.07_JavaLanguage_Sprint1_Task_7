package nivell1.exercise1.modules;

public class TreballadorPresencial extends Treballador {
    private static double fuel = 50.00;

    public TreballadorPresencial(String name, String surname, double hourPrice) {
        super(name, surname, hourPrice);
    }

    @Override
    public double calcularSou(int hours) {
        return super.calcularSou(hours) + fuel;
    }

}
