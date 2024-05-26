public class iPhoneMain {
    public static void main(String[] args) throws Exception {
        iPhone aparelho = new iPhone();

        // Reprodutor Musical:
        System.out.println("\nFuncionalidades do Reprodutor Musical:");
        aparelho.tocar();
        aparelho.pausar();
        aparelho.selecionarMusica();

        // Aparelho Telefônico:
        System.out.println("\nFuncionalidades do Reprodutor Musical:");
        aparelho.atender();
        aparelho.ligar();
        aparelho.iniciarCorreioVoz();

        // Navegador Internet:
        System.out.println("\nFuncionalidades do Navegador de Internet:");
        aparelho.exibirPagina();
        aparelho.adicionarNovaAba();
        aparelho.atualizarPagina();
    }
}
