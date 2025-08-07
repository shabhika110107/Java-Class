public class main4{
	static void static1(){
		System.out.println("static method without obj");
	}
	public void public1(){
		System.out.println("public method only with obj");
	}
	public static void main(String[] args){
		static1();
		
		main4 myobj=new main4();
		myobj.public1();
	}
}