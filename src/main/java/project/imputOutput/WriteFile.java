package project.imputOutput;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void writeFile()throws IOException{
        File f = new File("C:\\Users\\Picpalac\\Desktop\\Ceva.txt");
        try (BufferedWriter write = new BufferedWriter(new FileWriter(f, true))) {
            String fileLine2 = "\\assas fdfd fgf vbb";
            write.write(fileLine2);
        }
    }
}
