
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String[] args) {
        String filePath = "output.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("Hello,World!");
            bw.newLine(); // Write a new line
            bw.write("This is a test file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
