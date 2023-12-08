/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_1_Cadenas {
    String nombres = "Juan Maria Pedro Luis";
    
    
    
    
    public static void main(String[] args) {
        Ejercicio_1_Cadenas espacioBlanco = new Ejercicio_1_Cadenas(); // Crear una instancia para acceder a la variable no estática
        String nombres = espacioBlanco.nombres; // Acceder a la variable no estática a través de la instancia

        int cont = 0;
        for (int i = 0; i < nombres.length(); i++) { 
            if (String.valueOf(nombres.charAt(i)).equals(" ")) {
                cont++;
            }
        }
        System.out.println("El número de espacios en blanco es: " + cont);
    }
}
