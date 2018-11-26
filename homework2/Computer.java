package homework2;

public class Computer {
 
	public static String user; //static variable
	public static int age; 
	String rAM;  //non-static variable
	int hardDrive;
	boolean windows;
	double price;
	
	//non-static method # 1
	public void computerMemory() {
		System.out.println("computerMemory: "+rAM+" : "+hardDrive);
		}	
	//non-static method # 2
	public void operatingSystem() {
	 System.out.println("operatingSystem: "+ windows +":"+ user);
	}
	      
	//static method
	public static void computerUserInfo() {
		System.out.println("userInfo: "+user+" "+age);
		}
	
	//constructor #1
	public Computer(String rAM, int hardDrive, boolean windows, double price) {

		this.rAM = rAM;
		this.hardDrive = hardDrive;
		this.windows = windows;
		this.price = price;
	}
	
	
	//Constructor #2
	public Computer(boolean windows, double price) {
	
		this.windows = windows;
		this.price = price;
	}
   public void Configuration() {
	   System.out.println("Configuration: "+windows+" "+price);
	   
   }
}


