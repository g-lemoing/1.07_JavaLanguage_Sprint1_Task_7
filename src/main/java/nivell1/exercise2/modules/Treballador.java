package nivell1.exercise2.java.com.modules;

public class Treballador {
    private String name;
    private String surname;
    private double hourPrice;

    public Treballador(String name, String surname, double hourPrice){
        this.name = name;
        this.surname = surname;
        this.hourPrice = hourPrice;
    }

    public double calcularSou(int hours){
        return hours*hourPrice;
    }

    @Override
    public String toString() {
        return "{" +
                "nom; '" + name + '\'' +
                ", cognoms: '" + surname + '\'' +
                ", preu hora: " + hourPrice +
                '}';
    }
}
