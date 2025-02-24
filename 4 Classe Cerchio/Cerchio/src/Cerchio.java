public class Cerchio {
    double raggio;
    public static final double PI = 3.14159265358979323846;
    public Cerchio(double raggio) {
        this.raggio = raggio;
    }
    public Cerchio() {
        this.raggio = 2.0;
    }
    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }
    public double calcolaCirconferenza(){
        return (raggio*2)*PI;
    }
    public double calcolaArea(){
        return (raggio*raggio)*PI;
    }
    @Override
    public String toString() {
        return "Raggio=" + raggio + "\nCirconferenza: "+ calcolaCirconferenza() + "\nArea: "+ calcolaArea() + "}";
    }
}
