package jackson.rocha;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada...");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo a página: " + url);
    }

    @Override
    public void navegar() {
        System.out.println("Navegando na web...");
    }

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando as funcionalidades
        meuIphone.tocar();
        meuIphone.selecionarMusica();
        meuIphone.pausar();

        meuIphone.fazerChamada("123-456-7890");
        meuIphone.receberChamada();

        meuIphone.abrirPagina("https://www.apple.com");
        meuIphone.navegar();
    }
}
