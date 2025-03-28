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

public class Mavenproject5 {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add("Australia");
        s1.add("Sweden");
        s1.add("Germany");
        
        Set s2 = new HashSet();
        s2.add("Sweden");
        s2.add("France");
        
        Set union = new TreeSet(s1);
        union.addAll(s2); // 
        print("Union",union);
        
        Set intersect = new TreeSet(s1);
        intersect.retainAll(s2);//
        print("Intersection",intersect);
    }
    
    protected static void print (String label, Collection c){
        System.out.println("----"+label+"----");
        
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
