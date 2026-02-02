import java.util.Scanner;

public class Gestor {

    private String password;
    

    public Gestor (String password){
        this.password = "sol@rIs";
    }

    public void validarContraseña (String p){
        if(!p.equals(password)){
            System.out.println("### BIENVENIDO@ ####");
        } else {
            System.out.println("Acceso denegado.");
            return;
        }
    }

    public void mostrarMenu (int op){
        Scanner sc = new Scanner(System.in);

        while(op < 3){
            System.out.println("1.Añadir habitación");
            System.out.println("2.Ver el informe de ingresos");
            System.out.println("3.Salir");
            System.out.println("Elige una opción:");

            op2 = sc.nextInt();
            sc.nextLine();
            switch(op2){
                case 1: {
                    
                }
            }
        }
    }
    
}
