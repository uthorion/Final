package model;

import java.util.Objects;

public class ingrediente {
    private int idIngrediente;
    private String nombreIngrediente;
    private float Precio;
    private tipoIngrediente TipoIngrediente; 

    public ingrediente(int idIngrediente, String nombreIngrediente, float Precio, tipoIngrediente TipoIngrediente) {
        this.idIngrediente = idIngrediente;
        this.nombreIngrediente = nombreIngrediente;
        this.Precio = Precio;
        this.TipoIngrediente = TipoIngrediente;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public String getNombreIngrediente() {
        return nombreIngrediente;
    }

    public float getPrecio() {
        return Precio;
    }

    public tipoIngrediente getTipoIngrediente() {
        return TipoIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public void setNombreIngrediente(String nombreIngrediente) {
        this.nombreIngrediente = nombreIngrediente;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public void setTipoIngrediente(tipoIngrediente TipoIngrediente) {
        this.TipoIngrediente = TipoIngrediente;
    }
    
    @Override
    public String toString() {
        return "Ingrediente{" +
                "id=" + idIngrediente +
                ", nombreIngrediente='" + nombreIngrediente + '\'' +
                ", precio=" + Precio +
                ", tipoIngrediente=" + TipoIngrediente +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ingrediente that = (ingrediente) o;
        return idIngrediente == that.idIngrediente &&
                Float.compare(that.Precio, Precio) == 0 &&
                Objects.equals(nombreIngrediente, that.nombreIngrediente) &&
                Objects.equals(TipoIngrediente, that.TipoIngrediente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idIngrediente, nombreIngrediente, Precio, TipoIngrediente);
    }
}
