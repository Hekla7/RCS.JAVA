/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcsjava;

import java.util.Scanner;

/**
 *
 * @author Violeta
 */
public class RCSJAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int a = 3;
//ievade = String.ValueOf(ievade); // no int uz string
//a = Integer.ValueOf(ievade); // no string uz integ
Calculation calc = new Calculation();
        Scanner sc= new Scanner(System.in);
        System.out.println("Ievadiet pirmo skaitli");
        double skaitlis1 = sc.nextDouble();
        System.out.println("Ievadiet otro skaitli");
        double skaitlis2 = sc.nextDouble();
        
        double resultats = calc.Saskaita(skaitlis1,skaitlis2);
         System.out.println("Rezultats ir "+ resultats);
System.out.println("Ievadiet savu vardu!");
String ievade = sc.nextLine();
System.out.println("Sveiks, " + ievade);
int a, b;
System.out.println("Ievadiet pareizo gadu!");
a = sc.nextInt();
System.out.println("Ievadiet kura gada esat dzimis");
b = sc.nextInt();
ievade = String.valueOf(a-b);
System.out.println("" + ievade);

calc.Izvade("vii");
calc.Izvade("Myy");
    }
    
}
   //SOUT    ATGADINAT!!!