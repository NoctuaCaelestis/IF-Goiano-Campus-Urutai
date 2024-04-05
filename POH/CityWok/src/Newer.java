public class Newer extends NewerAbs {

    public Newer (String noise){
        super(noise);
    }
    @Override
    String emitirSom() {
        return noise;
    }
}
