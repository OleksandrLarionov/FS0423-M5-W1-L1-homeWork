package larionov.menu;

import larionov.menu.entities.Menu;
import larionov.menu.entities.Pizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class MenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuApplication.class);

		System.out.println(ctx.getBean("napoli"));
		System.out.println(ctx.getBean("getMenu"));



	}
}
