public class leapyearexample {
 public static void main(String[] args) {
  int year = 1992;
  if (((year % 4 == 0) && (year % 100!=0))||( year % 400 == 0)) {
    System.out.println(" leap year");
   }
   else {
   System.out.println(" common year");
  }
 }
} 
