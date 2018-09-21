#include <iostream>
#include <stdlib.h>
#include "Natural.h"
//Omar Alexis Chi Canche Ejercicio 3 Tema 1
//Programa para saber el antecesor el sucesor, la suma, el menor, el mayor de n numeros
using namespace std;

int main()
{

    int num[5];
    cout<<"\t\tBienvenido"<<endl;
    cout<<"Ingrese 5 Numeros Mayores A Cero (5>0)"<<endl;

    for(int i=0; i<=4; i++)
    {
        cout<<"Ingrese el numero "<< i+1 <<": \t";
        cin >>num[i];
        if (num[i]<0)
        {
           cout<<"\nError... Debe ingresar numeros mayores o iguales cero\nIntente de nuevo.. Gracias"<<endl;
            i--;
        }
    }
    system("cls");

    Natural nat;
    cout<<"\n\tAntecesores\n";
    nat.antecesor(num);
    cout<<"\n\tSucesores\n";
    nat.sucesor(num);
    cout<<"\nEl menor de los numeros es: "<<nat.menor(num);
    cout<<"\nEl mayor de los numeros es: "<<nat.mayor(num);
    cout<<"\nLa diferencia del menor con el mayor es: "<<nat.mayor(num)-nat.menor(num);
    cout<<"\nLa suma de los numeros es: "<<nat.suma(num)<<endl;


    return 0;
}
