package maburhan.diexampleapp;

import maburhan.diexampleapp.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExampleAppApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("------ Primary ------");
		System.out.println(myController.sayHello());

		System.out.println("------ Property ------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter ------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor ------");
		ConstructerInjectedController constructerInjectedController = (ConstructerInjectedController) ctx.getBean("constructerInjectedController");
		System.out.println(constructerInjectedController.getGreeting());

	}

}
