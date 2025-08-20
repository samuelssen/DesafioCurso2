package br.com.cursoalura.minhasmusicas.model;

public class Audio {
    private String title;
    private int totalLikes;
    private int totalPlays;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getTotalPlays() {
        return totalPlays;
    }

    public int getClassification() {
        return classification;
    }

    public void likes(){
        this.totalLikes ++;
    }

    public void plays(){
        this.totalPlays++;
    }
}
