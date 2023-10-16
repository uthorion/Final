package model;

import java.util.List;
import java.util.Objects;

public class Taco {
    
    private int numeroTaco;
    private List<ingrediente> Ingrediente;
    private float precioTotal;

    public Taco(int numeroTaco, List<ingrediente> Ingrediente, float precioTotal) {
        this.numeroTaco = numeroTaco;
        this.Ingrediente = Ingrediente;
        this.precioTotal = precioTotal;
    }

    public int getNumeroTaco() {
        return numeroTaco;
    }

    public List<ingrediente> getIngrediente() {
        return Ingrediente;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setNumeroTaco(int numeroTaco) {
        this.numeroTaco = numeroTaco;
    }

    public void setIngrediente(List<ingrediente> Ingrediente) {
        this.Ingrediente = Ingrediente;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public String toString() {
        return "Taco{" +
                "numeroTaco=" + numeroTaco +
                ", ingredientes=" + Ingrediente +
                ", precioTotal=" + precioTotal +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taco taco = (Taco) o;
        return numeroTaco == taco.numeroTaco &&
                Float.compare(taco.precioTotal, precioTotal) == 0 &&
                Objects.equals(Ingrediente, taco.Ingrediente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroTaco, Ingrediente, precioTotal);
    }
}
