package part3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

/**
 * Write 100 random ints to a text file; one int per line. Use a try with
 * resources and a catch block as needed. Add a finally block that prints the
 * words "All done".
 *
 * @author Austin Abild
 */
public class T1P3 {

    private String file = "TestPart3.txt";

    public void createFile() throws IOException {
        File input = new File(file);
        try {
            if (input.exists()) {
                input.delete();
                Files.createFile(Paths.get(file));
            } else {
                Files.createFile(Paths.get(file));
            }
        } catch (IOException a) {
            System.out.println("Failed to create: " + file);
            throw new IOException(a);
        }
    }

    public void writeToFile() throws IOException {
        Random rand = new Random();
        String num = "";

        Path path = Paths.get(file);

        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            for (int i = 0; i < 100; i++) {
                num = String.format("%02d\r\n", rand.nextInt(100));
                writer.write(num);
            }
        } catch (IOException a) {
            System.out.println("Failed to write to: " + file);
            throw new IOException(a);
        }
    }

    public void testFile() {
        try {
            createFile();
            writeToFile();
        } catch (IOException a) {
            System.out.println("Error: " + a.getMessage());
        } finally {
            System.out.println("All done");
        }
    }

    public static void main(String[] args) {
        T1P3 t1p3 = new T1P3();
        t1p3.testFile();
    }
}
