import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Reader {
    public static void main(String[] args) {
        String filePath = "Ax.txt";
	 try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } 
	  catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

