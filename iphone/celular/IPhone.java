package iphone.celular;

import iphone.funcionalidades.AparelhoTelefonico;
import iphone.funcionalidades.NavegadorInternet;
import iphone.funcionalidades.ReprodutorMusical;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	// REPRODUTOR MUSICAL
	@Override
	public void tocar() {
		System.out.println("TOCANDO MÚSICA...");
	}

	@Override
	public void pausar() {
		System.out.println("MÚSICA PAUSADA.");
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música: " + musica);
	}
	
	
	// APARELHO TELEFONICO
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz.");
	}

	// NAVEGADOR INTERNET
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo Página WEB: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando a página.");
	}
}
