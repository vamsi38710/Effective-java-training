import java.util.Scanner; 

 class Bank{
     Scanner scand=new Scanner(System.in);
     int acNo=acNo=scand.nextInt();
     String name =name =scand.nextLine();
      String password=password=scand.nextLine();
      float balance =balance =scand.nextFloat();
      float intrestRate=intrestRate=scand.nextFloat();
     

 static void deposite(){
    float depAm;
     depAm=scand.nextFloat();
    if(depAm>0)
    {
        float balance=balance+depAm;
       System.out.println("Balance"+balance);
    }
   


}
 static void withdraw()
{
    int withdrawAmt;
    String Vpass;
    if(Vpass==password && balance>0 && withdrawAmt<balance && withdrawAmt>0)
    {
         balance=balance-withdrawAmt;
        System.out.println("New Balance="+balance);
    }
    
}
static void intrestCredit()
{ 
    System.out.println("Enter duration of Intrest in month");
    int duration;
     duration =scand.nextInt();
     balance=balance + (balance *intrestRate/1200);
    System.out.println("New Balance="+balance);

}
 static void display()
{
    System.out.println("Account No. -"+acNo);
    System.out.println("Name"+name);
    System.out.println("Balance="+balance);

}
public static void main(String args[])
{
    int a;
    Scanner scand=new Scanner(System.in);
     a=scand.nextInt();
    System.out.println("Enter number for operration");
    System.out.println("Deposite  :1");
    System.out.println("Withdraw  :2");
    System.out.println("Intrest  :3");
    System.out.println("Status  :4");
    switch(a)
    {
        case 1:
          deposite();
          break;
        
        case 2:
           withdraw();
           break;
        
        case 3:
            intrestCredit();
            break;
        
        case 4:
            display();
            break;


    }
}
}
