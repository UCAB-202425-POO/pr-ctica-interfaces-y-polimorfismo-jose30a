package ve.edu.ucab.lab;

import java.time.LocalDate;

public class Vino implements EsAlimento,EsLiquido,ConDescuento {
    private String marca;
    private double precio;
    private String tipoVino;
    private int gradosAlcoholicos;
    private int calorias;
    private LocalDate caducidad;
    private int volumen;
    private String tipoEnvase;
    private double descuento;
    private double precioDescuento;

    public Vino(String marca, double precio, String tipo, int gradosAlcoholicos, int calorias, LocalDate caducidad, int volumen, String tipoEnvase, double descuento, double precioDescuento) {
        this.marca = marca;
        this.precio = precio;
        this.tipoVino = tipo;
        this.gradosAlcoholicos = gradosAlcoholicos;
        this.calorias = calorias;
        this.caducidad = caducidad;
        this.volumen = volumen;
        this.tipoEnvase = tipoEnvase;
        this.descuento = descuento;
        this.precioDescuento = precioDescuento;
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
        return "Vino{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoVino='" + tipoVino + '\'' +
                ", gradosAlcoholicos=" + gradosAlcoholicos +
                ", calorias=" + calorias +
                ", caducidad=" + caducidad +
                ", volumen=" + volumen +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                ", descuento=" + descuento +
                ", precioDescuento=" + precioDescuento +
                '}';
    }

    @Override
    public void setDescuento(double des) {

    }

    @Override
    public double getDescuento() {
        return 0;
    }

    @Override
    public double getPrecioDescuento() {
        return 0;
    }

    @Override
    public void setCaducidad(LocalDate fc) {

    }

    @Override
    public LocalDate getCaducidad() {
        return null;
    }

    @Override
    public int getCalorias() {
        return 0;
    }

    @Override
    public void setVolumen(double v) {

    }

    @Override
    public double getVolumen() {
        return 0;
    }

    @Override
    public void setTipoEnvase(String env) {

    }

    @Override
    public String getTipoEnvase() {
        return null;
    }
}
