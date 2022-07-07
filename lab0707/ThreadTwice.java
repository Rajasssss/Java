package lab0707;

class Multi extends Thread
{
	public void run() 
	{
		System.out.print("Test is running");
	}
}

public class ThreadTwice 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Multi m= new Multi();
		m.start();
		//We can't start a thread twice. After starting a thread, it can never be started again. 
		//If you does so, an IllegalThreadStateException is thrown.
		//In such case, thread will run once but for second time, it will throw exception.
		m.start();
	}

}
