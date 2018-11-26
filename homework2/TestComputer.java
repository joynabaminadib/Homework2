package homework2;

public class TestComputer {

	public static void main(String[] args) {
		Computer c1 = new Computer("8gb", 1 , true , 600.5);
		Computer.user = "Steve";
		Computer.age = 35;
		c1.computerMemory();
		c1.operatingSystem();
		Computer.computerUserInfo();
		c1.Configuration();

	
        Computer c2 = new Computer(false, 800.76);
	    Computer.user= "Bob";
	    Computer.age = 42;
	    Computer.computerUserInfo();
        c2.Configuration();
        
        
	}      
}
