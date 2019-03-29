package coding;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AHMED EeSha
 */

interface Exam{
    static int n=100;
    void register();
    default void collectTopics(){
        //n=100;
        
    }
    default void completeSyllabus(){} 
//{
        //System.out.println("Vxd");
    //}
}
interface Syllabus extends Exam{
    
}
public class FinalInterface implements Exam {
    public void register(){
        System.out.println("Study");
    }
    public static void main(String args[]){
        FinalInterface obj=new FinalInterface();
        //Exam.collectTopics();
        //obj.collectTopics();
        obj.completeSyllabus();
        
    }
}
