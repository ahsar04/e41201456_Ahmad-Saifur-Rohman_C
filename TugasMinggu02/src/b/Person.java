/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b;

/**
 *
 * @author Dahlah
 */
public class Person {
    //variable
    String name;
    int age;
    //constructor
    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }
    //geter
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    //seter
    public void setAge(int age){
        this.age= age;
    }
    
}
