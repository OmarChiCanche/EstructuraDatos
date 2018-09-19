#include <iostream>
#include <string>
#include "CuentaBancaria.h"
#include <cmath>
using namespace std;
/*

Autor: Chi Canche Omar Alexis
Fecha: 13 Marzo 2018
Ejercicio: 1 / Tema 2
Descripción: Cuenta Bancaria donde se aplica una cuenta
y hace operaciones con un monto inicial de 1000

*/
int main()
{
    CuentaBancaria banco;//creamos el objeto  de la clase Cuenta Bancaria para el uso del sistema

    string cuenta;
    float retirar, ingresar;
    int opcion;


    banco.SetnumCuenta("12345");
    banco.Setfecha("13/03/2018");
    banco.Setimporte(1000);

    cout<< "BIENVENIDO A SU BANCO\n\n";
    cout<<"Ingrese la cuenta:\t";
    cin>>cuenta;
    if(banco.abrirCuenta(cuenta)){
        cout<<"\nContinue\n";
    }else{
        cout<<"'\nUsuario No Valido, Gracias!";
    }

    cout<<"\nQue Desea Hacer:\n";
    cout<<"\n1.Retirar";
    cout<<"\n2.Depositar";
    cin>>opcion;
    switch(opcion){
        case 1:
            cout<<"\nCuanto Desea Retirar:\t";
            cin>> retirar;
            if(banco.retirarDinero(ret)){

            }
            break;
        case 2:
              cout <<"\nCuanto Desea Depositar:\t";
              cin >>ingresar;
              if(banco.ingresarDinero(ingresar)){}
    }
    return 0;
}
