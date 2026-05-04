package org.example;

public class Camisa {

    private String tamanho;
    private String material;
    private String marca;

    public Camisa(String tamanho, String material, String marca){
        this.tamanho = tamanho;
        this.material = material;
        this.marca = marca;
    }

    public Camisa(){}

    public String getTamanho(){
        return tamanho;
    }
    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

}
