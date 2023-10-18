package Controller;
import model.Ingrediente;
import model.Taco;

import java.util.ArrayList;
import java.util.List;

public class TacoController {
    private List<Taco> tacos;

    public TacoController(){
        tacos = new ArrayList<>();
    }

    public void crearTaco(Taco taco){
        tacos.add(taco);
    }

    public Taco obtenerTacoPorId(int idTaco){
        for (Taco taco: tacos){
            if (taco.getIdTaco() == idTaco){
                return taco;
            }
        }
        System.out.println("producto no encontrado");
        return null;
    }

    public void actualizarTaco(int idTaco, Taco nuevoTaco){
        for (int i=0;i<tacos.size();i++){
            if (tacos.get(i).getIdTaco() == idTaco){
                tacos.set(i,nuevoTaco);
                return;
            }
        }
        //taco no encontrado para actualizar
    }

    public void borrarTaco(int idTaco){
        tacos.removeIf(taco -> taco.getIdTaco() == idTaco);
    }

    public List<Taco> obtenerTodosLosTacos() {
        return tacos;
    }

    public Float determinarValorGrupal(){
        float valorTotalTacos = 0;

        for(Taco taco : tacos){
            valorTotalTacos += taco.determinarValor();
        }
        return valorTotalTacos;
    }
    public Taco tacoMasEconomico(){
        Taco masEconomico = tacos.get(0);
        for(int i=1;i<tacos.size();i++){
            if(masEconomico.determinarValor() < tacos.get(i).determinarValor()){
                masEconomico = tacos.get(i);
            }
        }
        return masEconomico;
    }
    public Taco tacoMasCaro(){
        Taco masCaro = tacos.get(0);
        for(int i = 1; i<tacos.size();i++){
            if (masCaro.determinarValor() < tacos.get(i).determinarValor()){
                masCaro = tacos.get(i);
            }
        }
        return masCaro;
    }

    public float tacoPromedio(){
        float Promedio = 0;
        float aux = 0;
        for(int i = 1;i<tacos.size();i++){
            aux += tacos.get(i).determinarValor();
        }
        Promedio = aux / tacos.size();
        return Promedio;
    }
}
