//herencia con la palabra extends
public class Auto extends Transporte {
    String tipo;
    int cilindraje;

    //sin parámetros
    public Auto() {
    }

//primero se pone los atributos de la clase padre y luego los de la hija
    //padre e hija
    public Auto(int capacidad, double velocidad, String tipo, int cilindraje) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }
//solo padre
    public Auto(int capacidad, double velocidad) {
        super(capacidad, velocidad);
    }

    //solo hija
    public Auto(String tipo, int cilindraje) {
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public void prenderRadio(){
        System.out.println("El radio está prendido");
    }
}

