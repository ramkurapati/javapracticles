package Bankapp;



class TransactionFactory 
{

    public static Transaction createTransaction (String operation)
    {
       if (operation. equalsIgnoreCase ("balanceenquiry"))
       {
           return new BalanceEnquiry();
       }
       else if(operation. equalsIgnoreCase ("withdraw"))
       {
           return new WithDraw();
        }
       else if(operation. equalsIgnoreCase ("deposit"))
       {
           return new Deposit();
       }
           throw new IllegalArgumentException("No such Transaction");
    }
}

