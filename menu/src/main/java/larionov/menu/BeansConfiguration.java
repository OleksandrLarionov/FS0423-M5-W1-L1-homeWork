package larionov.menu;

import larionov.menu.entities.Bevande;
import larionov.menu.entities.Menu;
import larionov.menu.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeansConfiguration {
    //    *********************************PIZZE*********************************
    @Bean
    Pizza napoli() {
        return new Pizza("Napoli", 12.50);
    }

    @Bean
    Pizza margherita() {
        return new Pizza("Margherita", 8);
    }
    @Bean
    Pizza focacciaRossa(){
        return new Pizza("Focaccia", 20);
    }

    //    ******************BEVANDE***************************
    @Bean
    Bevande cocacola() {
        return new Bevande("CocaCola", 5);
    }

    @Bean
    Bevande fanta() {
        return new Bevande("Fanta", 6);
    }

    @Bean
    Menu getMenu() {
        Menu menu = new Menu();
        menu.aggiungiPizzaAlMenu(margherita());
        menu.aggiungiPizzaAlMenu(napoli());
        menu.aggiungiBevandaAlMenu(fanta());
        menu.aggiungiBevandaAlMenu(cocacola());
        return menu;
    }


}
