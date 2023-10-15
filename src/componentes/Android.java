package componentes;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Android implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar() {
        System.out.println("Realizando chamada no meu Android...");
    }

    @Override
    public void atender() {
     System.out.println("Em chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
       System.out.println("Nova mensagem de voz recebida");
    }

    @Override
    public void tocar() {
    System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo nova pagina google chrome");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Iniciando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina web google chrome atualizada");
    }

}
