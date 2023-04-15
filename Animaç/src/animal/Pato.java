package animal;


public class Pato implements Animal{

    @Override
    public void emitirsom() {
        System.out.println("QUACK");
    }

    @Override
    public void comer() {
        System.out.println("insetos");
    }

    
}
