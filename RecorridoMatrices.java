import java.util.Scanner;
public class RecorridoMatrices
{

    private void recorridoSecuencialHorizontal(int[][] a){
        for(int i = 0; i<a.length;i++){
            for(int j=0; j<a[0].length;j++){
                System.out.print(a[i][j]+ "\t");
            }
            System.out.println();
        }
    }

    private void recorridoZigZag(int[][] a){
        for(int i = 0; i<a.length;i++){
            if(i%2==0){
                for(int j=0; j<a[0].length;j++){
                    System.out.print(a[i][j]+ " ");
                }
            }else{
                for(int j=a[0].length-1; j>=0; j--){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    private void recorridoEspiral(int[][] a){
        for(int i = 0; i<a.length; i++){
            for(int j = i; j<a[0].length-i; j++){
                System.out.println(a[i][j]);
            }

            for(int j = i+1; j<a.length-i; j++ ){
                System.out.println(a[j][a[0].length-1-i]);
            }

            for(int j = a[0].length-2-i; j>=i ; j--){
                System.out.println(a[a.length-1-i][j]);
            }
            for(int j = a.length-2-i; j>i ; j--){
                System.out.println(a[j][i]);
            }
        }
    }
    private int[][] llenarCaracol(int a, int b){
        Scanner sc = new Scanner(System.in);
        int res [][] = new int[a][b];
        for(int i = 0; i<res.length; i++){
            for(int j = i; j<res[0].length-i; j++){
                System.out.println("Ingrese elemento");
                res[i][j] = sc.nextInt();
            }

            for(int j = i+1; j<res.length-i; j++ ){
                System.out.println("Ingrese elemento");
                res[j][res[0].length-1-i]=sc.nextInt();
            }

            for(int j = res[0].length-2-i; j>=i ; j--){
                System.out.println("Ingrese elemento");
                res[res.length-1-i][j]=sc.nextInt();
            }
            for(int j = res.length-2-i; j>i ; j--){
                System.out.println("Ingrese elemento");
                res[j][i] = sc.nextInt();
            }
        }
        return res;
    }
    
    private void recorridoDiagonalPrincipal(int [][]a){
        for(int i= 0; i<a.length; i++){
            for(int j=0; j<=i; j++){
                System.out.println(a[i-j][j]);
            }
        }
        
        int aux=1;
        for(int i=a.length; i>0; i--){
            for(int j=aux;j<i;j++){
                System.out.println(a[a.length-j][j]);
            }
            aux++;
        }
    }

    private int[][] llenarMatriz(int fil, int col){
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[fil][col];
        for(int i=0; i<fil;i++){
            for(int j=0; j<col;j++){
                System.out.println("Ingrese elemento");
                m[i][j] = sc.nextInt();
            }
        }

        return m;        
    }

    private int[] sumaBinario(int a[], int b[]){
        int[] suma = new int[a.length+1];
        int acarreo = 0;
        for(int i = a.length-1; i>=0; i--){
            if(a[i]==1&&b[i]==1){
                if(acarreo==0){
                    suma[i+1]=0;
                    acarreo=1;
                }else{
                    suma[i+1]=1;
                    acarreo = 1;
                }
            }else if(a[i]!=b[i]){
                if(acarreo == 0){
                    suma[i+1]=1;
                    acarreo=0;
                }else{
                    suma[i+1]=0;
                    acarreo=1;
                }
            }else{
                if(acarreo == 0){
                    suma[i+1]=0;
                    acarreo=0;

                }else{
                    suma[i+1]=1;
                    acarreo = 0;
                }
            }
            if(i==0){
                if(acarreo == 1){
                    suma[0]=1;
                }else{
                    suma[0] =0;
                }
            }
        }

        return suma;
    }

    private void recorrerVector(int[] vec){
        for(int i=0; i<vec.length; i++){
            System.out.print(vec[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        RecorridoMatrices rm = new RecorridoMatrices();
        int fil, col;
        System.out.println("Ingrese la cantidad de filas");
        fil=lector.nextInt();
        System.out.println("Ingrese columnas");
        col = lector.nextInt();
        int[][] ma = new int[fil][col];
        ma = rm.llenarCaracol(fil, col);
        int a[] = {0,1,0,1,1,1};
        //int b[] = {1,1,1,0,1,0};
        //int suma[] = rm.sumaBinario(a, b);
        //rm.recorridoEspiral(ma);
        rm.recorridoSecuencialHorizontal(ma);
    }

}
