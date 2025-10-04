package co.unicauca.patronstate;

/**
 * Interfaz que define el contrato para los estados de un Pedido.
 * Cada estado concreto deberá implementar estas operaciones.
 */
public interface EstadoPedido {

    void enviar(Pedido pedido);
    void procesar(Pedido pedido);
    void embarcar(Pedido pedido);
    void recibir(Pedido pedido);
    void cancelar(Pedido pedido);

    /**
     * Retorna el nombre del estado actual.
     */
    String getNombreEstado();
}