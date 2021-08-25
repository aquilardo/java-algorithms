import java.util.Scanner;
public class EjerciciosVectores
{
    //atributos, variables globales
    // modificadores de acceso public, private, protected
    private int tamanio;
    private int[] vec;
    Scanner sc = new Scanner(System.in);
    /*public EjerciciosVectores(int tam){
        int tamanio = tam;
        vec = new int[tamanio];
    }*/
    //si no devuelve nada el método debería ser void
    public int numeroMayor(int[] v){
        int mayor=v[0];

        for(int i = 1; i<v.length; i++){
            if(v[i]>mayor){
                mayor = v[i];
            }
        }
        return mayor;
    }

    public int cantidadMultiplos(int [] v, int d){
        int cm = 0;
        for(int i = 0; i<v.length; i++){
            if(v[i]%d==0){
                cm++;
            }
        }
        return cm;
    }

    public int cantidadPrimos(int [] v){
        int contador = 0;
        for(int i = 0; i<v.length; i++){
               if(primo(v[i])==true){
                   contador++;
                }
        }
        return contador;
    }
    
    public int[] insertarElemento(int[] v, int p, int n){
        int [] res = new int[v.length+1];
        int aux = 0;
        for(int i = 0; i<res.length; i++){
            if(p==i){
                res[i] = n;
            }else if(i>p){
                res[i] = v[i-1];   
            }else{
                res[i] = v[i];
            }
        }
        
        return res;
    }
    
    public int[] eliminarElemento(int[] v, int p){
        int [] res = new int[v.length];
        
        for(int i = 0; i<v.length-1; i++){
            if(i>=p){
                res[i]=v[i+1];
            }else{
                res[i]=v[i];
            }
            
        }
        
        return res;
    }
    
    public void mostrarSuma(int [] a, int [] b){
        for(int i = 0; i<a.length; i++){
            System.out.print((a[i]+b[i])+" ");
        }        
    }

    public boolean primo(int n){
        int cd = 0;
        int div=1;
        boolean res = false;
        while(div<=n){
            if(n%div==0){
                cd++;
            }
            div++;
        }
        if(n==1){
            res = true;
        }else if(cd==2){
            res = true;
        }
        return res;
    }
    
    public void mostrar(int[] v){
        for(int i = 0; i<v.length; i++){
            System.out.print(v[i] +" ");
        }
        
    }
    
    public void llenar(){
        System.out.println("Ingrese tamaño vector");
        tamanio = sc.nextInt();
        vec = new int[tamanio];
        for(int i = 0; i<vec.length; i++){
            System.out.println("Ingrese elemento");
            vec[i] = sc.nextInt();
        }
        
    }
    
    
    public static void main(String[] args){
        EjerciciosVectores ej = new EjerciciosVectores();
        ej.llenar();
       // System.out.println(ej.tamanio);
        //ej.mostrar(ej.vec);
        EjerciciosVectores ej2 = new EjerciciosVectores();
        ej2.llenar();
        //System.out.println(ej2.tamanio);
        //System.out.println(ej.tamanio);
        //ej2.mostrar(ej2.vec);
        System.out.println();
        //ej.vec = ej.eliminarElementos(ej.vec);
        ej.mostrarSuma(ej.vec, ej2.vec);
        
        
    }
    
    /*public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ///int double = Math.random();
        EjerciciosVectores ej = new EjerciciosVectores();
        int [] num = {1,3,4,9,2,5};
        System.out.println("Igrese posición");
        int pos = sc.nextInt();
        //System.out.println("Ingrese el número");
        //int n = sc.nextInt();
        //int [] insertado = new int[num.length+1];
        int [] eliminado = new int[num.length];
        eliminado = ej.eliminarElemento(num, pos);
        ej.mostrar(eliminado);
    }*/
}
