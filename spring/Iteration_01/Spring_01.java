Spring Container/Context
Manages Spring beans and its lifecycle
	1. Bean Factory - Basic Spring Container
	2. Application Context - Advanced Spring
		Container with enterprise-specific features
		
Pojo VS Java Bean VS Spring Bean

Plain Old Java Object -- Any object is Pojo

class Pojo{
	private String text;
	private int number;
	
	public String toString(){
		return text + ":" + number;
	}
}

public class SpringBeanVsJavaBean{
	public static void main(String[] args){
		Pojo pojo =new Pojo();
		System.out.println(pojo);
	}
}
	
*****************************
Java Bean:
	1. No argument constructor
	2. getter and setters should be there
	3. Serializable
	
--Not importent anymore 
*****************************
Spring Bean:
	Any object is managed by spring is spring bean.
