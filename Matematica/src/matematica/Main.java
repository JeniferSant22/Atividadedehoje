
package matematica;


public class Main {
    public static void main(String[] args) {
        
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica subtracao = new Subtracao();
        OperacaoMatematica multiplicacao = new Multiplicacao();
        OperacaoMatematica divisao = new Divisao();
        
        double a = 26;
        double b = 10;
        
        System.out.println(soma.calcular(a,b));
        System.out.println(subtracao.calcular(a, b));
        System.out.println(multiplicacao.calcular(a, b));
        System.out.println(divisao.calcular(a, b));
    }
    
}
