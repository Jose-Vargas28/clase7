public class Avion extends Transporte {
    String tipo;
    double altitudMaxima;

    public Avion() {
    }

    public Avion(int capacidad, double velocidad, String tipo, double altitudMaxima) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.altitudMaxima = altitudMaxima;
    }
    public Avion(int capacidad, double velocidad) {
        super(capacidad, velocidad);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltitudMaxima() {
        return altitudMaxima;
    }

    public void setAltitudMaxima(double altitudMaxima) {
        this.altitudMaxima = altitudMaxima;
    }

    public void darAviso(){
        System.out.println("Altitud alcanzada");
    }
}
