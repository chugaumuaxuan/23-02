package WriteObjToByte2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Read {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/thang.doan/desktop/Person.dat"));
		System.out.println("Object after Serialization");
		Person p = (Person) ois.readObject();
		System.out.println(p);
		ois.close();
	}
}
