/*
Me permiten crear varias variables constantes
dias:Lunes,Martes,...,Domingo
imprimir dia semaa()
 */
package com.ceep.principal;

import enumeracion.Continentes;
import enumeracion.Dias;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Programacion {
    static Scanner dia = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\tPROGRAMA DE DIAS DE LA SEMANA");
        System.out.println("\t=============================\n");
        /*
        int num;
        System.out.print("Introduzca el dia de la semana por número: ");
        num=dia.nextInt();
        days(num);
*/
        diaSemana(Dias.MARTES);
        Dias miDia =Dias.JUEVES;
        Dias miSegundoDia=Dias.valueOf("VIERNES");  
        Dias[] todosMisDias=Dias.values();
        for(Dias d:todosMisDias){
            System.out.println("d = "+d.name());
        }
        System.out.println("Continente... "+Continentes.AMERICA);
        System.out.println("Número de paises de America: "+Continentes.AMERICA.getNumPaises());
    }
    public static void days(int num){
        if(num==1){
            System.out.println("Hoy es "+Dias.LUNES);
        }else if(num==2){
            System.out.println("Hoy es "+Dias.MARTES);
        }else if(num==3){
            System.out.println("Hoy es "+Dias.MIERCOLES);
        }else if(num==4){
            System.out.println("Hoy es "+Dias.JUEVES);
        }else if(num==5){
            System.out.println("Hoy es "+Dias.VIERNES);
        }else if(num==6){
            System.out.println("Hoy es "+Dias.SABADO);
        }else if(num==7){
            System.out.println("Hoy es "+Dias.DOMINGO);
        }else{
            System.out.println("Introduzca un valor valido la proxima vez, la semana solo tiene 7 dias");
        }
    }
   
    public static void diaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Primer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Primer dia de la semana");
                break;
            case VIERNES:
                System.out.println("Primer dia de la semana");
                break;
            case SABADO:
                System.out.println("Primer dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Primer dia de la semana");
                break;
            default:
                throw new AssertionError();
        }
    }
    
    
}
