public class Suite extends Habitacion {

    private double valorServicioMinibar;

    public Suite (int numero, double precioBase, boolean estaOcupada, double valorServicioMinibar){
        super(numero, precioBase, estaOcupada);
        this.valorServicioMinibar = valorServicioMinibar;
    }

    @Override //Se cambia el comportamiento del padre
    public double calcularPrecioTotal(){
        return this.precioBase + this.valorServicioMinibar;
    }
    
}
