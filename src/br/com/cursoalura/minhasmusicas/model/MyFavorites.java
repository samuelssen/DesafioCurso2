package br.com.cursoalura.minhasmusicas.model;

public class MyFavorites {

    public void add(Audio audio){
        if (audio.getClassification() > 8){
            System.out.println(audio.getTitle() + " é considerado um dos melhores! ");
        }else {
            System.out.println(audio.getTitle() + " é considerado uma boa opção! ");
        }
    }
}
