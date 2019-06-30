package multithreading;

public class MyRunnable  implements Runnable {

	//public static void main(String[] args) {by child thread
		// TODO Auto-generated method stub
				public void run()//job of thread 
				{
					for (int i=0;i<10;i++)
					{
						System.out.println(i);
						//System.out.print("by child thread");
					}
				}
	}


