#include "Hangman.h"
#include <iostream>
#include <string>
#include <cstdlib>
#include <vector>
#include <time.h>
#include <queue>

using namespace std;

Hangman::Hangman()
{
    //ctor
}
string palabraA, palabraB;
int Inten;


void Hangman::Menu(){

    Empezar();
    Mostrar();

    while(Inten>0 && palabraB!=palabraA)
    {
        char x;
        cin>>x;
        system("cls");
        Ingresar(x);
        cout<<"Vamos a jugar\n";
        cout<<"Escriba una letra y enter :)";
        Mostrar();
    }
    if(Inten>0){
        cout << "\nUsted ha ganado el juego, felicidades"<<endl;
    }else{
        cout << "\nUsted ha perdido la palabra era:\t"<<palabraA<<endl;
    }
palabraB="";
}

void Hangman::Empezar()
{
        Inten = 6;
        palabraA=obtenerPalabra();

        for(int i=0; i<palabraA.length() ; i++){
        if(palabraA[i]>='A' && palabraA[i]<='Z'){
            palabraA[i]+=32;
        }
    }

    for (int j=0; j<palabraA.length() ; j++){

        if(palabraA[j]>='a' && palabraA[j]<='z'){
            palabraB+='-';
        }else{

            palabraB+=palabraA[j];
        }
    }
}

string Hangman::obtenerPalabra()
{
  int pal;

    vector<string>palabras;
    palabras.push_back("Gato");
    palabras.push_back("Perro");
    palabras.push_back("Tortuga");
    palabras.push_back("Sistemas");
    palabras.push_back("Codigo");

    srand(time(NULL));
    pal = 0 + rand()%(5);

    return palabras[pal];
}

void Hangman::Mostrar()
{
    cout<<"\n\nUsted Tiene "<<Inten<<" Intentos"<<endl;
    cout<< palabraB<<endl;
}

void Hangman::Ingresar(char x)
{
    bool menInten=true;
    for(int i=0; i<palabraA.length(); i++){
        if(x==palabraA[i]){
            menInten=false;
            palabraB[i]=x;
        }
    }

    if(menInten) Inten--;
}

