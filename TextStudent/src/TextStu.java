import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Set;


public class TextStu {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO 自动生成的方法存根
        System.out.println("Hello World!");
        Student stu=new Student();
        stu.setAge(20);
        stu.setName("www.yangtzeu.edu.cn");
        stu.setScore(98.0);
        ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream(new File("D:/Student/s.txt")));
        oss.writeObject(stu);
        oss.close();
        ObjectInputStream ois=new  ObjectInputStream(new FileInputStream(new File("D:/Student/s.txt")));
        Student s2=(Student)ois.readObject();
        ois.close();
       
        
        Set stuSet=new HashSet();
        s2.setAge(22);
        System.out.println("stu:"+stu.hashCode());
        System.out.println("s2"+s2.hashCode());
        stuSet.add(stu);
        stuSet.add(s2);
        System.out.println(stuSet.size());
        
	}

}
       
