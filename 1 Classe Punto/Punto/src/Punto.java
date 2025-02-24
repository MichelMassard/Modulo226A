import java.security.PublicKey;

public class Punto {
    private double x;
    private double y;
    public Punto() {
        this.x = 1.0;
        this.y = 1.0;
    }
    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
    public double calcolaDistanza(){
        return Math.sqrt(x*x +y*y);
    }
    public String determinaQuadrante() {
        if (x > 0 && y > 0) {
            return "Il punto (" + x + "," + y + ") si trova nel quadrante 1";
        } else if (x > 0 && y < 0) {
            return "Il punto (" + x + "," + y + ") si trova nel quadrante 2";
        } else if (x < 0 && y < 0) {
            return "Il punto (" + x + "," + y + ") si trova nel quadrante 3";
        } else if (x < 0 && y > 0) {
            return "Il punto (" + x + "," + y + ") si trova nel quadrante 4";
        }
        return "";
    }
    @Override
    public String toString(){
        return "Punto{" + "x=" + x + ", y=" + y + "}\nDistanza: "+ calcolaDistanza()+ "\n"+ determinaQuadrante() ;
    }
}
