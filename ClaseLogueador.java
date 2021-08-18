import java.util.Scanner;
public class ClaseLogueador
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo");
        //HELENA VARGAS
        //Helena Vargas
        String nombre = sc.nextLine();
        //sc.close();
        String apellido = nombre.split(" ")[1].trim();
        String primerNombre = nombre.split(" ")[0].trim();
        System.out.println("Ingrese código sis");
        int codSis = sc.nextInt();
        //Hel.Var
        String usuario = (primerNombre.substring(0,3)+"."+apellido.substring(0,3)).toLowerCase();
        //System.out.println("Tu usuario es:" +usuario);
        
        int cantIntentos = 0;
        while(cantIntentos<3){
            System.out.println("Ingrese su usuario:");
            String user = sc.next();
            System.out.println("Ingrese su contraseña");
            int password = sc.nextInt();
            if(user.equals(usuario) && password == codSis){
                System.out.println("BIENVENIDO!");
                cantIntentos=3;
            }else{
                cantIntentos++;
                if(cantIntentos==3){
                    System.out.println("Agoto su cantidad de intentos");
                }
            }
        }

        
    }
}
