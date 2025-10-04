package co.unicauca.patronstate;

public class Procesado implements EstadoPedido {

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Error: El pedido ya fue procesado");
    }

    @Override
    public void recibir(Pedido pedido) {
        System.out.println("Error: El pedido ya fue procesado");
    }

    @Override
    public void procesar(Pedido pedido) {
        System.out.println("Error: El pedido ya fue procesado");
    }

    @Override
    public void embarcar(Pedido pedido) {
        System.out.println("Embarcando pedido procesado...");
        pedido.setEstado(new Embarcado());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Cancelando pedido procesado... Proceso más complejo requerido");
        pedido.setEstado(new Cancelado());
    }

    @Override
    public String getNombreEstado() {
        return "Procesado";
    }
}
