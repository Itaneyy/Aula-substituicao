package app;

import modelo.Musica;
import modelo.Playlist;

public class Main {
    public static void main(String[] args) throws Exception {

        Musica m1 = new Musica("type beat 'ocean'", "prodverci", 133.0);
        Musica m2 = new Musica("Send Me On My Way", "Rusted Root", 215.4);
        Musica m3 = new Musica("Stayin' Alive", "Bee Gees", 250.0);
        Musica m4 = new Musica("Ride", "21 Pilots", 207.6);
        Musica m5 = new Musica("Chain", "Fleetwood Mac ", 259.2);

        Playlist playlist = new Playlist("Musicas Favoritas");

        playlist.adicionarMusica(m1);
        playlist.adicionarMusica(m2);
        playlist.adicionarMusica(m3);
        playlist.adicionarMusica(m4);
        // playlist.adicionarMusica(m5);

        System.out.println("Quantidade de músicas:" + playlist.tamanho());

        // iterando por cada posição.
        // // Lembrando que configuramos para acessarmos a primeia posição em 1.
        for (int i = 1; i <= playlist.tamanho(); i++) {
            System.out.println("==========");
            Musica m = playlist.getMusica(i);
            m.curtir();
            m.exibirInformacoes();
        }

        // versão alternativa
        // Aqui usando o metodo toString
        // for (int i = 1; i <= playlist.tamanho(); i++) {
        // System.out.println("==========");
        // Musica m =playlist.getMusica(i);
        // m.curtir();
        // System.out.println(m);
        // }

        System.out.println("==========");
        System.out.println("A música:" + m5.getTitulo() + " está presente?");
        if (playlist.contains(m5))
            System.out.println("Sim");
        else
            System.out.println("Não");

        System.out.println("==========");
        System.out.println("A música:" + m2.getTitulo() + " está presente?");
        if (playlist.contains(m2))
            System.out.println("Sim");
        else
            System.out.println("Não");

        System.out.println("==========");
        System.out.println("Quantidade de músicas:" + playlist.tamanho());
        playlist.remove(m4);
        System.out.println("Quantidade de músicas:" + playlist.tamanho());
        System.out.println("==========");
        System.out.println("Antes de atualizar ");
        System.out.println(playlist.getMusica(3));
        playlist.set(3, m5);
        System.out.println();
        System.out.println("Depois de atualizar: ");
        System.out.println(playlist.getMusica(3));

        System.out.println("==========");

        Playlist temp = new Playlist("Temporaria");

        System.out.println("A playlist: " + temp.getNome() + " está vazia?");
        String vazia = temp.isEmpty() ? "Sim" : "Não";
        System.out.println(vazia);

        System.out.println("A playlist: " + playlist.getNome() + " está vazia?");
        vazia = playlist.isEmpty() ? "Sim" : "Não";
        System.out.println(vazia);

        System.out.println("==========");
        playlist.clear();
        System.out.println("Quantidade de músicas:" + playlist.tamanho());

        System.out.println("==========");
        System.out.println(playlist.getNome());
        playlist.setNome("");

        System.out.println("==========");
        System.out.println(playlist.getNome());

        System.out.println("==========");
        playlist.setNome("Musicas para ouvir mais tarde");
        System.out.println(playlist.getNome());

    }
}
