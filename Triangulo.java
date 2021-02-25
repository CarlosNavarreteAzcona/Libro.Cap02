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
public class Triangulo extends FiguraGeometrica
{
 private double base; private double altura;
 public Triangulo(double b, double h)
 {
 super("Triangulo");
 base = b;
 altura = h;
 }
 public double area()
 {
 return (base * altura)/2;
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
