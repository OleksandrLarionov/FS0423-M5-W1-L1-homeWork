package larionov.menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Pizza> pizzeMenu;
    private List<Bevande> bevandeMenu;

    public Menu() {
        this.pizzeMenu = new ArrayList<>();
        this.bevandeMenu = new ArrayList<>();
    }

    public List<Pizza> getPizzeMenu() {
        return pizzeMenu;
    }

    public List<Bevande> getBevandeMenu() {
        return bevandeMenu;
    }

    public void aggiungiPizzaAlMenu (Pizza pizza){
        this.pizzeMenu.add(pizza);
    }

    public void aggiungiBevandaAlMenu (Bevande bevanda){
        this.bevandeMenu.add(bevanda);
    }

    @Override
    public String toString() {
        return "Menu{" +
                "Pizze=" + pizzeMenu +
                ", Bevande=" + bevandeMenu +
                '}';
    }
}
