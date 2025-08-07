import java.io.Console;
class ReadStringTest{
	public static void main(String[] args){
		Console c= System.console();
		System.out.println("enter ur name:");
		String n=c.readLine();
		System.out.println("ur name is: "+n);
	}
}