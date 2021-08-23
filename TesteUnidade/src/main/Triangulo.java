package main;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Triangulo
{
  

   public static void  main(String args[])
   {
	   System.out.println(verificaTipoTriangulo(3, 3, 3));  	  
   }
   
   public enum Resposta 
   {
		EQUILATERO, ISOCELES, ESCALENO, NAOTRIANGULO;
   }
   
   public static Resposta verificaTipoTriangulo(int a, int b, int c){
	  
      if(a == 0 || b == 0 || c == 0)
	return Resposta.NAOTRIANGULO; 
	  
	   
      if ((c < a+b) && (b < c+a) && (a < c+b))
      {
         if ((a == b) && (b == c)){        
<<<<<<< HEAD
            return Resposta.ISOCELES;       
=======
            return Resposta.EQUILATERO;       
>>>>>>> 2.00.00
         }
         else
         {
            if ((a != b) && (b != c) && (c != a)){
<<<<<<< HEAD
               return Resposta.EQUILATERO;
            }else{       
               return Resposta.ESCALENO;
=======
               return Resposta.ESCALENO;
            }else{       
               return Resposta.ISOCELES;
>>>>>>> 2.00.00
            }
         }
      }
      else{
         return Resposta.NAOTRIANGULO;
      }

       
   }
   
}   