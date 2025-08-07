class stud{
	int id;
	String name;
	int age;
	stud(int i,String n){
		id=i;
		name=n;
	}
	stud(int i,String n, int a){
		id=i;
		name=n;
		age=a;
	}
	void display(){
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args){
		stud s1=new stud(11,"shabhi");
		s1.display();
	}
}
