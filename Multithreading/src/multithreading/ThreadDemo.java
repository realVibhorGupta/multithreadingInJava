package multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyRunnable r =new MyRunnable();//by main thread
		 Thread t=new Thread(r);
		 t.start();
		 for(int i=0;i<10;i++)//by main thread
		 {
			 System.out.println("MAIN THREAD ");
			
		 }
		 
	
	
	}

}
