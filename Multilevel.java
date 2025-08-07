class classA{
	public void dispA(){
		System.out.println("disp() method of classA");
	}
}
class classB extends classA{
	public void dispB(){
		System.out.println("disp() method of classB");
	}
}
class classC extends classB{
	public void dispC(){
		System.out.println("disp() method of classC");
	}
}
public class Multilevel{
	public static void main(String args[]){
		classC c= new classC();
		c.dispA();
		c.dispB();
		c.dispC();
	}
}