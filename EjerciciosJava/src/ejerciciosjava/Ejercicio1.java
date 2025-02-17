package ejerciciosjava;

public class Ejercicio1 {
    public static void ejecutar() {
        Cliente cliente = new Cliente("Fabian Gamboa", true, 'A');
        Producto producto = new Producto("Laptop", 1200000);
        Factura factura = new Factura(cliente, producto, 2);
        factura.imprimirFactura();
    }
}

class Cliente {
    String nombre;
    boolean esEstudiante;
    char tipoCliente;

    public Cliente(String nombre, boolean esEstudiante, char tipoCliente) {
        this.nombre = nombre;
        this.esEstudiante = esEstudiante;
        this.tipoCliente = tipoCliente;
    }
}

class Producto {
    String nombre;
    double precioUnitario;

    public Producto(String nombre, double precioUnitario) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }
}

class Factura {
    Cliente cliente;
    Producto producto;
    int cantidad;

    public Factura(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return cantidad * producto.precioUnitario;
    }

    public double calcularImpuesto() {
        double tasaImpuesto = cliente.esEstudiante ? 0.05 : 0.13;
        return calcularSubtotal() * tasaImpuesto;
    }

    public double calcularTotal() {
        return calcularSubtotal() + calcularImpuesto();
    }

    public void imprimirFactura() {
        System.out.println("\n--- FACTURA ---");
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Tipo de Cliente: " + cliente.tipoCliente);
        System.out.println("Producto: " + producto.nombre);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: $" + String.format("%.2f", producto.precioUnitario));
        System.out.println("Subtotal: $" + String.format("%.2f", calcularSubtotal()));
        System.out.println("Impuesto: $" + String.format("%.2f", calcularImpuesto()));
        System.out.println("Total a pagar: $" + String.format("%.2f", calcularTotal()));
    }
}
