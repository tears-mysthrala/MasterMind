/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind;

import java.util.Scanner;

/**
 *
 * @author Hodei & SasukeUni
 */
public class Lector {
        
    static String lector() {
        Scanner dato = new Scanner(System.in);
        String leido=dato.nextLine();
        return leido;
    }
    
    static char[] lectorChar(){
        Scanner dato = new Scanner(System.in);
        char[] leido=new char[4]; 
        
            String leidoString=dato.next().toLowerCase();
            
        for (int i = 0; i < 4; i++) {   
            leidoString=leidoString.substring(i, (i+1)); 
            leido[i]=leidoString.charAt(i);
        }
        
        return leido;
    }
    
    static int lectorInt() {
	Scanner dato = new Scanner(System.in);
	int leido=dato.nextInt();
	return leido;
    }
    
    static float lectorFloat() {
	Scanner dato = new Scanner(System.in);
	float leido=dato.nextFloat();
	return leido;
    }
}

