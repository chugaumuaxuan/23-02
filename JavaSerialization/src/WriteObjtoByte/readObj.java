package WriteObjtoByte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readObj {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/Users/thang.doan/desktop/Student.dat"));
		System.out.println("Object after serialization: ");
		Student st = (Student) ois.readObject();
		System.out.println(st);
		ois.close();
	}
}
