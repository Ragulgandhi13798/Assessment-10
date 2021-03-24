package thread.test;

 /*public class main extends Thread {

        public static void main(String[] args) {
		
		main t = new main();
		t.start();
		System.out.println("code is not run method");
	}
		// TODO Auto-generated method stub
		
		 public void run() 
   		{
			System.out.println("code is running");
		}
		
	}*/

    //Runnable interface

 /* public class Main implements Runnable {

    public static void main(String[] args) {
	
	Main obj = new Main();
	Thread th = new Thread(obj);
	th.start();
	System.out.println("code is not run method");
}
	// TODO Auto-generated method stub
	
	 public void run() 
		{
		System.out.println("code is running");
	}
}*/
  
  // thread extend example
  
     public class Main1 extends Thread {
	  public static int amount = 27;

	  public static void main(String[] args) {
	    Main1 thread = new Main1();
	    thread.start();
	    System.out.println(amount);
	    amount++;
	    System.out.println(amount);
	  }

	  public void run() {
	    amount++;
	  }
	}
  
  
  
  
  
  
  
  
  
