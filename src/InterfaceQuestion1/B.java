package InterfaceQuestion1;

//Interface B
public interface B extends A {
	default void disp2() {// interface B disp2 method
		System.out.println("Interface B");
	}
}
