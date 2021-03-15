/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author Dahlah
 */
public class person {
    String fName;
    String lName;
    String stuId;
    String stuStatus;
    
    public person(String fName, String lName, String stuId, String stuStatus){
        this.fName=fName;
        this.lName=lName;
        this.stuId=stuId;
        this.stuStatus=stuStatus;
        
    }
   public static void main(String[] args){
       person student=new person("Lisa","Palombo","123456789","Active");
       
       System.out.println("Student Name: "+student.fName+" "+student.lName);
       System.out.println("Student ID: "+student.stuId);
       System.out.println("Student Status: "+student.stuStatus);
   }
}
