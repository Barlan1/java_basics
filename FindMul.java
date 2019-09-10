public class FindMul
{ 
 public int mul(int n1 ,int n2, int n3)
  {
   return (n1*n2*n3);
  }
 public static void main( String args[])
  { 
    FindMul obj= new FindMul();
    int mulValue =obj.mul(12,13,14);
    System.out.println(" the multiplication of 12, 13,14 is : " + mulValue);
   }
}
 
