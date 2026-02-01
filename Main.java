import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int op = 0;
        int op2 = 0;
        int op3 = 0;
        String password = "bringBack2016"; //TEMPORALmala práctica


        //Menús
        while(op < 3){
            System.out.println("#####BIENVENID@#####");
            System.out.println("\t1.Gestor");
            System.out.println("\t2.Cliente");
            System.out.println("\t3.Salir");
            System.out.println("Elige una opción:");

            op = sc.nextInt();
            sc.nextLine(); //Limpieza de buffer
            switch (op) {
                case 1:{
                    System.out.println("Introduce la contrasenha: ");
                    String pass = sc.nextLine();
                    if(pass.equals(password)){//TEMPORAL Esto debería de ser un método
                        while(op2 < 3){ 
                            System.out.println("###BIENVENID@###");
                            System.out.println("1.Añadir habitación");
                            System.out.println("2.Ver el informe de ingresos");
                            System.out.println("3.Salir");
                            System.out.println("Elige una opción:");

                            op2 = sc.nextInt();
                            sc.nextLine();
                            switch(op2){
                                //PIENSA EN HACERLO DE UNA MANERA QUE ACORTE EL MAIN
                            }
                        } 
                        
                    }
                    

                }
            }
        }
        
    }
}