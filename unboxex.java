public class unboxex{
	public static void main(String[] args){
		Character ch='s';
		char b=ch;
		Integer a=5;
		int first=a.intValue();
		int second=first;
		System.out.println(a);
		System.out.println(first);
		System.out.println(second);
	}
}