
package pkg3.hafta.pkg4;

import java.util.Scanner;

public class Hafta4 {

    
    public static void main(String[] args) {
           int i ,n, toplam;
         Scanner input= new Scanner(System.in);
        System.out.println("Enter a number ");
         n = input.nextInt();
         
      
         toplam=0;
       
         
        
      for(i=1; i<n;i++){

           if(i%2 !=0) toplam += i;

        }
      
        System.out.println(n+"toplam= "+toplam);
        
    }
    
}
