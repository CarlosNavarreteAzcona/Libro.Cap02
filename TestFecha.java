/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02;
import java.util.Scanner;
/**
 *
 * @author Carlos Navarrete
 */
public class TestFecha  
{
 public static void main(String[] args)
 {
 Fecha0 f = new Fecha0();
 f.setDia(2);
 f.setMes(10);
 f.setAnio(1970);
 // imprimo el dia
 System.out.println("Dia="+f.getDia());
 // imprimo el mes
 System.out.println("Mes="+f.getMes());
 // imprimo el anio
 System.out.println("Anio="+f.getAnio());
 // imprimo la fecha
 System.out.println(f.toString());
     
  Scanner scanner=new Scanner(System.in);
  // el usuario ingresa los los datos de la fecha
  System.out.println("Ingrese Fecha1 (dia, mes y anio): "); int dia = scanner.nextInt(); int mes = scanner.nextInt(); int anio = scanner.nextInt();
  // creo un objeto de la clase Fecha
  Fecha f1=new Fecha(dia,mes,anio);
  // el usuario ingresa los los datos de la fecha
  System.out.println("Ingrese Fecha2 (dia, mes y anio): ");
  dia = scanner.nextInt();
  mes = scanner.nextInt();
  anio = scanner.nextInt();
  // creo un objeto de la clase Fecha
  Fecha f2= new Fecha(dia,mes,anio);
  Fecha f3 = new Fecha();
  f3.setDia(18);
  f3.setMes(03);
  f3.setAnio(2001);
  System.out.println("Fecha 1 = "+f1.toString());
  System.out.println("Fecha 2 = "+f2.toString());
  System.out.println("Fecha 3 = "+f3.toString());
  if( f1.equals(f2) )
  {
   System.out.println("Son iguales !");
  }
  else
  {
   System.out.println("Son distintas...");
  }
 }
}
