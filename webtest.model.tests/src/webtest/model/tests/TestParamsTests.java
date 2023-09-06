package webtest.model.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import webtest.model.ModelFactory;

public class TestParamsTests {
	static ModelFactory f;
	
	@BeforeAll
	static void startup() {
		f = ModelFactory.eINSTANCE;
	}
	
	@Test
	void capture() {
		var main = f.createMain();
		main.getTestClass().add("example");
		main.getTestClass().add("ExampleTest");
		var bs0 = f.createBlockStatement();
		main.setBody(bs0);
		
		var t1 = f.createTestCase();
		var v1 = f.createVariable();
		v1.setName("username");
		t1.getParameters().add(v1);
		var v2 = f.createVariable();
		v2.setName("password");
		t1.getParameters().add(v2);
		
		var tci1 = f.createTestCaseInstance();
		var e1 = f.createStringExpression();
		e1.setValue("Alice");
		var a1 = f.createArgument();
		a1.setValue(e1);
		tci1.getArguments().add(a1);
		var e2 = f.createStringExpression();
		e2.setValue("secretA");
		var a2 = f.createArgument();
		a2.setValue(e2);
		tci1.getArguments().add(a2);
		t1.getInstances().add(tci1);

		var tci2 = f.createTestCaseInstance();
		var e3 = f.createStringExpression();
		e3.setValue("Alice");
		var a3 = f.createArgument();
		a3.setName("username");
		a3.setValue(e3);
		tci2.getArguments().add(a3);
		var e4 = f.createStringExpression();
		e4.setValue("secretA");
		var a4 = f.createArgument();
		a4.setName("password");
		a4.setValue(e4);
		tci2.getArguments().add(a4);
		t1.getInstances().add(tci2);

		var bs1 = f.createBlockStatement();
		t1.setBody(bs1);
		main.getDeclarations().add(t1);
	}
}
