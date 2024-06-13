public class Camarero extends Empleado{

    public void recibir(Hamburguesa hamburguesa){
        this.tieneHamburguesa=true;
        System.out.println("Sale una Hamburgesa");
    }

    public void servir(){
        System.out.println("hamburgesa");
        this.tieneHamburguesa=false;
    }
}
