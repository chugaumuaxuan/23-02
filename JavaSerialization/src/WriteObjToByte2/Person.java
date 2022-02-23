package WriteObjToByte2;
import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1l;
	private String name;
	private int age;
	private transient String color;
	
	public String toString() {
		return "name : " + name + " tuoi " + age + " mau da " + color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
