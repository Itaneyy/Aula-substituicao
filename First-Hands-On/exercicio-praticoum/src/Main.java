public class Main {
    public static void main(String[] args) throws Exception {

        Musica m1 = new Musica("type beat 'ocean'", "prodverci", 133.0);
        Musica m2 = new Musica("Send Me On My Way", "Rusted Root", 215.4);
        Musica m3 = new Musica("Stayin' Alive", "Bee Gees", 250.0);

        System.out.println("========");
        m1.exibirInformacoes();
        System.out.println("========");
        m2.exibirInformacoes();
        System.out.println("========");
        m3.exibirInformacoes();

        // Exercicio 4, não vai funcionar após ser feito os exercicios posteriores
        // Musica m1 = new Musica();
        // Musica m2 = new Musica();
        // Musica m3 = new Musica();
        // System.out.println("========");

        // m1.artista = "Frank Ocean";
        // m1.curtida = false;
        // m1.duracaoEmSegundos = 5.08;
        // m1.titulo = "Nights";
        // m1.exibirInformacoes();
        // System.out.println("========");

        // m2.artista = "Rusted Root";
        // m2.curtida = false;
        // m2.duracaoEmSegundos = 3.59;
        // m2.titulo = "Send Me On My Way";
        // m2.exibirInformacoes();
        // System.out.println("========");

        // m3.artista = "Bee Gees";
        // m3.curtida = false;
        // m3.duracaoEmSegundos = 4.10;
        // m3.titulo = "Stayin' Alive";
        // m3.exibirInformacoes();

        // System.out.println("========");
        // m2.curtir();
        // m2.exibirInformacoes();
        // System.out.println("========");
        // m2.descurtir();
        // m2.exibirInformacoes();

    }
}
