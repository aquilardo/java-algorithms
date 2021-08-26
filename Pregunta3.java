

import java.util.Scanner;
public class Pregunta3
{
    int [] vec;
    int tam;
    
    private void llenar(){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese tamaño");
        tam = lector.nextInt();
        vec = new int[tam];
        for(int i = 0; i<tam; i++){
            //System.out.println("Ingrese elemento");
            vec[i] = (int)(Math.random()*100+1);
        }
    }
    private void mostrar(){
        for(int i =  0; i<tam; i++){
            System.out.print(vec[i]+" ");
        }
    }
    
    private void buscar(int ele){
        int contador = 0;
        for(int i = 0; i<tam; i++){
            if(vec[i]==ele){
                System.out.println("Posición "+i);
                contador++;
            }
        }
        if(contador==0){
            System.out.println("No se encontró elemento");
        }
        
    }
    
    public static void main(String[] args){
       Scanner lector = new Scanner(System.in);
       Pregunta3 p = new Pregunta3();
       p.llenar();
       p.mostrar();
       System.out.println();
       System.out.println("indique el elemento a buscar");
       int elemento = lector.nextInt();
       System.out.println();
       p.buscar(elemento);
    }
    
    
}
