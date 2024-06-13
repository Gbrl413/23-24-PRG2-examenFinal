public class Camarero extends Empleado{

    public void recibir(Hamburguesa hamburguesa){
        this.tieneHamburguesa=true;
        System.out.print("Sale una");
        hamburguesa.describir();
    }

    public void servir(){
        System.out.println("hamburgesa");
        this.tieneHamburguesa=false;
    }
}
