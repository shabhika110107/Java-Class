class baseclass{
	public void methodA(){
		System.out.println("methodA of base cls");
	}
}
class derivedclass extends baseclass{
	public void methodA(){
		System.out.println("methoddA of derived class");
	}
}
public class methodoverriding{
	public static void main(String args[]){
		baseclass obj1=new baseclass();
		derivedclass obj2=new derivedclass();
		obj1.methodA();
		obj2.methodA();
	}
}