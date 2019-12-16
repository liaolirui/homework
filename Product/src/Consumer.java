
public class Consumer implements Runnable {
	Clerk clerk;
	
	public Consumer(Clerk clerk){
		super();
		this.clerk=clerk;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while(true){
			try{
				Thread.currentThread();
				Thread.sleep(1000);
			}catch
			(InterruptedException e){
				e.printStackTrace();
			}
			clerk.ConsumeProduct();
	}
  }
}
