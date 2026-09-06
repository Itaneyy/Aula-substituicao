package modelo;

import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Musica> musicas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            System.out.println("---O nome da playlist não pode estar vazia !---");
            return;
        }
        this.nome = nome;
    }

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void set(int index, Musica musica) {
        if (!(index <= 0 || index > tamanho())) {
            musicas.set((index - 1), musica);
            return;
        } else
            System.out.println("---Não é possível ultilizar o index '" + index + "'---");

    }

    public boolean isEmpty() {
        return this.musicas.isEmpty();
    }

    // verificando por referência
    public boolean contains(Musica musica) {
        for (Musica item : this.musicas) {
            if (item == musica) {
                return true;
            }
        }
        return false;
    }

    // verificando por referência
    public void remove(Musica musica) {
        for (Musica item : this.musicas) {
            if (item == musica) {
                this.musicas.remove(musica);
                System.out.println("---Musica: '" + musica.getTitulo() + "' removida com sucesso!---");
                return;
            }
        }
        System.out.println("---Não existe essa música na playlist!---");
    }

    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public int tamanho() {
        return this.musicas.size();
    }

    public Musica getMusica(int index) {
        if (index > this.musicas.size()) {

            System.out.println("---A playlist contém apenas " + this.musicas.size() + " músicas---");
            return null;
        }

        return this.musicas.get((index - 1));
    }

    public void clear() {
        musicas.clear();
        System.out.println("---PlayList limpa com sucesso!---");
    }

}
