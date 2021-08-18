/**
* Solución desarrollada por Miguel, mejorada por participantes del Bootcamp de Introducción a la Programación
*/
import java.util.Scanner;
public class ejercicio4
{
    public static void main(String args[]){
        Scanner lector=new Scanner(System.in);
        int suma,par,impar;
        suma=0;
        impar=0;
        par=0;
        int dig,dig2;
        String respuesta,si;

        do{
            System.out.println("INGRESA NUMERO");
            int numero=lector.nextInt();
            int copia=numero;
            while(numero!=0){
                //345
                //34
                //3
                dig=numero%10;
                if(dig%2==0){
                    par++;
                }else{
                    impar++;
                }
                suma = suma+dig;
                numero=numero/10;
            }
            /*while(copia!=0){
            dig2=copia%10;
            if(dig2%2==0){
            par++;
            }else{
            impar++;
            }
            copia=copia/10;
            }*/
            System.out.println("El número que ingresaste es:" +copia);
            System.out.println("suma:"+suma);
            System.out.println("par:"+par);
            System.out.println("impar:"+impar);
            System.out.println("para continuar ingrese si");
            respuesta=lector.next();
            par=0;
            impar=0;
            suma=0;
        }while(respuesta.equals("si"));
    }
}
