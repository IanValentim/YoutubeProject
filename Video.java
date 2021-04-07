package projetoyoutube;

public class Video implements AçoesVideo {

    private String titulo;
    private int views, curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public void Status() {

        System.out.println("\n-----------------");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Views: " + this.getViews());
        System.out.println("Curtidas: " + this.getCurtidas());
        System.out.println("Reproduzindo: " + this.isReproduzindo());
        System.out.println("-----------------\n");

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void play() {
        this.setReproduzindo(true);
        System.out.println("Reproduzindo...");
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
        System.out.println("Pause.");
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

}
