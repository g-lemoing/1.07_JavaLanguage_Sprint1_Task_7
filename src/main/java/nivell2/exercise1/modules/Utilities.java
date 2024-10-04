package nivell2.exercise1.modules;

import java.io.File;

public class Utilities {
    public static String checkAnnotation (Object object){
        if(object.getClass().isAnnotationPresent(JsonDirectory.class)) {
            return object.getClass().getAnnotation(JsonDirectory.class).value();
        }
        return "";
    }

    public static File checkDirectory(String dir){
        File directory = new File(dir);
        if (!directory.exists()){
            directory.mkdir();
        }
        return directory;
    }

}
