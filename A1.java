
   class A1
   {
     public static void main(String args[])
     {
      int a=1,b=2,c=3;
      int d=a++ - b++ + c++;
      int e=d++ - ++d - c++;
      int f=e++ + d++ + c--;
      int res=d++ + ++d - f-- + --e;
      System.out.println(res);
     }   
   }