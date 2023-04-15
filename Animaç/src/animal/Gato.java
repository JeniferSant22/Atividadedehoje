package animal;


public class Gato implements Animal{

    @Override
    public void emitirsom() {
        System.out.println("MIAU");
    }

    @Override
    public void comer() {
        System.out.println("ração");
    }

}
