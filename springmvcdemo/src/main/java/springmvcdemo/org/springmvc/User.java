package springmvcdemo.org.springmvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {
	
	private String name;
	private String age;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public void initMethod()
	{
		System.out.println("Initialization method called ...");
		
	}
	
	
	void destryMethod()
	{
		
		System.out.println("destroy method called ...");
		
	}

}
