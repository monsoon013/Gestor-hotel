public class Hotel {
    private Habitacion[] inventario = new Habitacion[2];

    public void ejemplo(){
        inventario[0] = new Habitacion(101, 50 , false);
        inventario[1] = new Suite(102, 100, false, 30);

        for(Habitacion h : inventario){
            System.err.println("Habitación " + h.numero + " | Total: " + h.calcularPrecioTotal());
        }
    }
}
