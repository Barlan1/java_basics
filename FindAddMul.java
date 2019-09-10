public class FindAddMul
{ 
 public int mul(int n1 ,int n2, int n3)
  {
   return (n1*n2*n3);
   
  }
public int add(int n1 ,int n2, int n3)
  {
   return (n1+n2+n3);
   
  }
 public static void main( String args[])
  { 
    FindAddMul obj= new FindAddMul();
    int mulValue =obj.mul(12,13,14);
    int addValue = obj.add(07,11,10);
    System.out.println(" the multiplication of 12, 13,14 is : " + mulValue);
    System.out.println(" the addion of 07,11,10 is : " + addValue);
   }
}
 
