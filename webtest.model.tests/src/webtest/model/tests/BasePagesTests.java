package webtest.model.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import webtest.model.ModelFactory;

public class BasePagesTests {
	static ModelFactory f;
	
	@BeforeAll
	static void startup() {
		f = ModelFactory.eINSTANCE;
	}
	
	@Test
	void basePages() {
		var main = f.createMain();
		main.getTestClass().add("example");
		main.getTestClass().add("ExampleTest");
		var bs0 = f.createBlockStatement();
		main.setBody(bs0);
		
		var p1 = f.createPage();
		p1.setName("p1");
		main.getDeclarations().add(p1);
		
		var p2 = f.createPage();
		p2.setName("p2");
		main.getDeclarations().add(p2);
		
		var p3 = f.createPage();
		p3.setName("p3");
		main.getDeclarations().add(p3);
		p3.getBasePages().add(p1);
		p3.getBasePages().add(p2);
	}
}
