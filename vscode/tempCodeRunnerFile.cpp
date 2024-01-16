#include<iostream>
using namespace std;


int main(){


    int a=12;
    int b=23;

    a= a+b - (b=a);

    cout<<a<<endl;
    cout<<b<<endl;
}