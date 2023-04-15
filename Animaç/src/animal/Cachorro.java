package animal;


public class Cachorro implements Animal{

    @Override
    public void emitirsom() {
        System.out.println("AUAU");
    }

    @Override
    public void comer() {
        System.out.println("ração");
    }
 
}
