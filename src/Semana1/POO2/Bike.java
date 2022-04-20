package Semana1.POO2;

public class Bike {
    private int velocidad;
    private String color, marca;

    public Bike(){ }

    public Bike (String color){ this.color = color; }

    public Bike (String color, int velocidad){
        this.velocidad = velocidad;
        this.color = color;
    }
    public Bike (String color, String marca, int velocidad){
        this.marca = marca;
        this.velocidad = velocidad;
        this.color = color;
    }
    public int getVelocidad(){ return velocidad; }

    public String getColor() { return color; }

    public String getMarca() { return marca; }
}
