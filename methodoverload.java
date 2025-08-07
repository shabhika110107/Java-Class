class spoly{
	void sum(int x, int y){
		int s=x+y;
		System.out.println("sum: "+s);
	}
	void sum(int x, int y, int z){
		int s=x+y+z;
		System.out.println("sum: "+s);
	}
}
public class methodoverload{
	public static void main(String[] args){
		spoly obj=new spoly();
		obj.sum(10,20);
		obj.sum(30,40,50);
	}
}