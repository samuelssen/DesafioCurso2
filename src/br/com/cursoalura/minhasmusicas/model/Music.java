package br.com.cursoalura.minhasmusicas.model;

public class Music extends Audio {
    private String album;
    private String singer;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getClassification() {
        if (this.getTotalLikes() > 400){
                return 10;
        }else {
            return 6;
        }
    }
}
