#include<bits/stdc++.h>
using namespace std;
void sortStringSimple(string &str)
{
sort(str.begin(), str.end());
cout<<str;
}
int main()
{
string s = " hivikasthisnewton";
sortStringSimple(s);
return 0;
}
