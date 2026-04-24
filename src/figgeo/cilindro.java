package figgeo;

class Cilindro extends figgeo {
    private float radio;
    private float altura;

    public Cilindro(float radio, float altura) {
        super("Cilindro");
        this.radio = radio;
        this.altura = altura;
    }

    @Override
    public float calcularVolumen() {
        return (float) (Math.PI * radio * radio * altura);
    }

    @Override
    public float calcularAreaSuperficial() {
        float areaBase = (float) (Math.PI * radio * radio);
        float areaLateral = (float) (2 * Math.PI * radio * altura);
        return 2 * areaBase + areaLateral;
    }
}