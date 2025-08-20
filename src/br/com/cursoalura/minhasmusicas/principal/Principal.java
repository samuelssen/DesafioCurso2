package br.com.cursoalura.minhasmusicas.principal;

import br.com.cursoalura.minhasmusicas.model.Music;
import br.com.cursoalura.minhasmusicas.model.MyFavorites;
import br.com.cursoalura.minhasmusicas.model.Podcast;

public class Principal {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setTitle("Crisântemo");
        myMusic.setSinger("Emicida");
        myMusic.setGenre("Rap");
        myMusic.setAlbum("O glorioso retorno de quem nunca esteve aqui");

        for (int i = 0; i < 1000; i++) {
            myMusic.plays();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.likes();
        }

        Podcast myPodcast = new Podcast();
        myPodcast.setTitle("Mano a Mano");
        myPodcast.setHost("Mano Brown");

        for (int i = 0; i < 80; i++) {
            myPodcast.plays();
        }

        for (int i = 0; i < 30; i++) {
            myPodcast.likes();
        }

        MyFavorites favorites = new MyFavorites();
        favorites.add(myPodcast);
        favorites.add(myMusic);
    }
}
