#include<bit/stdc++.h>
using namespace std;

int search(int arr[], int n, int x)
{ 
 int i;
 for(i=0;i<n ; i++)
  {
    if(arr[i]==x)
     return i;
  }
  return -1;
}
int main()
{
 int arr[]={2,4,5,1,6,8,0};
 int x=2;
 int n = sizeof(arr[])/sizeof(arr[0]);
 cout<< x <<" is found at index: " <<search(arr,n,x);
 getchar();
 return 0;
 }
