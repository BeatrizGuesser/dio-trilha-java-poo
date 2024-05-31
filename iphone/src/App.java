import model.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        // Testando ReprodutorMusical
        iphone.selecionarMusica("Too Sweet - Hozier");
        iphone.tocar();
        iphone.pausar();

        // Testando AparelhoTelefonico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando NavegadorInternet
        iphone.exibirPagina("www.linkedin.com/in/beatriz-gorges-guesser/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
