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
       System.out.println("ForLoop Sample:one");
        for(int i =0;i<= 10;i++){
           
           System.out.println(i);
       }
       System.out.println("-------------------------------------------");
      ///////////////////////////////////////////////////////////// 
      System.out.println("NestLoop Sample:two");
        for(int i =1;i<= 10;i++){
           for(int j=0;j<=5;j++){
             System.out.println("Hello");    
             }
           System.out.println("-------------------------------------------"+i);
             
       }
       System.out.println("-------------------------------------------"); 
       ////////////////////////////////////////////////////////////
       System.out.println("Pyramid loop Sample:three");
        for(int i =1;i<=10;i++){
          for(int j=0; j<i;j++){
             System.out.print("j="+j);  
          }
             System.out.println();  
        }
       System.out.println("-------------------------------------------"); 
      ////////////////////////////////////////////////////////////
       System.out.println("Backward Pyramid loop Sample:four");
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
       System.out.println(" While loop Sample:One"); 
        int i =0;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("-------------------------------------------");
        /////////////////////////////////////////////////////////////////////
        
        System.out.println(" While loop Sample:Two"); 
        
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
        System.out.println("Array one dimension sample: one");
        int []x =  new int[5]; // Declare array x ans set array x as 5 position as default
        int []a = x;  // Convert array x  equal to array a
        
        x[0] =0;
        x[1] =1;
        x[2] =2;
        x[3] =3;
        x[4] =4;
        
   
        
        String []str = new String[5];
        String []str2 = str;
        str[0] = "H";
        str[1] = "E";
        str[2] = "L";
        str[3] = "L";
        str[4] = "O";
        
        
        String country = "Belgium,France,Italy,Germany,Spain";
		String[] arr = country.split(",");
    	
		
        for(int i =0;i<=str.length-1 ;i++ ) // length == number of array  String[5] ; length = 5  but index =4 position (0,1,2,3)
        {
            System.out.println(a[i]);
            System.out.println(str2[i]);
        }
        
        for(int i=0; i<arr.length; i++)
	{
            System.out.println("Value index["+i+"] = " + arr[i]);  
            
	}
       }

    
    @Override
    
    public void Array2D(int x, int y) {
        System.out.println("Array two dimension sample: one");
        String[][] arr = new String[x][y];
        
        arr[0][0] = "1";
        arr[0][1] = "Weerachai";
        arr[0][2] = "021987102";

        arr[1][0] = "2";
        arr[1][1] = "Win";
        arr[1][2] = "0819876107";

        arr[2][0] = "3";
        arr[2][1] = "Eak";
        arr[2][2] = "012345678";

        arr[3][0] = "4";
        arr[3][1] = "Chai";
        arr[3][2] = "087654321";
        
        arr[4][0] = "4";
        arr[4][1] = "Chai";
        arr[4][2] = "087654321";
        
        
        
        for (int i = 0; i<= arr.length-1; i++){ // length will count from first dimension
             System.out.println(i);
            }  
    }

    @Override
    public int Check(int x) {
        
        
        return x =10;
    }
    
    
    
    
}
