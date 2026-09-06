package modelo;

public class Musica {
    private String titulo;
    private String artista;
    private double duracaoEmSegundos;
    private boolean curtida;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo.trim().isEmpty()) {
            System.out.println("---O título não pode estar vazio !---");
            return;
        }
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        if (artista.trim().isEmpty()) {
            System.out.println("---O artista não pode estar vazio !---");
            return;
        }
        this.artista = artista;
    }

    public double getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(double duracaoEmSegundos) {
        if (duracaoEmSegundos <= 0) {
            System.out.println("---Não é possível salvar esse tipo de duração! ---");
            return;
        }
        this.duracaoEmSegundos = duracaoEmSegundos;

    }

    public boolean isCurtida() {
        return curtida;
    }

    public Musica(String titulo, String artista, double duracaoEmSegundos) {
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

    // versao alternativa
    // public void exibirInformacoes() {

    // System.out.println(toString());
    // }

    public void curtir() {
        this.curtida = true;
    }

    public void descurtir() {
        this.curtida = false;
    }

    public String duracaoEmMinutos() {
        return String.format("%.2f", this.duracaoEmSegundos / 60.0);
    }

    // Reescrita do metodo toString() para já mostrar informações quando uma música
    // for impressa usando print;
    @Override
    public String toString() {
        String foiCurtida = this.curtida ? "foi curtida" : "não foi curtida";
        return "Título da música: " + this.titulo
                + "\nNome do artista: "
                + this.artista
                + "\nDuração em minutos: "
                + duracaoEmMinutos()
                + "s\nEssa música " + foiCurtida;

    }

}
