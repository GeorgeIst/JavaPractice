package project.imputOutput;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class ImputOutput {
    public static void main(String[] args)throws IOException {
        Path path = Paths.get("C:\\Users\\Picpalac\\Desktop\\ImputOutput.txt");
        List<String> strings = Files.readAllLines(path);
        System.out.println(strings);
//        File path2 = new File("C:\\Users\\Picpalac\\Desktop\\MamaMia.txt");
//        path2.getParentFile().mkdirs();
        List<String> fileLines = Arrays.asList("Marius este NERD", "Catelus cu paru cret");
        List<String> blaFiles = Arrays.asList("George mananca mult", "Pisica muista");
        Files.write(path, fileLines);
        Files.write(path, blaFiles);
        Files.write(path, fileLines, StandardOpenOption.APPEND);
        System.out.println(strings);
//        Path patTH = Paths.get("C:\\Users\\Picpalac\\Desktop\\Blabla");
//        Files.createDirectory(patTH);
//        File.createTempFile(patTH.resolve());
        Path mariusPiratu = Paths.get("C:\\Users\\Picpalac\\Desktop\\Marius Piratul.txt");
        Files.deleteIfExists(mariusPiratu);






    }


}
