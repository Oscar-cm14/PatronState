package co.unicauca.patronstate;

public class Cancelado implements EstadoPedido {
    private Pedido pedido;

    @Override
    public void enviar(Pedido aThis) {
        System.out.println("El pedido esta cancelado, no puede enviarse.");
    }

    @Override
    public void procesar(Pedido aThis) {
        System.out.println("El pedido esta cancelado, no puede procesarse.");
    }

    @Override
    public void embarcar(Pedido aThis) {
        System.out.println("El pedido esta cancelado, no puede embarcarse.");
    }

    @Override
    public void recibir(Pedido aThis) {
        System.out.println("El pedido esta cancelado, no puede recibirse.");
    }

    @Override
    public void cancelar(Pedido aThis) {
        System.out.println("El pedido ya esta cancelado.");
    }

    @Override
    public String getNombreEstado() {
        return "Cancelado";
    }
}