public class thismain{
	int x;
	public thismain(int x){
		this.x=x;
	}
	public static void main(String[] args){
		thismain myobj=new thismain(5);
		System.out.println("value of x is:" +myobj.x);
	}
}