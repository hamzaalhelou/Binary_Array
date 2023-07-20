/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binary;

import java.util.Scanner;

/**
 *
 * @author moatasem
 */
public class Array2 {
    
    public static void main(String[] args) {
        
        Scanner binary = new Scanner (System.in);
        
        int [][] m = new int[3][4];
        int i,j ;
        for(i=0 ; i<3 ; i++){
            for(j=0 ; j<4 ; j++){
                System.out.println(" binary [i][j] = ");
                m [i][j] = binary.nextInt();
                
                
            }
        }
    }
    
}
