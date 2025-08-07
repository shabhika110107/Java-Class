import java.io.*;
class Data{
	String name="navi";
	int id=11;
	Data(String name,int id){
		this.name=name;
		this.id=id;
	}
}
public class para{
	public static void main(String[] args){
		Data data=new Data("naveen",21);
		System.out.println("name:" +data.name + " and id:" +data.id);
	}
}
	 