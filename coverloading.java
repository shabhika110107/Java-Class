class spoly{
	int id;
	String name;

	spoly(){
		System.out.println("this is default");
	}
	spoly(int i , String n){
		id=i;
		name=n;
	}
}
public class coverloading{
	public static void main(String args[]){
		spoly s=new spoly();
		System.out.println("default const values");
		System.out.println("studid: "+s.id+"\nstudname:" +s.name);
		System.out.println("parameterised const values");
		spoly s1=new spoly(126,"pradeep");
		System.out.println("studid: "+s1.id+"\nstudname:" +s1.name);	
	}
}


	
		