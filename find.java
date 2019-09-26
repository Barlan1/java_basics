public class find {
  static int search(int arr[],int n, int x) {
  int i;
  for(i=0; i<n; i++) {
   if (arr[i]==x)
      return i; 
   }
      return -1;
 }
public static void main(String[] args) {
 int arr[]= {1,2,3,4,5,6,7,8};
 int x=3;
 int n= arr.length()
 System.out.printf("%d is present at index %d", x, search(arr,n,x));
 }
}
