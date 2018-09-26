#include <iostream>
#include "Conjuntos.h"
#include <stdlib.h>
#include<string>
using namespace std;

int main()
{

    int num = 10;
    int conjuntoA[num];
    int conjuntoB[num];
    int c;
    cout<<"\tBienvenido\nIngrese diez numeros mayores a cero\n"<< endl;

    cout << "conjunto A\n"<< endl;
    for(int i=0; i<num; i++){
        cin >> conjuntoA[i];
        cout << "\n";
    }
    cout << "\nconjunto B\n"<< endl;
    for(int j=0; j<num; j++){
        cin >> conjuntoB[j];
        cout << "\n";
    }

    char a;
do{
    system("cls");

    Conjuntos C;


    C.lista(conjuntoA, conjuntoB);
    int op;
    cout << "\nOperacion de conjuntos\n"<< endl;
    cout << "\nQue desea hacer?\n"<< endl;
    cout << "\n1.Union \n"<< endl;
    cout << "\n2.Interseccion \n"<< endl;
    cout << "\n3.Diferencia \n"<< endl;
    cout << "\n4.Retirar elemento \n"<< endl;
    cout << "\n5.Aadir elemento\n"<< endl;
    cout << "\n6.Conjunto vacio \n"<< endl;
    cout<<"\nOpcion:\t";cin >> op;
    switch(op){

    case 1:
        system("cls");
            cout << "\n1.Union \n"<< endl;
            cout << "\nLa union de los conjuntos es:\n"<< endl;
            C.Union(conjuntoA, conjuntoB);
    break;
    case 2:
        system("cls");
            cout << "\n2.Interseccion\n"<< endl;
            cout << "\nLa interseccion de los conjuntos es:\n"<< endl;
            C.Interseccion(conjuntoA, conjuntoB);
    break;
    case 3:
        system("cls");
        cout << "\n3.Diferencia\n"<< endl;
        cout << "\n3.La diferencia delos conjuntos es\n"<< endl;

        C.Diferencia(conjuntoA, conjuntoB);
    break;

    case 4:
        system("cls");

        cout << "\nRetirar numero\n"<< endl;
        cout << "\nConjunto A\n"<< endl;
        cout << "\nCOnjunto B\n"<< endl;
        cin >> c;
        if(c==1){
            int a;
            cout << "\nNumero a retirar\n"<< endl;
            cin >> a;
            C.Setnumero(a);
            C.elementoR(conjuntoA);
        }else{
            int x;
            cout << "\nNumero a retirar\n"<< endl;
            cin >> x;
            C.Setnumero(x);
            C.elementoR(conjuntoB);
            }
            break;
    case 5:
        system("cls");

        cout << "\tAnadir Numero\n"<< endl;
        cout << "\tConjunto A\n"<< endl;
        cout << "\tConjunto B\n"<< endl;
        cin >> c;
        if(c==1){
            int a,z;
            cout << "\nQue numero desea anadir \n"<< endl;
            cin >> a;
            C.Setnumero(a);
            cout << "\nque posiscion desea\n"<< endl;
            cin >> z;
            C.Setpos(z);
            C.elementoA(conjuntoA);
        }else{
            int a,z;
            cout << "\nQue numero desea anadir\n"<< endl;
            cin >> a;
            C.Setnumero(a);
            cout << "\nQue posicion desea\n"<< endl;
            cin >> z;
            C.Setpos(z);
            C.elementoA(conjuntoB);
            }
            break;
    case 6:
        system("cls");

        cout << "\nConjunto Vacio \n"<< endl;
        C.ConjuntoVacio();
        break;
    }
cout << "\n\n COntinuar? Escriba S o s (S/N)"<< endl;
cin>> a;
}while(a=='S'||a=='s');

return 0;
}
