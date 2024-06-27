package iphone.testes;

import iphone.celular.IPhone;

public class TestaIPhone {
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		
		// ReprodutorMusical
		System.out.println("Funções do Reprodutor Musical:");
		iphone.tocar();
		iphone.pausar();
		iphone.selecionarMusica("WIU - Coração de Gelo");
		System.out.println();
		
		// AparelhoTelefonico
		System.out.println("Funções do Aparelho Telefonico:");
		iphone.ligar("(11) 4002-8922");
		iphone.atender();
		iphone.iniciarCorreioVoz();
		System.out.println();
		
		// NavegadorInternet
		System.out.println("Funções do Navegador de Internet:");
		iphone.exibirPagina("https://www.dio.me/");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		System.out.println();
	}
}
