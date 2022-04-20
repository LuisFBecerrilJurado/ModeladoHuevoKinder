package HuevoKinder;

public class sorpresa {
    public static void main(String[] args) { def();}

    public static void def() {

        juguete Leon = new juguete();
        Leon.setTipo("Animal");
        Leon.setNombre("Leon");
        Leon.setAli("Carnívoro");
        Leon.setColor("Amarillo");
        Leon.setAccesorios("Pasto, Base para saltar");
        Leon.setNoPatas(4);

        String msg = "El juguete sorpresa tiene las siguientes características: ";
        msg += "\nTipo: "           + Leon.getTipo();
        msg += "\nNombre: "         + Leon.getNombre();
        msg += "\nAlimentación: "   + Leon.getAli();
        msg += "\nColor: "          + Leon.getColor();
        msg += "\nAccesorios: "     + Leon.getAccesorios();
        msg += "\nNumero de Patas:" + Leon.getNoPatas();
        System.out.print(msg);
    }
}


