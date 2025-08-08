class automob{
	automob(){
		System.out.println("parent cls constructor invoked");
	}
}
class bike extends automob{
	bike(){
		super();
		System.out.println("child class const invoked");
	}
	{
		System.out.println("instance initialiser block is invoked");
	}
}
public class initblock1{
	public static void main(String args[]){
		bike b1=new bike();
	}
}