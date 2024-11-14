public class Main {
    public static void main(String[] args) {
        //crear objetos


        // padre e hija
        Auto auto1 = new Auto(5,120, "Gasolina",1500);
        auto1.prenderRadio();
        auto1.mostrarDatos();

        //sin parámetros
        Auto auto2 = new Auto();
        auto2.mostrarDatos();

        //solo padre
        Auto auto3 = new Auto(6,120);
        auto3.prenderRadio();
        auto3.mostrarDatos();

        //solo hija y después seteo
        Auto auto4 = new Auto("Diesel", 2500);
        auto4.setCapacidad(8);
        auto4.setVelocidad(130);
        auto4.prenderRadio();
        auto4.mostrarDatos();



        Bicicleta bicicleta1 = new Bicicleta();
        bicicleta1.prenderLuces();
        Bicicleta bicicleta2 = new Bicicleta(5,30,"Montañera",0);
        bicicleta2.mostrarDatos();
        Bicicleta bicicleta3 = new Bicicleta();
        bicicleta3.mostrarDatos();

        Avion avion1 = new Avion(5,800, "Gasolina",1500);
        avion1.darAviso();
        avion1.mostrarDatos();
        Avion avion2 = new Avion();
        avion2.mostrarDatos();



    }
}