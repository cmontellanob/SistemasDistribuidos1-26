/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sis258.figuras;

/**
 *
 * @author Dell
 */
public class Triangulo implements IFigura{
    int base;
    int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
        

    @Override
    public int area() {
        return base*altura/2;
    }

    @Override
    public int perimetro() {
        return base+altura;
    }
    
}
