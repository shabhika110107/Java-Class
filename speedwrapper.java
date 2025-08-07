class speedwrapper{
	private int speed;
	speedwrapper(){
	}
	speedwrapper(int speed){
		this.speed=speed;
	}
	public int getvehicle(){
		return speed;
	}
	public void setvehicle(int speed){
		this.speed=speed;
	}

}
public class custwrap{
	public static void main(String[] args){
		speedwrapper speedval=new speedwrapper(100);
		System.out.println(speedval);
	}
}