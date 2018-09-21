#include <iostream>
#include "natural.h"
using namespace std;

Natural::Natural()
{
}

int Natural::antecesor(int num[5]){
    for(int i=0; i<=4; i++)
    {
        if(num[i]>0)
        {
        cout<<"Antecesor de "<<num[i]<<" es :"<<num[i]-1<<endl;
        }
       else
        {
        cout <<"El Numero "<<num[i]<<" :NO tiene antecesor\n";
        }
    }
}

int Natural::sucesor(int num[5]){

    for(int i=0; i<=4; i++)
    {
        if(num[i]>=0)
        {
        cout<<"Sucesor de "<<num[i]<<" es :"<<num[i]+1<<endl;
        }
    }
}

int Natural::menor(int num[5]){
    int me=num[0];
    for(int i=0; i<=4; i++){
        if(num[i+1]<me)
            me = num[i+1];
        }
    return me;
}

int Natural::mayor(int num[5]){
    int ma=num[0];
    for(int i=0; i<=4; i++){
        if(num[i+1]>ma)
            ma = num[i+1];
        }
    return ma;
}
int Natural::suma(int num[5]){
    int sum =0;
    for(int i=0; i<=4; i++){
        sum += num[i];
    }
    return sum;
}
