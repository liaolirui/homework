
public class ClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factor=new Factory();
		
		Fruit fruit=factor.CreateFruit("B");
		fruit.eat();
   
	}
	public String factory(String fruitname)
	{
		if(fruitname.equals("Apple"))
			return "Apple";
		if(fruitname.equals("Banana"))
			return "Banana";
		return null;
	}
}
