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
public class X 
{
 private int a;
 private int b;
 public X(int a, int b)
 {
  this.a = a;
  this.b = b;
 }
 public String toString()
 {
  return "("+a+","+b+")";
 }
 public int geta()
 {
  return a;
 }
 public void seta(int a)
 {
  this.a = a;
 }
 public int getb()
 {
  return b;
 }
 public void setb(int b)
 {
  this.b = b;
 }
}
