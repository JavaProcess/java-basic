package abc;

public class Calculate {


   public void Callculate(String a){

       String [] c = a.split("[,:]");
       int sum = 0;
        int d =0;
       for(String b : c){
           d =  Integer.parseInt(b);
           sum += d;
           }
        System.out.println("결과 : " + sum);
       }
   }

