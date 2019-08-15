import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String args[]) throws IOException {
        File file = new File("asserts/example.pdf");
        File fileResult = new File("asserts/results/example-result.pdf");
        byte[] b = Files.readAllBytes(Paths.get(file.getPath()));
        byte[] result = CompressPDF.reduce(b, 50L);
        Files.write(Paths.get(fileResult.getPath()), result);
    }
}
