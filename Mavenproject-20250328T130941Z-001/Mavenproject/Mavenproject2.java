/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

/**
 *
 * @author ITBSS
 */
import java.util.*;

public class Mavenproject2 {
public static void main(String[] args) {
    Set set = new HashSet();
    set.add("Sistem");
set.add("Teknologi Informasi");
set.add("Bisnis");
set.add("Digital");
set.add("Kewirausahaan");

System.out.print("Elemen pada HashSet : ");
System.out.println(set);

Set sortSet = new TreeSet(set);
System.out.print("Elemen pada TreeSet : ");
System.out.println(sortSet);
}
}
