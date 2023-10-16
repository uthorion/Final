package controller;


import java.util.Scanner;
import model.tipoIngrediente;
    
public class ingredienteController {
    public void accion(){
        Scanner sc = new Scanner(System.in);
        
        int idTipoIngrediente = 0;
        String detalle = null;
        int cantidadMax = 0;
        
        System.out.println("ingrese el id");
        idTipoIngrediente = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese el detalle del tipo de ingrediente");
        detalle = sc.nextLine();
        System.out.println("ingrese la cantidad maxima");
        cantidadMax = sc.nextInt();
        
        tipoIngrediente newTipoIngrediente = new tipoIngrediente(idTipoIngrediente,detalle,cantidadMax);
        
        imprimirDatos(newTipoIngrediente);
    }
    
    private void imprimirDatos(tipoIngrediente TipoIngrediente){
        System.out.println("id " + TipoIngrediente.getIdTipoingrediente());
        System.out.println("detalle " + TipoIngrediente.getDetalle());
        System.out.println("cantidad maxima " + TipoIngrediente.getCantidadMax());
    }
}

