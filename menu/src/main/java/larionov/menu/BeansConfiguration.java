package larionov.menu;

import larionov.menu.entities.Bevande;
import larionov.menu.entities.Condimenti;
import larionov.menu.entities.Menu;
import larionov.menu.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    //    *********************************PIZZE*********************************
    @Bean
    Pizza napoli() {
        Pizza napoli = new Pizza("Napoli", 12.50, 1500);
        napoli.aggiungiCondimentiAllaPizza(basilico());
        napoli.aggiungiCondimentiAllaPizza(alici());
        return napoli;
    }

    @Bean
    Pizza margherita(){
        return new Pizza("Margherita", 8, 800);
    }


    //    **********************************BEVANDE***************************
    @Bean
    Bevande cocacola() {
        return new Bevande("CocaCola", 5, 1000);
    }

    @Bean
    Bevande fanta() {
        return new Bevande("Fanta", 5, 800);
    }

    //******************************Condimenti**************************
    @Bean
    Condimenti prosciutto() {
        return new Condimenti("Prosciutto", 1.25, 150);
    }
    @Bean
    Condimenti basilico() {
        return new Condimenti("basilico", 0.25, 2);
    }
    @Bean
    Condimenti alici() {
        return new Condimenti("alici", 1.25, 70);
    }
    @Bean
    Condimenti funghi() {
        return new Condimenti("funghi", 1.25, 180);
    }
    @Bean
    Condimenti salsiccia() {
        return new Condimenti("salsiccia", 2.50, 300);
    }


    @Bean
    Menu getMenu() {
        Menu menu = new Menu();
        menu.aggiungiPizzaAlMenu(napoli());
        menu.aggiungiPizzaAlMenu(margherita());
        menu.aggiungiBevandaAlMenu(fanta());
        menu.aggiungiBevandaAlMenu(cocacola());
        menu.aggiungiCondimentoAlMenu(basilico());
        menu.aggiungiCondimentoAlMenu(alici());
        return menu;
    }


}
