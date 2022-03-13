package springmvcdemo.org.springmvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
			
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		User usr = (User) ctx.getBean("user");		
		System.out.println(usr.getName());
		/*
		 * System.out.println(usr.getAge()); System.out.println(usr.getGender());
		 */
		
		usr.setName("kumar");
		
		System.out.println("###############");
		
		User usr2 = (User) ctx.getBean("user");	
		System.out.println(usr2.getName());
		
		
		/*
		 * ctx.close();
		 * 
		 * 
		 * User usr3 = (User) ctx.getBean("user"); System.out.println(usr3.getName());
		 */

	}
	
	
	

}
