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
public class Fecha0 
{
 private int dia;
 private int mes;
 private int anio;
 
 public int getDia()
 {
  // retorna el valor de la variable dia
  return dia;
 }
 public void setDia(int dia)
 {
  // asigna el valor del parametro a la variable dia
  this.dia = dia;
 }
 public int getMes()
 {
  return mes;
 }
 public void setMes(int mes)
 {
  this.mes = mes;
 }
 public int getAnio()
 {
  return anio;
 }
 public void setAnio(int anio)
 {
   this.anio = anio;
 } 
 public String toString()
 {
    return dia+"/"+mes+"/"+anio; 
 }
 
}
