
public class TestProduceConsume {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Clerk clerk=new Clerk();
		Productor pd=new Productor(clerk);
		Consumer cs=new Consumer(clerk);
		
		Thread t1=new Thread(pd);
		Thread t2=new Thread(pd);
		Thread t3=new Thread(cs);
		
		t1.setName("������1");
		t2.setName("������2");
		t3.setName("������1");
		
		t1.start();
		t2.start();
		t3.start();
	}
}