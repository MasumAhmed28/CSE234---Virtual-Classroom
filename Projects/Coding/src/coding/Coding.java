/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding;

import java.util.Scanner;

/**
 *
 * @author AHMED EeSha
 */
public class Coding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        int pk=-1;
        int i;
        String name=sc.next();
        
        for(i=0;i<name.length();i++){
            if(name.charAt(i)=='0'){
              pk=i;  
              //System.out.println(p);
              break;
        }
        }
        //System.out.println(p);
        if(pk<0)
            System.out.println(name.substring(1));
        else{
            System.out.println(name.substring(0, pk)+name.substring(pk+1));
        }
        sc.close();
    }
    
}
