package co.unicauca.patronstate;

public class Embarcado implements EstadoPedido {
    private Pedido pedido;

    @Override
    public void enviar(Pedido aThis) {
        System.out.println("El pedido ya fue embarcado, no puede enviarse.");
    }

    @Override
    public void procesar(Pedido aThis) {
        System.out.println("El pedido ya fue embarcado, no puede procesarse.");
    }

    @Override
    public void embarcar(Pedido aThis) {
        System.out.println("El pedido ya esta embarcado.");
    }

    @Override
    public void recibir(Pedido aThis) {
        System.out.println("El pedido ha sido RECIBIDO por el cliente.");
        pedido.setEstado(new Recibido());
    }

    @Override
    public void cancelar(Pedido aThis) {
        System.out.println("No se puede cancelar un pedido embarcado.");
    }

    @Override
    public String getNombreEstado() {
        return "Embarcado";
    }
}
