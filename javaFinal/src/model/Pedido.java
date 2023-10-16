
package model;

import java.util.List;
import java.util.Objects;

public class Pedido {
    
    private int numeroPedido;
    private List<Taco> Tacos;
    private float precioTotalPedidos;

    public Pedido(int numeroPedido, List<Taco> Tacos, float precioTotalPedidos) {
        this.numeroPedido = numeroPedido;
        this.Tacos = Tacos;
        this.precioTotalPedidos = precioTotalPedidos;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public List<Taco> getTacos() {
        return Tacos;
    }

    public float getPrecioTotalPedidos() {
        return precioTotalPedidos;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setTacos(List<Taco> Tacos) {
        this.Tacos = Tacos;
    }

    public void setPrecioTotalPedidos(float precioTotalPedidos) {
        this.precioTotalPedidos = precioTotalPedidos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", tacos=" + Tacos +
                ", precioTotalPedido=" + precioTotalPedidos +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return numeroPedido == pedido.numeroPedido &&
                Float.compare(pedido.precioTotalPedidos, precioTotalPedidos) == 0 &&
                Objects.equals(Tacos, pedido.Tacos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroPedido, Tacos, precioTotalPedidos);
    }
}
