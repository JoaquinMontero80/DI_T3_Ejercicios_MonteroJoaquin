/*
    Joaquin Montero. 2DAM.   DI -->  T3A5 Instrospeccion-Reflexion
        Programa que pide por teclado el nombre de una clase 
        y devuelve todas las caracteristicas de la clase introducida.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author joaquin
 */
public class CaracteristicasClase 
{
    
    public static void main(String[] args) throws ClassNotFoundException
    {
        // Teclado
        Scanner teclado = new Scanner(System.in);
        // Atributos
        String clase;
        
        // Titulo
        System.out.println("===========================================================");
        System.out.println("Program that defines characteristics of an introduced class");
        System.out.println("===========================================================\n\n");
        
        // Pido tipo de clase a definir
        System.out.print("Enter class to define : ");  
        clase = teclado.nextLine();
        
        // Instancio objeto Class
        Class clase1 = clase.getClass();
           
        // Genera una excepcion si no existe la clase
        try
        {
            // Imprime nombre y padre de la clase 
            clase1 = Class.forName(clase);
            System.out.println("\n\n|============|");
            System.out.println("| Class name |");
            System.out.println("|============|");
            System.out.println("\t" +  clase1.getName());
            System.out.println("\n\n|================|");
            System.out.println("|= Parent class =|");
            System.out.println("|================|");
            System.out.println("\t" + clase1.getClass().getSuperclass());
            // Instancia constructores de la clase
            Constructor<?> [] constructores = clase1.getDeclaredConstructors();
            // Imprime los constructores de la clase
            System.out.println("\n\n|==================|");
            System.out.println("|= Class builders =|");
            System.out.println("|==================|");
            for(Constructor c : constructores)
            {
                System.out.println("\t" + c); 
            }

            // Imprime campos de la clase
            System.out.println("\n\n|================|");
            System.out.println("|= Class Fields =|");
            System.out.println("|================|");
            Field [] fil = clase1.getDeclaredFields();
            for(Field f : fil)
            {
                System.out.println("\t" + f);
            }

            // Imprime los metodos que tiene la clase
            System.out.println("\n\n|=================|");
            System.out.println("|= Class methods =|");
            System.out.println("|=================|");
            Method [] me = clase1.getDeclaredMethods();
            for(Method m : me)
            {
                System.out.println("\t" + m);
            }
           
            System.out.println("\n\n");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("\n|==================================================================================|");
            System.out.println("| It has been recognized as String, but the class entered does not belong to Java. |");
            System.out.println("|==================================================================================|");
            System.out.println("BYE.");
        }   
       
    } // Fin de metodo main

    
} // Fin de clase
