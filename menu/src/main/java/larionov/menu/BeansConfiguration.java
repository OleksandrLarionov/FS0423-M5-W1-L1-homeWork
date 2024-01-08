package larionov.menu;

import larionov.menu.entities.Bevande;
import larionov.menu.entities.Menu;
import larionov.menu.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean
    Pizza getPizza() {
        return new Pizza("Napoli", 12.50);
    }

    @Bean
    Bevande getBevanda() {
        return new Bevande("CocaCola", 5);
    }

    @Bean
    Menu getMenu(Pizza p, Bevande b) {
        Menu newMenu = new Menu();
        newMenu.aggiungiPizzaAlMenu(p);
        newMenu.aggiungiBevandaAlMenu(b);
        return newMenu;
    }


}
