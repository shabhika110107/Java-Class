import java.util.Scanner;
public class ifdemo{
	public static void main(String[] mine){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int number = input.nextInt();
		if(number%5==0)
			if(number==10)
				System.out.println("Hifive");
		if(number%2==0)
			if(number==6)
				System.out.println("Hieven");
		else
			System.out.println("nothing to print");
	}
}