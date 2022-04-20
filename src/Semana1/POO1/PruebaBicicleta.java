package Semana1.POO1;

public class PruebaBicicleta {
    // Se llama a la clase def para su ejecución al ser "Static" solo se ejecuta una vez.
    public static void main(String[] args) {
        def();
    }

    public static void def(){
        /* Crea un nuevo objeto que interactúa con las clases de definición
           por medio de Constructor */
        Bicicleta biciMountain = new Bicicleta();
        /* Se asignan características para añadirlas al objeto
           Operador de inderección (biciMountain.) tiene acceso a todas características
           del Objeto */

        biciMountain.setColor("Plateado");
        biciMountain.setPins(3);
        biciMountain.setRodada(16);
        biciMountain.setVelocidad(30.2);
        //Obtiene las caracteristicas de la bicicleta
        String msg = "Soy una bici de montana con estas caracteristicas: ";
        msg += "\nColor: "     + biciMountain.getColor();
        msg += "\nVelocidad: " + biciMountain.getVelocidad();
        msg += "\nPins: "      + biciMountain.getPins();
        msg += "\nRodada: "    + biciMountain.getRodada();
        // Imprime el objeto con las caracteristicas dadas
        System.out.print(msg);
    }
}
