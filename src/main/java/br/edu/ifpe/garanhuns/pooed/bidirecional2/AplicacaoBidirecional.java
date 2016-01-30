package br.edu.ifpe.garanhuns.pooed.bidirecional2;

//	class A {
//		final B b;
//	
//		A() {
//		 this.b = new B(this);
//		}
//	}
//	
//	class B {
//		final A a;
//	
//		B(A a) {
//		 this.a = a;
//		}
//	}
//		
//	A a = new A();
public class AplicacaoBidirecional {
	public static void main(String[] args) {
		Corpo stallone = new Corpo("Stallone", "Einstein");
		Corpo schwarzenegger = new Corpo("Schwarzenegger", "Hawking");

		// Ok
		System.out.println(stallone);
		System.out.println(schwarzenegger);

		System.out.println("-----------");
		
		System.out.println(stallone.cerebro());
		System.out.println(schwarzenegger.cerebro());
	}
}
