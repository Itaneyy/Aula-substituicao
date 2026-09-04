public class Musica {
    // private
    String titulo;
    // private
    String artista;
    // private
    Double duracaoEmSegundos;
    // private
    boolean curtida;

    public Musica(String titulo, String artista, Double duracaoEmSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoEmSegundos = duracaoEmSegundos;
        this.curtida = false;
    }

    public void exibirInformacoes() {
        String foiCurtida = this.curtida ? "foi curtida" : "não foi curtida";

        System.out.println("Título da música: " + this.titulo
                + "\nNome do artista: "
                + this.artista
                + "\nDuração em minutos: "
                + duracaoEmMinutos()
                + "s\nEssa música " + foiCurtida);
    }

    public void curtir() {
        this.curtida = true;
    }

    public void descurtir() {
        this.curtida = false;
    }

    public String duracaoEmMinutos() {
    return String.format("%.2f", this.duracaoEmSegundos / 60.0);
}

}
