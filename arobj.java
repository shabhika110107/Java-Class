class stu{
	stu(int id,String name){
		System.out.println("studid: "+ id +" studname: "+ name);
	}
}
public class arobj{
	public static void main(String[] args){
		stu obj[]=new stu[3];
		obj[0]=new stu(1,"bharat");
		obj[1]=new stu(5,"vivaan");
		obj[2]=new stu(6,"smith");
	}
}

		