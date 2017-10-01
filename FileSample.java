import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FileSample {

	public static void main(String[] args) throws IOException {
		try (FileOutputStream fileOutputStream = new FileOutputStream(new File("file"));
				OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
				PrintWriter out = new PrintWriter(new BufferedWriter(outputStreamWriter));) {

			List<String> list = new ArrayList<>();
			list.add("a");
			list.add("b");
			list.add("c");

			list.forEach(str -> {
				out.println(str);
				System.out.println(str);
				out.println("/r/n");
				System.out.println("/r/n");
			});
		} catch (IOException e) {
			throw e;
		}
	}
}
