#include<bits/stdc++.h>
using namespace std;

int main()
{
    int num,k;
    cin>>n>>k;
    string str[num];
    cin>>str;
    string temp = str;
    int left,right;
    left=0;
    right= n-1;
    while(left < right)
    {
        if(str[left] != str[right])
        {
            temp[left] = temp[right] = max(str[left], str[right]);
            k--;
        }
        left++;
        right--;

    }

    if(k<0)
    {
        cout<<"-1";
        exit(0);
    }

    left=0;
    right= n-1;

    while(left < right)
    {
        if(temp[left] < '9')
        {
            if(k>=2 && temp[left] == str[left] && temp[right] == str[right])
            {
                k-=2;
                temp[left] = temp[right] = '9';
            }
            else if(k>=1 && (temp[left] != str[left]  || temp[right] != str[right]))
            {
                k--;
                temp[left] = temp[right] = '9';
            }
        }
        left++;
        right--;
    }
    cout<<temp;
}