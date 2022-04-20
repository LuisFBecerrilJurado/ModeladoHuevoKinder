package HuevoKinder;

public class juguete {
    public String Tipo;
    public String Nombre;
    public String Ali;
    public String Color;
    public String Accesorios;
    public int NoPatas;

    public String getTipo() {
        return Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getAli() {
        return Ali;
    }

    public String getColor() {
        return Color;
    }

    public String getAccesorios() {
        return Accesorios;
    }

    public int getNoPatas() {
        return NoPatas;
    }

    public boolean setTipo(String Tipo) {
        if (!Tipo.isEmpty()) {
            this.Tipo = Tipo;
            return true;
        } else
            return false;
    }

    public boolean setNombre(String Nombre) {
        if (!Nombre.isEmpty()) {
            this.Nombre = Nombre;
            return true;
        } else
            return false;
    }

    public boolean setAli(String Ali) {
        if (!Ali.isEmpty()) {
            this.Ali = Ali;
            return true;
        } else
            return false;
    }

    public boolean setColor(String Color) {
        if (!Color.isEmpty()) {
            this.Color = Color;
            return true;
        } else
            return false;
    }

    public boolean setAccesorios(String Accesorios) {
        if (!Accesorios.isEmpty()) {
            this.Accesorios = Accesorios;
            return true;
        } else
            return false;
    }

    public boolean setNoPatas(int NoPatas) {
        if (NoPatas > 0) {
            this.NoPatas = NoPatas;
            return true;
        } else
            return false;
    }
}


