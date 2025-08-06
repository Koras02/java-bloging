
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyExample {

    public static void main(String[] args) {
        String source = "output.txt";
        String description = "description.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(source)); BufferedWriter bw = new BufferedWriter(new FileWriter(description))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // Write a new line after each line read
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
