public class Hamburguesa {
    Pan tope;
    Pan fondo;
    Carne carne;
    Extra[] extras;
    int numExtras;

    public Hamburguesa(Pan tope, Pan fondo, Carne carne, int numExtras) {
        this.tope = tope;
        this.fondo = fondo;
        this.carne = carne;
        this.numExtras = numExtras;
        this.extras = new Extra[numExtras];
    }

    public void agregarExtra(Extra extra){
        for(int i = 0; i < numExtras; i++){
            if(extras[i] == null){
                extras[i] = extra;
                break;
            }
        }
    }
}
