package nivell3.exercise1.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.Annotations;
import nivell2.exercise1.modules.Persona;
import nivell2.exercise1.modules.Utilities;

import java.io.File;
import java.io.IOException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        String serFile = "persona.json";
        Persona persona = new Persona("Joan", "Gómez", 38);
        System.out.println("Instanciem un objecte de la classe Persona: " + persona);
        String dir = Utilities.checkAnnotation(persona);
        File directory = Utilities.checkDirectory(dir);
        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println("Serialitzem l'objecte en json i el desem en el fitxer " + serFile + " en el subdirectori " + dir +" d'aquest mateix projecte.");
        File outputFile = new File(directory, serFile);
        objectMapper.writeValue(outputFile, persona);
        System.out.println("El fitxer s'ha creat correctament en el directori " + dir +".");
        System.out.println("Podem registrar l'annotació personalitzada sobre la classe Persona en temps d'execució:\n" + Arrays.toString(Persona.class.getDeclaredAnnotations())); ;
    }
}
