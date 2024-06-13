public class Res extends Carne{

    private String coccion;
    public Res(String coccion) { this.coccion = coccion; }

    @Override
    void describir() { System.out.print("Res ("+coccion+"), "); }

    @Override
    void representar() { System.out.println("::::::::::::");}
}
