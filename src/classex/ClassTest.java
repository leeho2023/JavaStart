package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Person person = new Person();
		
		String className = "classex.Person";
		
		Class pClass1 = Class.forName(className);

		
		
		//.reflect.Method import
//		Method[] method = pClass1.getMethods();
//		for(Method m : method) {
//			System.out.println(m);
//		}
		
		
		// reflect.Field import
//		Field[] fs = pClass1.getFields();
//		for(Field f : fs) {
//			System.out.println(f);
//		}
		
		
		// Constructor import
//		Constructor[] cons = pClass1.getConstructors();
//		for(Constructor c : cons) {
//			System.out.println(c);
//		}
		
		
	}

}
