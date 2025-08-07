public class returnarr{
	public static int[] domultiply(int[] arr){
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]*2;
		}
		return arr;
	}
	public static void main(String[] args){
		int myarr[]={1,2,3,4,5};
		int[] multiplyarr=domultiply(myarr);
		System.out.println("array multiply by 2 is-");
		for(int i: multiplyarr){
			System.out.println(i+ " ");
		}
	}
}