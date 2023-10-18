package Controller;

import model.Ingrediente;

import java.util.ArrayList;
import java.util.List;

public class IngredienteController {
    private List<Ingrediente> ingredientes;

    public IngredienteController(){
        ingredientes = new ArrayList<>();
    }

    public void crearIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public Ingrediente obtenerIngredientePorId(int idIngrediente){
        for (Ingrediente ingrediente: ingredientes){
            if(ingrediente.getIdIngrediente() == idIngrediente){
                return ingrediente;
            }
        }
        return null;
    }

    public void actualizarIngrediente(int idIngrediente, Ingrediente nuevoIngrediente){
        for(int i=0;i<ingredientes.size();i++){
            if (ingredientes.get(i).getIdIngrediente() == idIngrediente){
                ingredientes.set(i,nuevoIngrediente);
                return;
            }
        }
    }

    public void borrarIngrediente(int idIngrediente){
        ingredientes.removeIf(ingrediente -> ingrediente.getIdIngrediente() == idIngrediente);
    }

    public List<Ingrediente> obtenerTodosLosIngredientes(){
        return ingredientes;
    }
}
