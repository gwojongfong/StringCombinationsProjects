package com.java.generics;

import java.util.Enumeration;
import java.util.HashSet;
import java.util.Vector;

public class SimpleGeneric<T> {
    //declaration of object type T
    private T objReff = null;
     
    //constructor to accept type parameter T
    public SimpleGeneric(T param){
        this.objReff = param;
    }
     
    public T getObjReff(){
        return this.objReff;
    }
     
    //this method prints the holding parameter type
    public void printType(){
        System.out.println("Type: "+objReff.getClass().getName());
    }

    public static void main1(String a[]){
         
        //we are going to create SimpleGeneric object with String as type parameter
        SimpleGeneric<Integer> sgs = new SimpleGeneric<Integer>(11111);
        sgs.printType();
        //we are going to create SimpleGeneric object with Boolean as type parameter
        SimpleGeneric<Boolean> sgb = new SimpleGeneric<Boolean>(Boolean.TRUE);
        sgb.printType();
    }
    public static void main(String a[]){
        Vector<String> lang = new Vector<String>();
        Enumeration<String> en = null;
        lang.add("JAVA");
        lang.add("JSP");
        lang.add("SERVLET");
        lang.add("EJB");
        lang.add("PHP");
        lang.add("PERL");
        en = lang.elements();
        while(en.hasMoreElements()){
            System.out.println(en.nextElement());
        }        
        Vector<Integer> langInt = new Vector<Integer>();
        Enumeration<Integer>enInt = null;
        langInt.add(111);
        langInt.add(222);
        langInt.add(333);
        langInt.add(444);
        enInt = langInt.elements();
        while(enInt.hasMoreElements()){
        	System.out.println(enInt.nextElement());
        }
        
        HashSet<String> hs = new HashSet<String>();
        //add elements to HashSet
        hs.add("first");
        hs.add("second"); hs.add("second"); hs.add("second");
        hs.add("third");hs.add("third");hs.add("third");
        System.out.println(hs);
        System.out.println("Is HashSet empty? "+hs.isEmpty());
        hs.remove("third");
        System.out.println(hs);
        System.out.println("Size of the HashSet: "+hs.size());
        System.out.println("Does HashSet contains first element? "+hs.contains("first"));

    }
}
