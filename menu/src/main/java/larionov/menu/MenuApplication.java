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



/*		Pizza napoli = new Pizza("napolòio", 22.50);
		Menu nuovoMenu = new Menu();
		nuovoMenu.aggiungiPizzaAlMenu(napoli);
		System.out.println(nuovoMenu);*/

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MenuApplication.class);

		System.out.println(ctx.getBean("getPizza"));
		System.out.println(ctx.getBean("getMenu"));



	}
}
