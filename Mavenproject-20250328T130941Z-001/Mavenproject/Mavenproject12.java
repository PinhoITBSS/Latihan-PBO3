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

public class Mavenproject12 {
    public static void main(String[] args) {
        // Initialize the PriorityQueue here
        PriorityQueue<String> stringQueue = new PriorityQueue<String>();
        
        // Add elements to the PriorityQueue
        stringQueue.add("ab");
        stringQueue.add("abcd");
        stringQueue.add("abc");
        stringQueue.add("a");
        
        // Don't use iterator which may or may not show the PriorityQueue's order
        while (stringQueue.size() > 0) {
            System.out.println(stringQueue.remove());
        }
    }
}
