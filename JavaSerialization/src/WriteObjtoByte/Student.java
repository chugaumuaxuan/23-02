package WriteObjtoByte;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable{
	private static final int id =1;
	private String name;
	private transient int  age; //keyword transient se khong serializable 
	
	public String toString() {
		return "id: " + id + "name: " + name + "age: " + age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getId() {
		return id;
	}
}


