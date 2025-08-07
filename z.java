class basecls{
	public void methodA(){
		System.out.println("method a of base cls");
	}
}
class derived extends basecls{
	public void methodA(){
		System.out.println("method a of derived cls");
	}
}
public class z{
	public static void main(String[] args){
		basecls obj=new basecls();
		basecls obj2=new derived();
		obj.methodA();
		obj2.methodA();
	}

}
		