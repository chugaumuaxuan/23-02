package WriteObjToByte2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/thang.doan/desktop/Person.dat"));
		Person p = new Person();
		p.setName("Pham");
		p.setAge(22);
		p.setColor("yellow");
		
		System.out.println("Obj before serialization");
		System.out.println(p);
		oos.writeObject(p);
		oos.close();
	}
}
