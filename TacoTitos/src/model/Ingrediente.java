package model;

public class Ingrediente {
    private String nombre;
    private TipoIngrediente oTipoIngrediente;
    private float precio;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public TipoIngrediente getoTipoIngrediente() {
        return oTipoIngrediente;
    }
    public void setoTipoIngrediente(TipoIngrediente oTipoIngrediente) {
        this.oTipoIngrediente = oTipoIngrediente;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Ingrediente{" +
                "nombre='" + nombre + '\'' +
                ", oTipoIngrediente=" + oTipoIngrediente +
                ", precio=" + precio +
                '}';
    }
}
