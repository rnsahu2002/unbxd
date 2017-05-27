package jsonManupulation;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonParseException;

public class jacksonTest {

	public static void main(String args[]) {

		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "{\"name\":\"Mahesh\", \"age\":21,\"money\":100}";
		// map json to student
		
		try {
			Student student = mapper.readValue(jsonString, Student.class);
			// mapper.enable(SerializationConfig.Feature.INDENT_OUTPUT);
			jsonString = mapper.writeValueAsString(student);
			System.out.println(student.getAge()+student.getName());
			System.out.println(student.getStudentsProperty());
		
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

}

class Student {
	private String name;
	private int age;
	private int Money;

	public Student() {
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
	
	public int getMoney() {
		return age;
	}

	public void setMoney(int moneY) {
		this.Money = moneY;
	}

	public String getStudentsProperty() {
		return "Student [ name: " + name + ", age: " + age + " ,money: " + Money + " ]";
	}
}
