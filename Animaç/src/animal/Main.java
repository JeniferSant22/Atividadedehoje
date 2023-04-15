package animal;

public class Main {
    public static void main(String[] args) {
        
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Galo galo = new Galo();
        Pato pato = new Pato();
        
        gato.comer();
        gato.emitirsom();
        cachorro.comer();
        cachorro.emitirsom();
        galo.comer();
        galo.emitirsom();
        pato.comer();
        pato.emitirsom();
    
    }
    
}
