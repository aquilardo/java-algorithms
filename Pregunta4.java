import java.util.Scanner;
public class Pregunta4
{
    int [][] m;
    int fil;
    int col;
    
    private void cargar(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas");
        fil = lector.nextInt();
        System.out.println("Ingrese cantidad de columnas");
        col = lector.nextInt();
        m = new int[fil][col];
        for(int i = 0; i<fil; i++){
            if(i%2==0){
                for(int j = col-1; j>=0; j--){
                    System.out.println("Ingrese elemento");
                    m[i][j]=lector.nextInt();
                }
            }else{
                for(int j = 0; j<col; j++){
                    System.out.println("Ingrese elemento");
                    m[i][j]=lector.nextInt();
                }
            }
        }
        
    }
    
     private void cargar2(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas");
        fil = lector.nextInt();
        System.out.println("Ingrese cantidad de columnas");
        col = lector.nextInt();
        m = new int[fil][col];
        int control = 0;
        for(int i = fil-1; i>=0; i--){
            if(control%2==0){
                for(int j = col-1; j>=0; j--){
                    System.out.println("Ingrese elemento");
                    m[i][j]=lector.nextInt();
                }
            }else{
                for(int j = 0; j<col; j++){
                    System.out.println("Ingrese elemento");
                    m[i][j]=lector.nextInt();
                }
            }
            control++;
        }
        
    }
    private void mostrar(){
        for(int i= 0; i<fil; i++){
            for(int j = 0; j<col; j++){
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String [] args){
        Pregunta4 p = new Pregunta4();
        p.cargar2();
        p.mostrar();
        
    }
}
