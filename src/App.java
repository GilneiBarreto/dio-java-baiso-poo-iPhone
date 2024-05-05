import com.poo.iphone.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone iPhone = new IPhone();

        System.out.println("iPhone");

        System.out.println("==========REPRODUTOR MUSICAL==========");
        iPhone.tocarMusica();
        iPhone.pusarMusica();
        iPhone.selecionarMusica();
        
        System.out.println("==========APARELHO TELEFÔNICO==========");
        iPhone.ligar();
        iPhone.atender();
        iPhone.iniciarCorreioVoz();

        System.out.println("==========NAVEGADOR INTERNET==========");
        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
    }
}
