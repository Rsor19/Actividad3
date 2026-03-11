package co.edu.uniquindio.poo.model;

public class Bicicleta {
    private String marca;
    private String serial;
    private String color;

    public Bicicleta(String marca, String serial, String color) {
        this.marca = marca;
        this.serial = serial;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", serial='" + serial + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
