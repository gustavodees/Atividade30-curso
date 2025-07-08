package model;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {
        this(0,0);
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getArea(){
        return getLargura()*getAltura();
    }

    public double getPerimetro(){
        return (getAltura()+getLargura())*2;
    }
    public double getDiagonal(){
        return Math.sqrt(Math.pow(getLargura(),2)+Math.pow(getAltura(),2));
    }


}
