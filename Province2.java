public class Province2{
	public static void area(Henan a){
		a.area();
	}
	public static void main (String[] args){
		area(new Nanyang());
		area(new Xinyang());
		area(new Luoyang());
	}
}class Henan{
	void area(){
		System.out.println("area size");
	}
}
class Nanyang extends Henan{
	void area(){
		System.out.println("area size:1");
	}
}
class Xinyang extends Henan{
	void area(){
		System.out.println("area size:2");
	}
}
class Luoyang extends Henan{
	void area(){
		System.out.println("area size:3");
	}
}

	