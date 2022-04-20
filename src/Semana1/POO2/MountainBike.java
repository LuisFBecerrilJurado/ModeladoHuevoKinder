package Semana1.POO2;

public class MountainBike {

    public static void main(String[] args) {
        show();
    }

    public static void show(){
        Bike b = new Bike("Azul","Benoto",6);
        System.out.println(b.getColor());
        System.out.println(b.getVelocidad());
        System.out.println(b.getMarca());
    }
}
