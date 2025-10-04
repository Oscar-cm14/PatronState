package co.unicauca.patronstate;

public class TiendaOnlineDemo {

    public static void main(String[] args) {
        // Crear un pedido
        Pedido pedido = new Pedido("ORD-001", "Juan Pérez", "Laptop Gaming", 1500.00);
        pedido.mostrarEstado();

        System.out.println("\n--- Flujo normal del pedido ---");
        pedido.enviar();
        pedido.recibir();
        pedido.procesar();
        pedido.embarcar();

        System.out.println("\n--- Intentando acciones inválidas ---");
        pedido.enviar(); // Debe fallar
        pedido.cancelar(); // Debe fallar

        System.out.println("\n--- Creando otro pedido y cancelando ---");
        Pedido pedido2 = new Pedido("ORD-002", "María García", "Smartphone", 800.00);
        pedido2.mostrarEstado();
        pedido2.cancelar();
        pedido2.enviar(); // Debe fallar
    }
}
