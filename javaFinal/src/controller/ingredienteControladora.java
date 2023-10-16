package controller;

import java.util.ArrayList;
import java.util.List;
import model.ingrediente;

public class ingredienteControladora {
    private List<ingrediente> Ingredientes;
    
    public ingredienteControladora() {
        this.Ingredientes = new ArrayList<>();
    }
    
    public void crearIngrediente(ingrediente Ingrediente) {
        Ingredientes.add(Ingrediente);
    }
    public ingrediente obtenerIngrediente(int id) {
        for (ingrediente ingrediente : Ingredientes) {
            if (ingrediente.getIdIngrediente() == id) {
                return ingrediente;
            }
        }
        return null;
    }
    
}
