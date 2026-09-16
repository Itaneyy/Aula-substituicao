package modelo;

import java.util.ArrayList;

public class Playlist {
    private String nome;
    private ArrayList<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            System.out.println("---O nome da playlist não pode estar vazio!---");
            return;
        }
        this.nome = nome;
    }

    public void adicionarMusica(Musica musica) {
        this.musicas.add(musica);
    }

    // Usa o método nativo contains() do ArrayList
    public boolean contains(Musica musica) {
        return this.musicas.contains(musica);
    }

    // O remove(Object) do ArrayList já retorna true se encontrou e removeu, ou false caso contrário
    public void remove(Musica musica) {
        if (this.musicas.remove(musica)) {
            System.out.println("---Musica: '" + musica.getTitulo() + "' removida com sucesso!---");
        } else {
            System.out.println("---Não existe essa música na playlist!---");
        }
    }

    public void set(int index, Musica musica) {
        // Validação mantendo a sua lógica de índice baseado em 1 (1-based)
        if (index >= 1 && index <= tamanho()) {
            musicas.set(index - 1, musica);
        } else {
            System.out.println("---Não é possível utilizar o index '" + index + "'---");
        }
    }

    public Musica getMusica(int index) {
        if (index < 1 || index > this.musicas.size()) {
            System.out.println("---A playlist contém apenas " + this.musicas.size() + " músicas---");
            return null;
        }
        return this.musicas.get(index - 1);
    }

    public boolean isEmpty() {
        return this.musicas.isEmpty();
    }

    public int tamanho() {
        return this.musicas.size();
    }

    public void clear() {
        musicas.clear();
        System.out.println("---Playlist limpa com sucesso!---");
    }
}
