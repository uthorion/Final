package model;

import java.util.List;

public class Pedido {
    private List<Taco> tacos;
    private int idPedido;

    public Pedido(List<Taco> tacos, int idPedido) {
        this.tacos = tacos;
        this.idPedido = idPedido;
    }

    public List<Taco> getTacos() {
        return tacos;
    }

    public void setTacos(List<Taco> tacos) {
        this.tacos = tacos;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
}
