
public class Clerk {
	int product;
	
	public synchronized void addProduct(){
		if (product>=10){
			try{
				wait();
			}catch
			(InterruptedException e){
				e.printStackTrace();
			}
		}else {
			product++;
			
			System.out.println(Thread.currentThread().getName()+"�����˵�"+product+"����Ʒ");
			notifyAll();
		}
	}
	public synchronized void ConsumeProduct(){
		if(product<=0){
			try{
				wait();
			}catch
			(InterruptedException e){
				e.printStackTrace();
			}
		}else {
			System.out.println(Thread.currentThread().getName()+"�����˵�"+product+"����Ʒ");
			product--;
			notifyAll();
		}
	}
}
