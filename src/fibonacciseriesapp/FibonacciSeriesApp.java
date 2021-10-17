/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciseriesapp;

import javax.swing.JOptionPane;
/**
 *
 * @author tresorkl
 */
public class FibonacciSeriesApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int currentNum = 2, nextNum, previousNum =1,count =15;
        
        
        String serie=previousNum+ ", "+currentNum ;
        
        for(int i = 2; i<count;i++){
            
            nextNum = previousNum + currentNum;
            serie = serie + ","+ nextNum;
            
            previousNum = currentNum;
            
            currentNum = nextNum;
            
           
        }
         JOptionPane.showMessageDialog(null," "+ serie,"series of 15 numbers",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
