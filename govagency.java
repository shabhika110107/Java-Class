class person{
	String name;
	long id;
	person(String name,long id){
		this.name=name;
		this.id=id;
	}
}
class passport extends person{
	String personname;
	passport(String name,long id){
		super(name,id);
		this.personname=name;
	}
}
public class govagency{
	public static void main(String args[]){
		passport obj=new passport("divya",998844);
		System.out.println(obj.personname+" is a person with a passport number:" + obj.id);
	}
}