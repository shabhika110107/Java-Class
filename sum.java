import java.util.Scanner;
class add{
	int c;
	void addition(int x, int y){
		c=x+y;
	}
}
class sum{
	public static void main(String[] args){
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter first num:");
		a=sc.nextInt();
		System.out.print("enter second num:");
		b=sc.nextInt();
		add r = new add();
		r.addition(a,b);
		System.out.println("result:" +r.c);
	}
}