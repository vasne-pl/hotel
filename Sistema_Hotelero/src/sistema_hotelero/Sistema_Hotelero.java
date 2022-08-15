package sistema_hotelero;

import java.util.Scanner;

public abstract class Sistema_Hotelero {
    private int piso_1, piso_2, piso_3, piso_4, piso_5;
    Scanner entrada = new Scanner(System.in);

    protected void seleccion() {
        int bandera = 0;
        int seleccion = 0;
        do {
            do {
                System.out.println("¡Bienvenido!");
                System.out.println("    1. piso 1");
                System.out.println("    2. piso 2");
                System.out.println("    3. piso 3");
                System.out.println("    4. piso 4");
                System.out.println("    5. piso 5");
                System.out.println("    6. Salir");
                System.out.println("Por favor ingrese el numero del piso donde desea su habitacion: ");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 6) {
                    bandera = 1;
                } else {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Opcion no disponible,vuelva a intentarlo por favor.");
                    System.out.println("---------------------------------------------------");
                }
            } while (bandera == 0);

            if (seleccion == 1) {
                System.out.println("Tenemos dos habitaciones");
                System.out.println("    - Habitacion 101");
                System.out.println("    - Habitacion 102");
                System.out.println("Por favor ingreser el numero de la habitacion:"); 
            } else if (seleccion == 2) {
                System.out.println("Tenemos dos habitaciones");
                System.out.println("    - Habitacion 201");
                System.out.println("    - Habitacion 202");
                System.out.println("Por favor ingreser el numero de la habitacion:"); 
            } else if (seleccion == 3) {
                System.out.println("Tenemos tres habitaciones");
                System.out.println("    - Habitacion 301");
                System.out.println("    - Habitacion 302");
                System.out.println("    - Habitacion 303");
                System.out.println("Por favor ingreser el numero de la habitacion:"); 
            } else if (seleccion == 4) {
                System.out.println("Tenemos tres habitaciones");
                System.out.println("    - Habitacion 401");
                System.out.println("    - Habitacion 402");
                System.out.println("Por favor ingreser el numero de la habitacion:"); 
            } else if (seleccion == 5) {
                
                System.out.println("Tenemos una habitacione");
                System.out.println("    - Habitacion 501");

            } else if (seleccion == 6){
                
                System.out.println("-----------------------------------------------------------");
                System.out.println("¡Gracias por usar nuestros servico, que tenga un buen dia.!");
                System.out.println("-----------------------------------------------------------");
                bandera = 2;
                
            }
        } while (bandera != 0);
    }
        
    public abstract void Tipo_de_habitacion();
    
    public abstract void Valor_de_noche();
    
    public abstract void equipamento();
    
        protected void servicios(){
        int bandera = 0;
        int opcion_servicio;
        do {
            System.out.println("¡Bienvenido!");
            System.out.println("    1. Servicio de desayuno.");
            System.out.println("    2. Servicio de lavanderia");
            System.out.println("    3. Servicio de internet.");
            System.out.println("    4. Servico de limpieza de habitacion.");
            System.out.println("    5. servicio de transporte.");
            System.out.println("    6. Servicio de piscina.");
            System.out.println("    7. Servicio de gimnasio.");
            System.out.println("    8. Salir");
            System.out.println("Por favor ingrese el numero del servicio que desea adquirir: ");
            opcion_servicio = entrada.nextInt();

                if (opcion_servicio >= 1 && opcion_servicio <= 8) {
                    bandera = 1;
                } else {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Opcion no disponible,vuelva a intentarlo por favor.");
                    System.out.println("---------------------------------------------------");
                }
            } while (bandera == 0);
        
    }

    public void setPiso_1(int piso_1) {
        this.piso_1 = piso_1;
    }

    public void setPiso_2(int piso_2) {
        this.piso_2 = piso_2;
    }

    public void setPiso_3(int piso_3) {
        this.piso_3 = piso_3;
    }

    public void setPiso_4(int piso_4) {
        this.piso_4 = piso_4;
    }

    public void setPiso_5(int piso_5) {
        this.piso_5 = piso_5;
    }

    public int getPiso_1() {
        return piso_1;
    }

    public int getPiso_2() {
        return piso_2;
    }

    public int getPiso_3() {
        return piso_3;
    }

    public int getPiso_4() {
        return piso_4;
    }

    public int getPiso_5() {
        return piso_5;
    }
        
       

}
