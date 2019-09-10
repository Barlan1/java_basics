//to compile $javac FindAvg.java
//to run $java Average

class Average
{ 
 public int findAvg(int n1, int n2, int n3, int n4)
 {
 return (n1+n2+n3+n4)/4;
 }
 public static void main(String args[])
 {
 Average obj= new Average();
 int avg= obj.findAvg(12,13,14,15);
 System.out.println("the average of 12,13,14,15 is:" + avg);
 }
