package APIS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFiles {
    public static void main(String[] args) {
        //Copy files with path and files classes
        Path source = Paths.get("files", "loremipsum.txt");
        Path target = Paths.get("files","createdWithPath&FielsClasses.txt");

        try {
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
