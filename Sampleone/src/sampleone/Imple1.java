/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sampleone;

/**
 *
 * @author davcpe
 */
public class Imple1 extends Algo{

    @Override
    public void forloop() {
       System.out.println("ForLoop Sample one");
        for(int i =0;i<= 10;i++){
           
           System.out.println(i);
       }
       System.out.println("-------------------------------------------");
      ///////////////////////////////////////////////////////////// 
      System.out.println("NestLoop Sample two");
        for(int i =1;i<= 10;i++){
           for(int j=0;j<=5;j++){
             System.out.println("Hello");    
             }
           System.out.println("-------------------------------------------"+i);
             
       }
       System.out.println("-------------------------------------------"); 
       ////////////////////////////////////////////////////////////
       System.out.println("Pyramid loop Sample three");
        for(int i =1;i<=10;i++){
          for(int j=0; j<i;j++){
             System.out.print("j="+j);  
          }
             System.out.println();  
        }
       System.out.println("-------------------------------------------"); 
      ////////////////////////////////////////////////////////////
       System.out.println("Backward Pyramid loop Sample four");
        for(int i =10; i>=0; i--){
          for(int j=0; j<i;j++){
             System.out.print("j="+j);  
          }
             System.out.println();  
        }
       System.out.println("-------------------------------------------");        
    }

    @Override
    public void While() {
       System.out.println(" While loop Sample One"); 
        int i =0;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("-------------------------------------------");
        /////////////////////////////////////////////////////////////////////
        
        System.out.println(" While loop Sample Two"); 
        
        int j=0;
        while (j<=10){
            
            int k=0;
            while(k<=5){
                System.out.println("Hello");
                k++;
            }
            System.out.println("-------------------------------------------"+j);
            System.out.println();
           j++;
        }
        System.out.println("-------------------------------------------");
        /////////////////////////////////////////////////////////////////////
    }
  
    
    

    @Override
    public void Array() {
        int []x =  new int[5]; // Declare array x ans set array x as 5 position as default
        int []a = x;  // Convert array x  equal to array a
        
        x[0] =0;
        x[1] =1;
        x[2] =2;
        x[3] =3;
        x[4] =4;
        
   
        for(int i =0;i<=4;i++ ){
            System.out.println(a[i]);
        }
        
        //System.out.println(a[1]);
    }
    
}
