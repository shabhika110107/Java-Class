class shape{
	public void area(){
		System.out.println("fomual or area of:");
	}
}
class triangle extends shape{
	public void area(){
		System.out.println("Traiangle is 1/2*base*height");
	}
}
class circle extends shape{
	public void area(){
		System.out.println("Circle is 3.14*radius*radius");
	}
}
class main5{
	public static void main(String[] args){
		shape myshape=new shape();
		shape mytriangle=new triangle();
		shape mycircle=new circle();
		myshape.area();
		mytriangle.area();
		myshape.area();
		mycircle.area();
	}
}

		


