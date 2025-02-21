/*
 * *** Malia Kuykendall / COMP 272/400C-001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

 import java.util.*;

 public class TreeProblems {
 
   /**
    * Method different()
    *
    * Given two TreeSets of integers, return a TreeSet containing all elements 
    * that are NOT in both sets. In other words, return a TreeSet of all the
    * elements that are in one set but not the other.
    */
   
   public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
 
     // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
     //
     // This can be done numerous ways, but once such will only that
     // *several* lines of code. Hint: create two temporary TreeSets and utilize the
     // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.
    Set<Integer> tempSet = new TreeSet<>();
    Set<Integer> differenceSet= new TreeSet<>();
    tempSet.addAll(setA);
    differenceSet.addAll(setA);
    differenceSet.addAll(setB);
    tempSet.retainAll(setB);
    differenceSet.removeAll(tempSet);

    return differenceSet;
   }
 
 
   /**
    * Method removeEven()
    *
    * Given a treeMap with the key as an integer, and the value as a String,
    * remove all <key, value> pairs where the key is even. 
    */
 
   public static void removeEven(Map<Integer, String> treeMap) {
      Set<Integer> treeKeys = new TreeSet<>();
      treeKeys = treeMap.keySet();
      int[] keyArray = new int[treeMap.size()];
      int count = 0;
      // INSERT CODE HERE.
      for (Iterator<Integer> i = treeKeys.iterator(); i.hasNext();) {
          int currentKey = i.next();
          if (currentKey % 2 == 0) {
              keyArray[count] = currentKey;
              count++;
          }
      }
      
      for (int i = 0; i < keyArray.length; i++) {
          treeMap.remove(keyArray[i]);
      }
  
   }
 
 
   /**
    * Method treesEqual()
    *
    * Given two treeMaps, each with the key as an integer, and the value as a String,
    * return a boolean value indicating if the two trees are equal or not.
    */
 
   public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
     boolean isEqual = tree1.equals(tree2);
     return isEqual;
 
   }
 
 } // end treeProblems class