package model;

import java.util.List;

public class Taco {
    private List<Ingrediente> ingredientes;
    private int idTaco;

    public Taco(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getIdTaco() {
        return idTaco;
    }

    public void setIdTaco(int idTaco) {
        this.idTaco = idTaco;
    }

    public Float determinarValor(){
        float valor = 0;

        for(Ingrediente ingrediente : ingredientes){
            valor += ingrediente.getPrecio();
        }
        return valor;
    }

}
