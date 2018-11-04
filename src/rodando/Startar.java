package rodando;

import business.Cargo;
import business.Funcionario;
import business.Venda;

public class Startar {

	public static void main(String[] args) {
		Funcionario atendente = new Funcionario();
        atendente.setNome("Maria da Silva");
        atendente.setSalario(1200.00);
        atendente.setCargo(Cargo.AJUDANTE);

        Venda novaVenda = new Venda(atendente, 200.0);

        System.out.println("valor da comiss�o: " +
                           novaVenda.calculaComissao());
        
      //Criada a interface Comissao ou seja o Contrato Comissao 
      //Implemento seus m�todos no Enum Cargo criado
      //E chamo seus m�todos na classe Venda, calculaComissao e mostrarCargo 

	}

}
