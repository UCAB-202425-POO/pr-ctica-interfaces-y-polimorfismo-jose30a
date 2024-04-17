package ve.edu.ucab.lab;

public class Detergente implements EsLiquido, ConDescuento {
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
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



    @Override
    public String toString() {
        return "Detergente: " +
                "marca = '" + marca + '\'' +
                ", precio = " + precio +
                ", volumen = " + volumen +
                ", tipo de envase = '" + tipoEnvase + '\'' +
                ", descuento = " + descuento +
                ", precio con descuento =" + getPrecioDescuento() ;
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
}
