#include <iostream>
#include <stdlib.h>
#include "natural.h"

using namespace std;

int main()
{

    int num[5];
    cout<<"\t\tBienvenido"<<endl;
    cout<<"Ingrese 5 Numeros Mayores A Cero (5>0)"<<endl;

    for(int i=0; i<=4; i++)
    {
        cout<<"Ingrese el numero: \t";
        cin >>num[i];
        if (num[i]<0)
        {
           cout<<"\nError... Debe ingresar numeros mayores o iguales cero\nIntente de nuevo.. Gracias"<<endl;
            i--;
        }
    }
    system("cls");

    natural nat;
    cout<<"\nAntecesores\n";
    nat.antecesor(num);
    cout<<"\nSucesores\n";
    nat.sucesor(num);
    cout<<"\nEl menor de los numeros es: "<<nat.menor(num);
    cout<<"\nEl mayor de los numeros es: "<<nat.mayor(num);
   // cout<<"\nLa diferencia del menor con el mayor es: "<<nat.mayor(num)-nat.menor(num);
    cout<<"\nLa suma de los numeros es: "<<nat.suma(num)<<endl;


    return 0;
}
