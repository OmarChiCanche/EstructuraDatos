#include "Hangman.h"
#include <string>
#include <cstdlib>
#include <vector>
#include <windows.h>
#include <iostream>
#include <time.h>
#include <queue>
using namespace std;

int main()
{
    Hangman game;
    int op;
    cout<<"\tBienvenido al Juego del ahorcado\n";
    cout<<"Vamos a jugar\n";
    cout<<"Escriba una letra y enter :)";
    do
    {
        game.Menu();
        cout<<"\n\nQue deseas hacer?";
        cout<<"\n1.- Jugar";
        cout<<"\n2.- Salir";
        cout<<"\nOpcion\t:";cin>>op;
        cout<<endl;
    }while (op!=2);
    cout<<"Espero se haya divertido, Adios";
    cin.get();


}
