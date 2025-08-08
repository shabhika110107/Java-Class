class bike{
	int speed;
	bike(){
		System.out.println("speed is" +speed);
	}
	{
		speed=100;
	}
}
public class initblock2{
	public static void main(String args[]){
		bike b1=new bike();
		bike b2=new bike();
	}
}