package larionov.menu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MenuApplication.class, args);
		Pizza napoli = new Pizza("napolòio", 22.50);
		Menu nuovoMenu = new Menu();
		nuovoMenu.aggiungiPizzaAlMenu(napoli);
		System.out.println(nuovoMenu);
	}

}
