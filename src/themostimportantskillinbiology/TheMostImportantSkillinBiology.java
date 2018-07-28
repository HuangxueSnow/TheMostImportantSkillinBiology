/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themostimportantskillinbiology;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class TheMostImportantSkillinBiology {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
	int n = reader.nextInt();
        int x[] = new int [n+1];
        int y[] = new int [n+1];
        int x1 = reader.nextInt();
        x[0] = x1;
        int y1 = reader.nextInt();
        y[0] = y1;
        for(int i = (n-1); i >0; i--){
            int x2 = reader.nextInt();
            x[i] = x2;
            int y2 = reader.nextInt();
            y[i] = y2;
        }
        double area = 0;
        for(int i =0; i<n; i++){
            if((i+1) >= n){
                area = area + x[i]*y[0];
            }else{
                area = area + x[i]*y[i+1];
            }
        }
        for(int i =0; i<n; i++){
            if((i+1) >= n){
                area = area - y[i]*x[0];
            }else{
                area = area - y[i]*x[i+1];
            }
        }
        
        if(area < 0){
            area = (-1)*area;
        }
        int area1;
        if(area%2 == 0){
            area = area/2;
            area1 = (int)area;
            System.out.print(area1);
            }
        else if(area%2 != 0){
            area = area/2 + 1;
            area1 = (int)area;
            System.out.print(area1);
        }
    }
    
}
