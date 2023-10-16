package model;

import java.util.Objects;

public class tipoIngrediente {
    
    private int idTipoIngrediente;
    private String detalle;
    private int cantidadMax;
    
    public tipoIngrediente(int idTipoingrediente, String detalle, int cantidadMax) {
        this.idTipoIngrediente = idTipoingrediente;
        this.detalle = detalle;
        this.cantidadMax = cantidadMax;
    }

    public int getIdTipoingrediente() {
        return idTipoIngrediente;
    }

    public String getDetalle() {
        return detalle;
    }

    public int getCantidadMax() {
        return cantidadMax;
    }

    public void setIdTipoingrediente(int idTipoingrediente) {
        this.idTipoIngrediente = idTipoingrediente;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setCantidadMax(int cantidadMax) {
        this.cantidadMax = cantidadMax;
    }
    
    @Override
    public String toString() {
        return "TipoIngrediente{" +
                "id=" + idTipoIngrediente +
                ", detalle='" + detalle + '\'' +
                ", cantidadMax=" + cantidadMax +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        tipoIngrediente that = (tipoIngrediente) o;
        return idTipoIngrediente == that.idTipoIngrediente &&
                cantidadMax == that.cantidadMax &&
                Objects.equals(detalle, that.detalle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTipoIngrediente, detalle, cantidadMax);
    }
}
