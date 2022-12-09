package com.microcare.corejava;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
  public static void main(String[] args) {

      boolean continueLooping = true;
      do {
          String a = JOptionPane.showInputDialog("Numerator: ");
          String b = JOptionPane.showInputDialog("Denominator: ");

          try{
              double resultado = divide(Integer.parseInt(a), Integer.parseInt(b));
              System.out.println("Result: " + resultado);
              continueLooping = false;
          } catch (NumberFormatException e) {
              e.printStackTrace();
              JOptionPane.showMessageDialog(null, "Invalid input, please enter an integer! " + e.getMessage());
          } catch (ArithmeticException e) {
              e.printStackTrace();
              JOptionPane.showMessageDialog(null, "Impossible to divide a number by 0.");
          }
          finally {
              System.out.println("Finally arrived!");
          }
      } while(continueLooping);


      System.out.println("The code ends...");
  }

  public static double divide(int a, int b) {
      return a / b;
  }
}
