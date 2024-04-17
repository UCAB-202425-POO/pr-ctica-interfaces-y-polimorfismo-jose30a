package ve.edu.ucab.lab;

import java.time.LocalDate;
import java.util.Objects;


public class Cereal implements EsAlimento {
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate caducidad;

    public Cereal(String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }



    @Override
    public String toString() {
        return "Cereal: " +
                "marca = '" + marca + '\'' +
                ", precio = " + precio +
                ", tipo = '" + tipoCereal + '\'' +
                ", calorias = " + getCalorias() +
                ", caducidad = " + caducidad;
    }

    @Override
    public void setCaducidad(LocalDate fc) {
        this.caducidad = fc;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        if (Objects.equals(tipoCereal, "espelta")) return 5;
        else if (Objects.equals(tipoCereal, "maiz")) return 8;
        else if (Objects.equals(tipoCereal, "trigo")) return 12;
        else return 15;
    }
}
