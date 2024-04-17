package ve.edu.ucab.lab;

import java.time.LocalDate;

public class Vino implements EsAlimento,EsLiquido,ConDescuento {
    private String marca;
    private double precio;
    private String tipoVino;
    private int gradosAlcoholicos;
    private LocalDate caducidad;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    public Vino(String marca, double precio, String tipo, int gradosAlcoholicos) {
        this.marca = marca;
        this.precio = precio;
        this.tipoVino = tipo;
        this.gradosAlcoholicos = gradosAlcoholicos;
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

    public String getTipoVino() {
        return tipoVino;
    }

    public void setTipoVino(String tipo) {
        this.tipoVino = tipo;
    }

    public int getGradosAlcoholicos() {
        return gradosAlcoholicos;
    }

    public void setGradosAlcoholicos(int gradosAlcoholicos) {
        this.gradosAlcoholicos = gradosAlcoholicos;
    }

    @Override
    public String toString() {
        return "Vino: " +
                "marca ='" + marca + '\'' +
                ", precio = " + precio +
                ", tipo de vino = '" + tipoVino + '\'' +
                ", grados alcoholicos = " + gradosAlcoholicos +
                ", calorias = " + getCalorias() +
                ", caducidad = " + caducidad +
                ", volumen en ml = " + volumen +
                ", tipo de envase = '" + tipoEnvase + '\'' +
                ", descuento = " + descuento +
                "%, precio con descuento = " + getPrecioDescuento();
    }

    @Override
    public void setDescuento(double des) {
        this.descuento = des;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        double d;
        d =precio - (descuento/100 *precio) ;
        return d;
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
        return (gradosAlcoholicos*10);
    }

    @Override
    public void setVolumen(double v) {
        this.volumen = v;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String env) {
        this.tipoEnvase = env;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }
}
