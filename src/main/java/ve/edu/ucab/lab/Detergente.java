package ve.edu.ucab.lab;

public class Detergente implements EsLiquido, ConDescuento {
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;
    private double precioDescuento;

    public Detergente(String marca, double precio, int volumen, String tipoEnvase, double descuento, double precioDescuento) {
        this.marca = marca;
        this.precio = precio;
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



    @Override
    public String toString() {
        return "Detergente{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", volumen=" + volumen +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                ", descuento=" + descuento +
                ", precioDescuento=" + precioDescuento +
                '}';
    }

    @Override
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioDescuento() {
        double d;
        return 0;
    }
}
