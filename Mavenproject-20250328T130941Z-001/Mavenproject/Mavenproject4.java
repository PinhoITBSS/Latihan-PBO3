/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author ITBSS
 */
import java.util.*;

public class Mavenproject4 {
public static void main(String[] args) {
String[] words = {"saya", "ingin", "lulus", "saya", "akan", "berusaha"};
Set<String> uniques = new HashSet<String>();

Set<String> dups = new HashSet<String>();

for (String a : words)
    if (!uniques.add(a))
        dups.add(a);

uniques.removeAll(dups);
System.out.println("Unique words: " + uniques);
System.out.println("Duplicate words: " + dups);
}
}
