package figgeo;

abstract class figgeo {
    protected String nombre;

    public figgeo(String nombre) {
        this.nombre = nombre;
    }

    public abstract float calcularVolumen();
    public abstract float calcularAreaSuperficial();

    public void imprimirInformacion() {
        System.out.println("Figura 3D: " + nombre);
        System.out.println("Volumen: " + calcularVolumen() + " unidades cúbicas");
        System.out.println("Área superficial: " + calcularAreaSuperficial() + " unidades cuadradas");
        System.out.println("--------------------------");
    }
}