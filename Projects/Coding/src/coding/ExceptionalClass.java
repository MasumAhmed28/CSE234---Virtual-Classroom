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
public class ExceptionalClass {
    private static void sout(String prntStr){
        System.out.println(prntStr);
    }
    public static void main(String args[]){
        try{
            try{
                throw new NullPointerException();
            }
            catch(Exception e){
                sout(e.toString());
                throw new RuntimeException();
            }
        }
        catch(Exception e){
            sout(e.toString());
            throw new ArithmeticException();
        }
        finally{
            sout("Finish");
        }
    }
}
