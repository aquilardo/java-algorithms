public class ClasePruebas
{
    private EjerciciosVectores ej = new EjerciciosVectores();
    private RandomNumeros rm = new RandomNumeros();
    private RecorridoMatrices rmatrices = new RecorridoMatrices();
    
    public static void main(String[] args){
        ClasePruebas cp = new ClasePruebas();
        cp.ej.llenar();
        cp.ej.mostrar(cp.ej.vec);
        //matrices
        int[][] mprueba;
        mprueba = cp.rmatrices.llenarMatriz(3,3);
        cp.rmatrices.recorridoSecuencialHorizontal(mprueba);
        cp.rmatrices.recorridoEspiral(mprueba);
    }
}
