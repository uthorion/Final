package model;

public class TipoIngrediente {
    private String tipoDeProducto;
    private int cantidad;

    public TipoIngrediente(String tipoDeProducto, int cantidad) {
        this.tipoDeProducto = tipoDeProducto;
        this.cantidad = cantidad;
    }
    public String getTipoDeProducto() {
        return tipoDeProducto;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    @Override
    public String toString() {
        return "TipoIngrediente{" +
                "tipoDeProducto='" + tipoDeProducto + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
