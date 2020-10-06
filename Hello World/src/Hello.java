import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		Car car=new Car("closed","on","seated",10);
		System.out.println(car.run());
		Smartphone phone=new Smartphone();
		System.out.println(phone.getBrand());
		
		
		System.out.println("What is your Name?"); Scanner sc = new
		Scanner(System.in);
		 
		//String name=sc.nextLine(); // This will take empty input 
		String name=sc.next(); // waits for input
		//int age =sc.nextInt(); // for integer output
		sc.close();
		System.out.println("Thank You " + name);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}).start();
				
	}

}
