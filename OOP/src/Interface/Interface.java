package Interface;

interface Father{
	
	int i =2;
	void askFather();
}

interface Mother{
	void askMother();
}

class Son implements Father,Mother{

	public void askMother() {
		System.out.println("I am your Father");
		
	}

	public void askFather() {
		System.out.println("I am your Mother");
		
	}
	
	void askSon() {
		System.out.println("I am your Son");
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Son s = new Son();
		s.askFather();
		s.askMother();
		s.askSon();
		System.out.println(s.i);
	}

}
