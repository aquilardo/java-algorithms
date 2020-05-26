
/**
 * Write a description of class CambioBilletesM2 here.
 *
 * @author (Aquilardo Caricari)
 * @version (2020)
 */
import java.util.Scanner;
public class CambioBilletesM2
{
    public static void main(String Arg[]){
        Scanner sc = new Scanner(System.in);
        int monto;
        monto = sc.nextInt();
        int billetesDocientos, billetesCien, billetesCincuenta, billetesVeinte, billetesDiez, monedasCinco, monedasDos, monedasUno;
        
        billetesDocientos = monto/200;
        monto = monto%200;
        
        billetesCien = monto/100;
        monto = monto%200;
        
        billetesCincuenta = monto/50;
        monto = monto%50;
        
        billetesVeinte = monto/20;
        monto = monto%20;
        
        billetesDiez = monto/10;
        monto = monto%10;
        
        monedasCinco = monto/5;
        monto = monto%5;
        
        monedasDos = monto/2;
        monto = monto%2;
        
        monedasUno = monto;
        
        if(billetesDocientos>0){
            System.out.println(billetesDocientos + " billetes de 200");
        }
        if(billetesCien>0){
            System.out.println(billetesCien + " billetes de 100");
        }
        if(billetesCincuenta>0){
            System.out.println(billetesCincuenta + " billetes de 50");
        }
        if(billetesVeinte>0){
            System.out.println(billetesVeinte + " billetes de 20");
        } 
        if(billetesDiez>0){
            System.out.println(billetesDiez + " billetes de 10");
        }
        if(monedasCinco>0){
            System.out.println(monedasCinco + " monedas de 5");
        }
        if(monedasDos>0){
            System.out.println(monedasDos + " monedas de 2");
        }
        if(monedasUno>0){
            System.out.println(monedasUno + " monedas de 1");
        }
        
    }
}
