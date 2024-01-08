package larionov.menu;

public class Bevande {
    private String nomeBevanda;
    private double prezzoBevanda;

    public Bevande(String nomeBevanda, double prezzoBevanda) {
        this.nomeBevanda = nomeBevanda;
        this.prezzoBevanda = prezzoBevanda;
    }

    public String getNomeBevanda() {
        return nomeBevanda;
    }

    public double getPrezzoBevanda() {
        return prezzoBevanda;
    }

    public void setNomeBevanda(String nomeBevanda) {
        this.nomeBevanda = nomeBevanda;
    }

    public void setPrezzoBevanda(double prezzoBevanda) {
        this.prezzoBevanda = prezzoBevanda;
    }

    @Override
    public String toString() {
        return "Bevande{" +
                "nomeBevanda='" + nomeBevanda + '\'' +
                ", prezzoBevanda=" + prezzoBevanda +
                '}';
    }
}
