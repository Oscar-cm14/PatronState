package co.unicauca.patronstate;

public class Recibido implements EstadoPedido {

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Error: El pedido ya fue recibido");
    }

    @Override
    public void recibir(Pedido pedido) {
        System.out.println("Error: El pedido ya fue recibido");
    }

    @Override
    public void procesar(Pedido pedido) {
        System.out.println("Procesando pedido recibido...");
        pedido.setEstado(new Procesado());
    }

    @Override
    public void embarcar(Pedido pedido) {
        System.out.println("Error: No se puede embarcar sin procesar primero");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Cancelando pedido recibido... Proceso de devolución iniciado");
        pedido.setEstado(new Cancelado());
    }

    @Override
    public String getNombreEstado() {
        return "Recibido";
    }
}
