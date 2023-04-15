package atividadedehoje;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    public static void main(String[] args) {
       
        Juridica juridica = new Juridica("8561366", "84165489", LocalDate.of(2002, Month.MARCH, 26), LocalDate.of(2016, Month.APRIL, 10), 250000, 545452, "Jenifer", Genero.FEMININO, 
                             new Endereco("Rua Alagados", "60", "acima da escolinha", "84515225", "Salvador", "515854965"));
    
    Funcionario funcionario = new Funcionario("541564652", "3215648485", LocalDate.of(2025, Month.APRIL, 26), 2610121, 26, "Gatinho", Genero.MASCULINO, 
                                new Endereco("Rua Monteiro Lobato", "35", "acima da delegacia", "40430140", "Salvador", "5415485"));
        
    
        System.out.println(juridica.toString());
        System.out.println(funcionario.toString());
    }   
}
