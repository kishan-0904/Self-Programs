#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    vector<string>v;
    unordered_map<string, int>m;
    string s;
    for( int i=0; i<n; i++)
        cin>>s, v.push_back(s);
    for( int i=0; i<v.size(); i++)
        m[v[i]]++;
    for(auto i:m)
        cout<<i.first<<" "<<i.second<<endl;
}