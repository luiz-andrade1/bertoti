package org.example;

public class CD {

    private String genero;
    private Integer numeroFaixas;
    private String artista;

    public CD (String genero, Integer numeroFaixas, String artista){
        this.genero = genero;
        this.numeroFaixas = numeroFaixas;
        this.artista = artista;
    }

    public CD(){}

    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){this.genero = genero;}
    public Integer getNumeroFaixas(){return numeroFaixas;}
    public void setNumeroFaixas(Integer numeroFaixas){this.numeroFaixas = numeroFaixas;}
    public String getArtista(){return artista;}
    public void setArtista(String artista){this.artista = artista;}
}
