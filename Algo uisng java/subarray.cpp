#include<bits/stdc++.h>

int countSubarrays(int arr[], int n, int k) { 
  int start = 0, end = 0, count = 0, sum = arr[0];

    while (start < n && end < n) { 
    
        if (sum <= k) { 
           end++; 
    
           if (end >= start) 
             count += end - start; 
    
           if (end < n) 
             sum += arr[end]; 
        } 
    
        else { 
           sum -= arr[start]; 
           start++; 
        } 
    } 
    
    return count; 
    
    }
    
    int main()
    {

    int n,k;
    cin >> n >> k;
    int *array= new int[n];
    for(int i=0;i<n;i++)
    {
        cin>>array[i];
    }
    cout << max(0,int(pow(2,n))-2*(countSubarrays(array, n, k)+1));
    return 0;
    } 
