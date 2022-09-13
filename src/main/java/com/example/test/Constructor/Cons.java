package com.example.test.Constructor;

public class Cons {
    int age;
    String name;
    Float phoneNo;

   public Cons(){
       this.age= 5;
       System.out.println(age + " :Programming non-para age");
   }
    public Cons(int y){
        this.age= y;
        System.out.println(age + " :Programming  age");
    }
    public Cons(int y,String u){
        this.age= y;
        this.name = u;
        System.out.println("age"+age +"name:"+name+ " Programming non-para age");
    }


    public static void main (String args []){
        Cons con = new Cons();
        Cons con1 = new Cons(10);
        Cons con2 = new Cons(19,"Abhi");
        //System.out.println("con : "+con +"con1:"+ con1 + "con2:"+con2);
        // Constructors are only called when a object is created

    }




}
