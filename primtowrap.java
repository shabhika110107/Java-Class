public class primtowrap{
	public static void main(String[] args){
		int a=5;
		double b=5.65;
		//Integer aobj=Integer.valueOf(a);
		//Double bobj=Double.valueOf(b);
		Integer aobj=a;
		Double bobj=b;
		if(aobj instanceof Integer){
			System.out.println("obj of int is created");
		}
		if(bobj instanceof Double){
			System.out.println("obj of double is created");
		}
	}
}
	