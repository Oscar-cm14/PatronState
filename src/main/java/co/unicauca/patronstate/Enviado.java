package co.unicauca.patronstate;

public class Enviado implements EstadoPedido {

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("El pedido ya fue enviado.");
    }

    @Override
    public void procesar(Pedido pedido) {
        System.out.println("El pedido esta siendo procesado...");
        pedido.setEstado(new Procesado());
    }

    @Override
    public void embarcar(Pedido pedido) {
        System.out.println("Debe procesar el pedido antes de embarcar.");
    }

    @Override
    public void recibir(Pedido pedido) {
        System.out.println("El pedido aun no puede recibirse.");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado");
        pedido.setEstado(new Cancelado());
    }

    @Override
    public String getNombreEstado() {
        return "Enviado";
    }
}