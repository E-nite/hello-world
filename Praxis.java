import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Praxis {

	public static void main(String args[]) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("MyBio.txt"))) {
			   String line = null;
			   while ((line = br.readLine()) != null) {
			       System.out.println(line);
			   }
			}
	    }
}
	