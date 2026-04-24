package figgeo;

class Cubo extends figgeo {
    private float lado;

    public Cubo(float lado) {
        super("Cubo");
        this.lado = lado;
    }

    @Override
    public float calcularVolumen() {
        return lado * lado * lado;
    }

    @Override
    public float calcularAreaSuperficial() {
        return 6 * (lado * lado);
    }
}