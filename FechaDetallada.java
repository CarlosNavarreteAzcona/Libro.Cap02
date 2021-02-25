/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02;

/**
 *
 * @author Carlos Navarrete
 */
public class FechaDetallada extends Fecha
{
 private static String meses[]={"Enero"
    ,"Febrero"
    ,"Marzo"
    ,"Abril"
    ,"Mayo"
    ,"Junio"
    ,"Julio"
    ,"Agosto"
    ,"Septiembre"
    ,"Octubre"
    ,"Noviembre"
    ,"Diciembre"};
 public String toString()
 {
  return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();
 }
 public FechaDetallada(String f)
 {
   super(f);
 }
 public FechaDetallada()
 {
   super();
 }
 public FechaDetallada(int dia, int mes, int anio)
 {
 // invocamos al constructor del padre
 super(dia,mes,anio);
 }
 
}
