import java.io.BufferedReader; //java.io.* - to import all packages
import java.io.IOException;
import java.io.InputStreamReader;
public class Test{
	public static void main(String[] args) throws IOException{
		System.out.print("enter name:");
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String name=reader.readLine();
		System.out.println("Your name is: " + name);

	}
}