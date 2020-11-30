package org.cb.cbspringdi;

import org.cb.cbspringdi.controllers.DIController;
import org.cb.cbspringdi.controllers.PropertyInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CbSpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(CbSpringDiApplication.class, args);

		/**
		 * bean name is class name with rules:
		 * if all letters in first word is all uppercase then class name is used as it is
		 * if only the first letter is uppercase then first letter is used as lowercase
		 * Ex:
		 * ANYClass => ANYClass
		 * AnyClass => anyClass
		 */
		DIController diController = (DIController) ctx.getBean("DIController");
		System.out.println(diController.greet());

		PropertyInjectionController propertyInjectionController =
				(PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(propertyInjectionController.getDescription());
	}

}
