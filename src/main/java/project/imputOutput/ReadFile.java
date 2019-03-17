package project.imputOutput;

import javax.imageio.IIOException;
import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {

        File absolute = new File("C:\\Users\\Picpalac\\Desktop\\Ceva.txt");
        try (BufferedReader buffer = new BufferedReader(new FileReader(absolute))) {
            String fileLine;
            while ((fileLine = buffer.readLine()) != null) {
                System.out.println(fileLine);
            }
        }
    }
}
