public class Camarero extends Empleado{

    public void recibir(Hamburgesa hamburgesa){
        this.tieneHamburguesa=true;
    }

    public void servir(){
        //imprimir
        this.tieneHamburguesa=false;
    }
}
