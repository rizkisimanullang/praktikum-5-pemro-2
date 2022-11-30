/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5.soal1;

/**
 *
 * @author SDN BANUA ANYAR 3
 */
public class Sphere extends Shape
{
private double radius; //radius in feet
//----------------------------------
// Constructor: Sets up the sphere.
//----------------------------------
public Sphere(double r)
{
super("Sphere");
radius = r;
}
//-----------------------------------------
// Returns the surface area of the sphere.
//-----------------------------------------
@Override
public double area()
{
return 4*Math.PI*(radius*radius);
}
//-----------------------------------
// Returns the sphere as a String.
//-----------------------------------
public String toString()
{
return super.toString() + " of radius " + radius;
}
}
