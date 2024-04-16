/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teatro;

import java.util.Scanner;

/**
 *  
 * @author Mauricio
 */
public class Teatro {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int opcion=0, tipoEntrada=0, ubicacion=0; 
        int precioPlatea=20000, precioPalco=30000, precioGeneral=15000;
        int cantEntradas=0, totalEntradas=0;
       
        Scanner scan = new Scanner(System.in);
        
        do
        {   
            System.out.println("Bienvenidos al Teatro Moro");
            System.out.println("--------MENU----------");
            System.out.println("1.- Comprar Entradas");
            System.out.println("2.- Imprimir Boletas");
            System.out.println("3.- Salir");
            do
            {
                System.out.println("Ingrese opcion... ");
                opcion = scan.nextInt();
                if(opcion <1 || opcion >3)
                {
                    System.out.println("Opción incorrecta");
                }
            }while(opcion <1 || opcion >3);
            
            switch(opcion){
                case 1:
                    do{
                        System.out.println("seleccione ubicación");
                        System.out.println("1 .- Platea");
                        System.out.println("2 .- Palco");
                        System.out.println("3 .- General");
                        ubicacion = scan.nextInt();
                        if(ubicacion<1 || ubicacion>3)
                        {
                            System.out.println("Ubicación incorrecta!!");
                        }
                    }while(ubicacion<1 || ubicacion>3);
                    System.out.println("Ingrese cantidad de entradas");
                    cantEntradas = scan.nextInt();
                    switch(ubicacion)
                    {
                        case 1:
                            totalEntradas = cantEntradas*precioPlatea;
                            break;
                        case 2:
                            totalEntradas = cantEntradas*precioPalco;
                            break;
                        default:
                            totalEntradas = cantEntradas*precioGeneral;
                            break;
                        
                    }
                    System.out.println("Venta realizada. Solicite su boleta!!");
                    break;
                case 2:
                    System.out.println("------BOLETA DE VENTA-------");
                    System.out.println("Cantidad de entradas: " + cantEntradas);
                    System.out.println("Total boleta: " + totalEntradas);
                    System.out.println("GRACIAS POR SU COMPRA");
                    break;
                default:
                    System.out.println("usted va a salir de la aplicación");
            }
            
            
            
            
        }while(opcion!=3);
        
    }
    
}
