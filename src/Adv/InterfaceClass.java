package Adv;

public interface InterfaceClass {
	
	void display();
	
	 void login(String username,String password);
	
	default void pri() {
		login(null, null);
	}
	
	

}
