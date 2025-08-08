interface cng_car{
	void drive();
	void cng_kit();
}
interface petrol_car{
	void drive();
	void petrol_kit();
}
class hybrid_car implements petrol_car,cng_car{
	public void drive(){
		System.out.println("driving  hybrid car");
	}
}
class hybrid_car implements petrol_car,cng_car{
	public void drive(){
		System.out.println("driving a hybrid car");
	}
	public void cng_kit(){
		System.out.println("using the cng kit for hybrid car");
	}
	public void petrol_kit(){
		System.out.println("using the petrol kit for hybrid car");
	}
}
class implemntkeyword{
	public static void main(String args[]){
		hybrid_car obj=new hybrid_car();
		obj.drive();
		obj.cng_kit();
		obj.petrol_kit();
	}
}
	

	