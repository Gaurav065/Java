interface BWTelevision{
	void movies();
	void serials();
	void news();
	void playDvd();
}

interface Calculator{
	void arithmetic();
	void trigonometric();
	void logarithemic();
	void matrix();
	void equationSolving();
}

abstract class Mobile implements BWTelevision,Calculator{ 

    


	public void movies(){
		System.out.println("Movie named Bahubali is streaming");
	}
	public void serials(){
		System.out.println("New season of KartheekaDeepam is arriving soon in MAA");
	}
	public void news(){
		System.out.println("Live news about \"Gnanvapi\" is streaming now");
	}
	public void arithmetic(){
		System.out.println("You can perform any arithmetic operation.");
	}
	public void trigonometric(){
		System.out.println("You can perform any trigonometric operation.");
	}
	public void logarithemic(){
		System.out.println("You can perform any logarithemic operation.");
	}
}




class Interface_implementation{
	public static void main(String[] args){
		Mobile obj = new Mobile();
		obj.movies();
		obj.serials();	
		obj.news();
		obj.arithmetic();
		obj.trigonometric();
		obj.logarithemic();
	}
}