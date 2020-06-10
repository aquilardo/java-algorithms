/**
* Solución patrocinada por RUN.SISTEMAS
* Problema M-Aternante
**/
import java.util.Scanner;
public class MaltAlternanteN
{
    public static void main(String Arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        long n = sc.nextLong();
        long copia = n;
        long cantDig = 0;
        long ninvertido = 0;
        long digito;
        long grado = 0;
        boolean cumple = false;
        boolean par = false;
        boolean impar = false;
        while(copia>0){
            ninvertido = ninvertido*10+copia%10;
            copia=copia/10;
            cantDig++;
        }
        
        long sumador = 2;
        long controlador = 1;
        long gradoTotal = 1;
        long cantDC = 1;
        while(cantDC <cantDig){
            cantDC = cantDC+sumador;
            sumador++;
            gradoTotal++;
        }
        if(cantDC == cantDig){
            cumple = true;
        }

        long dg = ninvertido%10;
                if(dg%2==0){
                    par = true;
                }else{
                    impar = true;
                }
        
                
        if(cumple==true){
            for(long i = 1; i<=gradoTotal; i++){
                long digpar=0, digimpar=0;
                long ncontrol = 0;
                
                if(par==true){
                    par = false;
                    for(long j = 1; j<=i; j++){
                        ncontrol = j;
                        digito = ninvertido%10;
                        ninvertido = ninvertido/10;
                        if(digito%2==0){
                            digpar++;
                        }

                    }
                    if(digpar==ncontrol){
                        impar = true;
                        grado++;
                    }
                } else if(impar == true){
                    impar = false;
                    for(long j = 1; j<=i; j++){
                        ncontrol = j;
                        digito = ninvertido%10;
                        ninvertido = ninvertido/10;
                        if(digito%2!=0){
                            digimpar++;
                        }
                    }

                    if(digimpar==ncontrol){
                        par = true;
                        grado++;
                    }
                }

            }
        }
        
        if(gradoTotal == grado){
            System.out.println(n + " es un número M-Alternante de grado: " +gradoTotal);
        }else{
            System.out.println(n + " no es M-Alternante");
        }
    }
}
