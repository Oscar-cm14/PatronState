package co.unicauca.patronstate;

public class NoEnviado implements EstadoPedido {

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido siendo enviado...");
        pedido.setEstado(new Enviado());
    }

    @Override
    public void recibir(Pedido pedido) {
        System.out.println("Error: No se puede recibir un pedido no enviado");
    }

    @Override
    public void procesar(Pedido pedido) {
        System.out.println("Error: No se puede procesar un pedido no enviado");
    }

    @Override
    public void embarcar(Pedido pedido) {
        System.out.println("Error: No se puede embarcar un pedido no enviado");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado");
        pedido.setEstado(new Cancelado());
    }

    @Override
    public String getNombreEstado() {
        return "No Enviado";
    }
}
