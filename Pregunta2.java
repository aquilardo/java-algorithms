

import java.util.Scanner;
public class Pregunta2
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
    
    private void eliminar(int pos){
        int [] vr = new int[tam-1];
        for(int i = 0; i<tam-1; i++){
            if(i>=pos){
                vr[i]=vec[i+1];
            }else{
                vr[i]=vec[i];
            }
        }
        vec = new int[tam-1];
        tam = vec.length;
        for(int i = 0; i<tam; i++){
            vec[i]=vr[i];
        }
    }
    
    public static void main(String[] args){
       Scanner lector = new Scanner(System.in);
       Pregunta2 p = new Pregunta2();
       p.llenar();
       p.mostrar();
       System.out.println("indque la posición que desea eliminar");
       int posicion = lector.nextInt();
       p.eliminar(posicion);
       System.out.println();
       p.mostrar();
    }
    
    
}
