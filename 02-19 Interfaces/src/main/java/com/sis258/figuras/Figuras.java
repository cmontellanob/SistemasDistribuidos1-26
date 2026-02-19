/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sis258.figuras;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Figuras {

    public static void main(String[] args) {
       
          ArrayList<IFigura> listaFiguras = new ArrayList<IFigura>();
          
          Cuadrado c1=new Cuadrado(4);
          
          Triangulo t1=new Triangulo(4,2);
          
          listaFiguras.add(c1);
          listaFiguras.add(t1);
          
          for (IFigura figura:listaFiguras)
          {
              System.out.println(figura.area());
          }
          
          
          
          
          
        
        
    }
}
