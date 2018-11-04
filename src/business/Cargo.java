package business;

import interfaces.Comissao;

public enum Cargo implements Comissao {
	ATENDENTE {
        @Override
        public double calculaComissao(double valor) {
             return valor * 0.1;
        }
       
        public void mostrarCargo() {
        	System.out.println("Atendente");
        }
   },
   VENDEDOR {
        @Override
        public double calculaComissao(double valor) {
             return valor * 0.15 + 5;
        }
        
        public void mostrarCargo() {
        	System.out.println("Vendedor");
        }
   },
   GERENTE {
        @Override
        public double calculaComissao(double valor) {
             return valor * 0.20 + 10;
        }
        public void mostrarCargo() {
        	System.out.println("Gerente");
        }
   },
   AJUDANTE {
	   	@Override
        public double calculaComissao(double valor) {
             return valor * 0.08 + 1;
        }
	    public void mostrarCargo() {
        	System.out.println("Ajudante");
        }
   },
   RECEPCIONISTA {
        @Override
        public double calculaComissao(double valor) {
             return valor * 0.05;
        }
        public void mostrarCargo() {
        	System.out.println("Recepcionista");
        }
   },
   DIRETOR {
        @Override
        public double calculaComissao(double valor) {
             return valor * 0.25 + 20;
        }
        public void mostrarCargo() {
        	System.out.println("Vendedor");
        }
   };
}
