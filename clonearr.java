public class clonearr{
	public static void main(String[] args){
		int myarr[][]={{1,2,3},{4,5,6}};
		int clonearr[][]=myarr.clone();
		System.out.println(myarr==clonearr);
		System.out.println(myarr[1]==clonearr[1]);
	}
}