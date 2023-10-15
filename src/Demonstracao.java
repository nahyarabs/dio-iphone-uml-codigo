import componentes.Iphone;
import componentes.Android;

public class Demonstracao {

    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();
        Android motorola = new Android();

        System.out.println("---DEMONSTRAÇÃO IPHONE---");

        // Aparelho Telefonico
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Navegador de Internet
        iphone.exibirPagina();
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

        // Reprodutor Musical
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println("---DEMONSTRAÇÃO ANDROID---");

        // Aparelho Telefonico
        motorola.ligar();
        motorola.atender();
        motorola.iniciarCorreioVoz();

        // Navegador de Internet
        motorola.exibirPagina();
        motorola.atualizarPagina();
        motorola.adicionarNovaAba();

        // Reprodutor Musical
        motorola.selecionarMusica();
        motorola.tocar();
        motorola.pausar();

    }

}
