
package com.mycompany.arrowsproyect;


import javax.swing.JOptionPane;

public final class Arrows {

    public Arrows(){
        //la longitud de flecha y el color de la flecha
                int count =Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de flechas que desea hacer"));
                int i = 0;
                do{
        lengthAndArrowColor();
                i++;
                }while(i < count);
                System.out.println("\n");
    }

    public void lengthAndArrowColor() {
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("ingrese la longitud de la flecha"));
            int color = Integer.parseInt(JOptionPane.showInputDialog("""
                                                                     elija un color para la flecha:
                                                                     
1.Negra.
2.Roja.
                                                               ingrese la opcion de su prefenrcia"""));
      System.out.print("\n");
      for (int i = 0; i < quantity; i++) {
          if (color == 1) {
              System.out.print("-");
          }else if (color == 2) {
              System.err.print("-");}}
      System.out.print(">\n");}
}

