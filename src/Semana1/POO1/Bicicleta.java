package Semana1.POO1;
// Se define la clase de bicicleta

public class Bicicleta {
    // Se definen las caracteristicas que poseerá la clase
    public int pins , rodada;
    public double velocidad;
    public String color;
    // Se definen las clases para retornar las caracteristicas de la bicicleta
    public double getVelocidad(){return velocidad;}
    public int getPins() { return pins;}
    public int getRodada() { return rodada; }
    public String getColor(){return color; }
    // Obtiene el valor de caracteristica Pins y comprueba que posea un valor
    public boolean setPins(int pins){
        if(pins > 0){
            this.pins = pins;
            return true;
        }else
            return false;
    }
    // Obtiene el valor de caracteristica Rodada y comprueba que posea un valor
    public boolean setRodada(int rodada){
        if(rodada > 0){
            this.rodada = rodada;
            return true;
        }else
            return false;
    }
    // Obtiene el valor de caracteristica Velocidad y comprueba que posea un valor
    public boolean setVelocidad(double velocidad){
        if(velocidad > 0){
            this.velocidad = velocidad;
            return true;
        }else
            return false;
    }
    // Obtiene el valor de caracteristica Color y comprueba que posea un valor
    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }else
            return  false;
    }
    // Recopila las caracteristicas de la bicicleta y las retorna
    public String printState(){
        return "pins: "+ pins + "\n" +
                "rodada: "+ rodada + "\n"+
                "velocidad: "+ velocidad + "\n" +
                "color: "+ color;
    }
}

