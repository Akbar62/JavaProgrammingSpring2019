package day57_interfaces;

public interface Electric {
	
	public static final boolean HAS_BATTERIES = true;
	public static final int MAX_BATTERIES = 100_000;
	// all instance variables in interfaces are always public static final
	
	public abstract void charge();
	// all methods are public abstract by default 
	// void charge();
	

}
