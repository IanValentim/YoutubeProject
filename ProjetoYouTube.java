package projetoyoutube;

public class ProjetoYouTube {

    public static void main(String[] args) {

        Video v1 = new Video("Ngc Daddy saindo na mão com o policial - GTA RP");
        Usuario p1 = new Usuario("Ian", "Masculino", 15, "Danko");

        v1.Status();
        p1.Status();

        v1.play();
        v1.pause();
        v1.play();
        v1.like();
        
        Visualização view = new Visualização(p1, v1);

        v1.Status();
        p1.Status();

    }

}
