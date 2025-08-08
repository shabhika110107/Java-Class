class emp{
	int id;
	String name;
	String dept;
	emp(int id, String name ,String dept){
		this.id=id;
		this.name=name;
		this.dept=dept;
		System.out.println("\nEmp name "+name);
		System.out.println("\nEmp id "+id);
		System.out.println("\nEmp belongs to the "+dept);
	}
}
class dept{
	String depname;
	int noofemp;
	dept(String name,int noofemp){
		this.depname=name;
		this.noofemp=noofemp;
	}
}
class uni{
	String uniname;
	int noofdept;
	uni(String name, int dep){
		this.uniname=name;
		this.noofdept=dep;
	}
}
public class aggregation{
	public static void main(String[] args){
		emp e1=new emp(101,"rishi","engineer");
		emp e2=new emp(102,"ravi","management");
		emp e3=new emp(103,"raja","acc");
		dept d1=new dept("me",29);
		uni u1=new uni("hi",30);
	}
}

		
	

		