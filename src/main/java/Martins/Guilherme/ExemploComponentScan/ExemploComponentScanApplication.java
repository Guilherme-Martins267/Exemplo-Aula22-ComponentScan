package Martins.Guilherme.ExemploComponentScan;

import externalClasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("externalClasses")
public class ExemploComponentScanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploComponentScanApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO" + objectDAO1);
		System.out.println("Objeto JDBC" + objectDAO1.getObjectJDBC());

	}

}
