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
public class Rectangulo extends FiguraGeometrica
{
 private double base; private double altura;
 public Rectangulo(double b, double h)
 {
 super("Rectangulo");
 base = b;
 altura = h;
 }
 public double area()
 {
 return base * altura;
 }
 
 public double getbase()
 {
  return base;
 }
 public void setbase(int base)
 {
  this.base = base;
 }
 public double get()
 {
  return altura;
 }
 public void setaltura(int altura)
 {
  this.altura = altura;
 }
}
