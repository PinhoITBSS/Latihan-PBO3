/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.*;
public class Mavenproject9 {
public static void main(String[] args) {
Vector v = new Vector();
//Add elements to Vector
v.add("A");
v.add("B");
v.add("D");
v.add("E");
v.add("F");
System.out.println("Vector contains : " + v);
Enumeration e = v.elements();
ArrayList aList = Collections.list(e);
System.out.println("Arraylist contains : " + aList);
}
}