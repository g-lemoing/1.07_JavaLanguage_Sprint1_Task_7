<b>ANNOTACIONS Descripció</b>

Nivel 1 

Ejercicio 1:
El objetivo del ejercicio es comprobar la anotación @Override. Para ello, creamos 1 clase Treballador con 2 subclases TreballadorOnline y TreballadorPresencial.
La clase principal implementa el método CalcularSou en función del número de horas mensuales trabajadas recibidas como parámetro.
Cada subclase sobreescribe el mismo método introduciendo alguna modificación. Comprobamos con una instancia de cada clase que el cálculo refleja esa sobreescritura.

Ejercicio 2:
En este ejercicio comprobamos el efecto de la anotación @Deprecated, que informa el compilador de que los métodos method1 y method2 afectados por esa anotación están obsoletos.
Y comprobamos también como la anotación @SupressWarnings("deprecation") en el método invokeMethods deja sin efecto la anotación anterior.

Nivel 2 

Ejercicio 1:
Creamos una anotación personalizada para parametrizar la ruta de un directorio a donde exportamos un fichero Json que contiene la serialización de un objeto Java.
Definimos esa anotación personalizada como extensión de la clase Annotation (JsonDirectory.java), precedida de una anotación @Retención donde especificamos su ámbito,
en este caso, el de RUNTIME.
Llamamos esa anotación @JavaDirectory, que colocamos antes de la clase del objeto a serializar Persona.
Comprobamos que se exporta el fichero persona.json en el directorio Json situado en el directorio del proyecto.

Nivel 3

Ejercicio 1:
A partir del ejercicio anterior (Nivel 2, Ejercicio 1), añadimos una línea de código para registrar la anotación creada anteriormente, vía el método getDeclaredAnnotations()
sobre la clase Persona. Eso es posible porque hemos definido el ámbito de la anotación personalizda como RUNTIME, lo que nos permite registrarla en tiempo de ejecución.

---------------------------------  
Tecnologies Utilitzades : IDE IntelliJ Idea v 2024.2.2, Java, SDK openjdk-22 Oracle OpenJDK 22.0.2
Requisits: SDK openjdk-22 Oracle OpenJDK 22.0.2. Built con Maven, incluye como dependencia
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.17.0</version>

Instal·lació: 
1. Clonar el repositorio de Github
git clone https://github.com/g-lemoing/1.07_JavaLanguage_Sprint1_Task7.git
2. Abrir el IDE e importar el proyecto desde el repositorio local desde File > Open.

Ejecución:
Localizar y abrir las classes Main de cada ejercicio, y ejecutarlas con el Run.

Contribuciones:
1. Crear un fork del repositorio: 
2. Clonar el repositorio hacia el directorio local marcado por git bash
 git clone https://github.com/YOUR-USERNAME/1.07_JavaLanguage_Sprint1_Task7
3. Crear una rama
git branch BRANCH-NAME
git checkout BRANCH-NAME
4. Realizar cambios o comentarios, y hacer un commit: git commit -m 'mensaje cambios'
5. Subir cambios a tu nueva rama: git push origin BRANCH-NAME
6. Hacer un pull request
