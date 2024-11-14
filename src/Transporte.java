public class Transporte {
    int capacidad;
    double velocidad;

    public Transporte() {
    }

    public Transporte(int capacidad, double velocidad) {
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    //método personalizado

    public void mostrarDatos(){
        System.out.println("La capacidad es: " + capacidad);
        System.out.println("La Velocidad es: " + velocidad);
    }
}


