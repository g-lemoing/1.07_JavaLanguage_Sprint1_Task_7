package nivell2.exercise1.modules;

@JsonDirectory(".\\Json")
public class Persona {
    private String name;
    private String surname;
    private int age;

    public Persona(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + name + '\'' +
                ", cognoms='" + surname + '\'' +
                ", edat=" + age +
                '}';
    }
}
