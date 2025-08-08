class vehicle{
	void run(){
		System.out.println("vehicle is running");
	}
}
class car extends vehicle{
	void run(){
		System.out.println("car is running");
	}
}
public class overriding{
	public static void main(String args[]){
		vehicle obj1=new car();
	        obj1.run();
		vehicle obj2=new vehicle();
		obj2.run();
	}
}
		