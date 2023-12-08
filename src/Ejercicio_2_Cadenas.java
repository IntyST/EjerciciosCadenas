/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Ejercicio_2_Cadenas {

    String vocales = "El dia de ayer Margarita Julia Jorge salieron de excurcion";

    public static void main(String[] args) {
        Ejercicio_2_Cadenas nmr_vocales = new Ejercicio_2_Cadenas(); // Crear una instancia para acceder a la variable no estática
        String vocales = nmr_vocales.vocales; // Acceder a la variable no estática a través de la instancia

        int vocal_a = 0;
        int vocal_e = 0;
        int vocal_i = 0;
        int vocal_o = 0;
        int vocal_u = 0;

        for (int i = 0; i < vocales.length(); i++) {
            if (String.valueOf(vocales.charAt(i)).equalsIgnoreCase("a")){
                vocal_a ++;
            }else
                if (String.valueOf(vocales.charAt(i)).equalsIgnoreCase("e")){
                vocal_e ++;
            }else
                    if (String.valueOf(vocales.charAt(i)).equalsIgnoreCase("i")){
                vocal_i ++;
            }else
                        if (String.valueOf(vocales.charAt(i)).equalsIgnoreCase("o")){
                vocal_o ++;
            }else
                            if (String.valueOf(vocales.charAt(i)).equalsIgnoreCase("u")){
                vocal_u ++;
            }
                
                
           
        }

        System.out.println("El número de vocales 'a' es: " + vocal_a);
        System.out.println("El número de vocales 'e' es: " + vocal_e);
        System.out.println("El número de vocales 'i' es: " + vocal_i);
        System.out.println("El número de vocales 'o' es: " + vocal_o);
        System.out.println("El número de vocales 'u' es: " + vocal_u);
    }

}
