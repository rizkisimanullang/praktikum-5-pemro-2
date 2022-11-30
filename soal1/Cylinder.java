/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5.soal1;

/**
 *
 * @author SDN BANUA ANYAR 3
 */
public class Cylinder extends Shape 
    {
private double radius; //radius diukur berdasarkan feet
private double height; //heigth diukurberdasarkan feet
//----------------------------------
//---------------------------------- 
  //Constructor: Sets up the cylinder. 
  //---------------------------------- 
  public Cylinder(double r, double h) 
  {
    super("Cylinder"); 
    radius = r;
    height = h;
  } 
  //----------------------------------------- 
  //Returns the surface area of the cylinder. 
  //----------------------------------------- 
  public double area() 
  {
    return Math.PI*radius*radius*height;
  }
  //----------------------------------- 
  //Returns the cylinder as a String. 
  //----------------------------------- 
  public String toString() 
  {
    return super.toString() + " of radius " + radius + " and height " + height;
  }
}

