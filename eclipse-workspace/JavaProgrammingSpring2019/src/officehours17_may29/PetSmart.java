package officehours17_may29;

public class PetSmart {
	
	public static void main(String[] args) {
		Cat murodilsCat = new Cat();
		murodilsCat.breed = "persian cat";
		murodilsCat.name = "Barsik";
		
		sellCat(murodilsCat);
		
		OnlineCat marufsImaginaryCat = new OnlineCat();
		marufsImaginaryCat.breed = "lebanese cat";
		marufsImaginaryCat.name = "Tars";
		marufsImaginaryCat.location = "Arlington, TX";
		
		sellCatOnline(marufsImaginaryCat);
		murodilsCat.makeSomeNoise();
		marufsImaginaryCat.makeSomeNoise();
	}
	
	public static void sellCat(Cat cat) {
		System.out.println("selling " + cat.breed);
		System.out.println("its name is " + cat.name);
		
	}
	
	public static void sellCatOnline(OnlineCat cat) {
		System.out.println("selling " + cat.breed);
		System.out.println("its name is " + cat.name);
		//System.out.println("its location is " + cat);
	}

}
