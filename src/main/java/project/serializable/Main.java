package project.serializable;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MySerialize c = new MySerialize("Cristi", "Marius");
        File file = new File("C:\\Users\\Picpalac\\IdeaProjects\\SDA6\\src\\main\\resources\\serializable\\file.txt");
        serialize(c, file);
        deserialize(file);

    }


    static void serialize(MySerialize c, File file) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserialize(File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        MySerialize mySerialize = (MySerialize) objectInputStream.readObject();

            }

        }

