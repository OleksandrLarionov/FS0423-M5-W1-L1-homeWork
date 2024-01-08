package larionov.menu.entities;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    @Setter
    private String nomePizza;
    @Setter
    private String basePizza;
    @Setter
    private double prezzoPizza;
    @Setter
    private String infoNutrizionali;
    private List<String> condimenti;

    public Pizza(String nomePizza, double prezzoPizza) {
        this.nomePizza = nomePizza;
        this.basePizza = "Mozzarella e Pommidoro";
        this.prezzoPizza = prezzoPizza;
        this.infoNutrizionali = "";
        this.condimenti = new ArrayList<>();
    }

    public String getNomePizza() {
        return nomePizza;
    }

    public String getBasePizza() {
        return basePizza;
    }

    public double getPrezzoPizza() {
        return prezzoPizza;
    }

    public List<String> getCondimenti() {
        return condimenti;
    }

    public void aggiungiCondimenti(String condimento) {
        this.condimenti.add(condimento);
    }
    public void infoNutrizionali (){
        System.out.println("Questi sono i valori nutrizionali :" + this.infoNutrizionali);
    }

    @Override
    public String toString() {
        return
                "\n" + nomePizza + ":" + " " + basePizza + " ------ " + prezzoPizza + " Euro\n";
    }

}
