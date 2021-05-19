
package bank_interest;

public class Bank {
    int getRateOfInterest(){return 0;} 
} 
 
class Agrani_Bank extends Bank{ 
@Override
int getRateOfInterest(){return 8;} 
} 
 
class Pubali_Bank extends Bank{ 
@Override
int getRateOfInterest(){return 9;} 
} 

class DutchBangla_Bank extends Bank{ 
@Override
int getRateOfInterest(){return 10;} 
}  

class StandardChartered_Bank extends Bank{ 
@Override
int getRateOfInterest(){return 12;} 
}

class Test2{ 
       public static void main(String args[]){ 
           Agrani_Bank s=new Agrani_Bank(); 
           Pubali_Bank i=new Pubali_Bank(); 
           DutchBangla_Bank a=new DutchBangla_Bank(); 
           StandardChartered_Bank b=new StandardChartered_Bank(); 
     System.out.println("Agrani Bank Rate of Interest: "+s.getRateOfInterest()); 
     System.out.println("Pubali Bank Rate of Interest: "+i.getRateOfInterest()); 
     System.out.println("DutchBangla Bank Rate of Interest: "+a.getRateOfInterest());
     System.out.println("Standard Chartered Bank Rate of Interest: "+b.getRateOfInterest());
   } 
}
