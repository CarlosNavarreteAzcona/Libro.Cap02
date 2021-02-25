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
public class Circulo extends FiguraGeometrica
{
 private double radio;
 public Circulo(double b)
 {
 super("Circulo");
 radio = b;
 }
 public double area()
 {
 return Math.PI * Math.pow(radio, 2);
 }
 
 public double getbase()
 {
  return radio;
 }
 public void setbase(int radio)
 {
  this.radio = radio;
 }
 
 
}
