
public class Pregunta1
{
    private int vec[];
    public int[] vectorResultado(int num){
        int vector[] = {5,6,9,4,8,7,2,3};

        int n=num;
        int aux = 0;
        for(int i=n; i<vector.length; i++){
            for(int j=vector.length-1; j>i; j--){
                if (vector[j-1]>vector[j]){
                    aux = vector[j-1];
                    vector[j-1] = vector[j];
                    vector[j] = aux;
                }
            }
        }

    return vector;
    }
    
    public void mostrar(){
        for(int i = 0; i<vec.length; i++){
            System.out.print(vec[i]+" ");
        }
    }
    
    public static void main(String [] args){
        Pregunta1 p = new Pregunta1();
        p.vec= p.vectorResultado(0);
        p.mostrar();
        System.out.println();
        p.vec= p.vectorResultado(3);
        p.mostrar();
    }
    
}
