public class Habitacion {
    
    protected int numero; //protected por herencia familiar. Es private, pero solo los hijos pueden usarlo
    protected double precioBase;
    protected boolean estaOcupada;

    public Habitacion (int numero, double precioBase, boolean estaOcupada){
        this.numero = numero;
        this.precioBase = precioBase;
        this.estaOcupada = false;
    }

    public double calcularPrecioTotal(){
        return precioBase;
    }


}
