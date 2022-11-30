/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikum5.soal1;

/**
 *
 * @author SDN BANUA ANYAR 3
 */
public abstract class Shape {
    String shapeName;
    //konstruk untuk men set shape.
    public Shape(String name){
        shapeName = name;
    }
    public abstract double area();
    //return
    public String toString(){
    return shapeName; }    
    
}
