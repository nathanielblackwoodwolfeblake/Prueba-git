package figgeo;

class Esfera extends figgeo {
    private float radio;

    public Esfera(float radio) {
        super("Esfera");
        this.radio = radio;
    }

    @Override
    public float calcularVolumen() {
        return (float) ((4.0/3.0) * Math.PI * Math.pow(radio, 3));
    }

    @Override
    public float calcularAreaSuperficial() {
        return (float) (4 * Math.PI * radio * radio);
    }
}