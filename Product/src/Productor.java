
public class Productor implements Runnable {
	Clerk clerk;
	
	public Productor(Clerk clerk){
		super();
		this.clerk=clerk;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		while(true){
			try{
				Thread.currentThread();
				Thread.sleep(1000);
			}catch
			(InterruptedException e){
				e.printStackTrace();
			}
			clerk.addProduct();
		}
	}

}
