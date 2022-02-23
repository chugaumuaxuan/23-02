package WriteObjtoByte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class writeObj {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/Users/thang.doan/desktop/Student.dat"));
		
		Student st = new Student();
		st.setName("Nguyen");
		st.setAge(13);
		
		System.out.println("Obj before Serializable: ");
		System.out.println(st);
		oos.writeObject(st);
		oos.close();
	}
}
