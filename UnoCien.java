
package uno.cien;


public class UnoCien {

   
    public static void main(String[] args) {
     
       int n=1,c=0,s=0;
       while(n<=100){
           
           if(n%2==0){
           c++;
           } s=s+n;  n++;
       } System.out.println("la suma de los impares es "+s);
       System.out.println("los numeros pares son "+c);
       
       
       
    }
    
}
