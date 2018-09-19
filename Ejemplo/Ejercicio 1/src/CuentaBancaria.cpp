#include <iostream>
#include "CuentaBancaria.h"
#include <string>
#include <cmath>

using namespace std;
/*

Autor: Chi Canche Omar Alexis
Fecha: 13 Marzo 2018
Ejercicio: 1 / Tema 2
Descripción: Cuenta Bancaria donde se aplica una cuenta
y hace operaciones con un monto inicial de 1000

*/

CuentaBancaria::CuentaBancaria()
{
    //ctor
}

bool CuentaBancaria::abrirCuenta(string cuenta){
    if(CuentaBancaria::numCuenta == cuenta){
        return true;
    }else{
        return false;
    }
}

bool CuentaBancaria::cerrarCuenta(){
    return true;
}

float CuentaBancaria::retirarDinero(float retirar){
    float saldo=importe-retirar;
    cout <<"su saldo anterior es: "<<CuentaBancaria::importe;
    cout <<"\nsu saldo actual es: "<<saldo;
}

float CuentaBancaria::ingresarDinero(float ingresar){
    float saldo=importe+ingresar;
    cout <<"su saldo anterior es: "<<CuentaBancaria::importe;
    cout <<"\nsu saldo actual es: "<<saldo;
}
