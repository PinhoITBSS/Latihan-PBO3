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

public class Mavenproject3 {
    public static void main(String[] args) {
        String[] sentences = {"sistem", "informasi", "dan", "teknologi", "informasi"};
        Set<String> s = new HashSet<String>();
        for (String a : sentences)
            if (!s.add(a))
                System.out.println("Duplicate detected: " + a);
                System.out.println(s.size() + " distinct words: " + s) ;
    }
    }
