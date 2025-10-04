package co.unicauca.patronstate;

public class Pedido {

    private EstadoPedido estado;
    private String id;
    private String cliente;
    private String producto;
    private double total;

    public Pedido(String id, String cliente, String producto, double total) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
        this.estado = new NoEnviado(); // Estado inicial
    }

    // Métodos que delegan al estado actual
    public void enviar() {
        estado.enviar(this);
    }

    public void recibir() {
        estado.recibir(this);
    }

    public void procesar() {
        estado.procesar(this);
    }

    public void embarcar() {
        estado.embarcar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }

    // Getters y Setters
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
        System.out.println("Estado cambiado a: " + estado.getNombreEstado());
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public String getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }

    public double getTotal() {
        return total;
    }

    public void mostrarEstado() {
        System.out.println("Pedido " + id + " - Estado actual: " + estado.getNombreEstado());
    }
}
