import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {
    public static void main(String[] args) throws IOException {
        // Calling the method that throws an IOException
        readFile("nonexistentfile.txt");
    }

    // The method that declares the exception with throws
    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader fr = new FileReader(file); // Throws IOException
        fr.read();
        fr.close();
    }
}
