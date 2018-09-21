#ifndef HANGMAN_H
#define HANGMAN_H
#include <cstdlib>
#include <vector>
#include <time.h>
#include <iostream>
#include <string>
#include <queue>

using namespace std;

class Hangman
{
    public:
        Hangman();
        void Menu();
        void Mostrar();
        void Ingresar(char x);
        void Empezar();

        string obtenerPalabra();
    protected:

    private:
};

#endif // HANGMAN_H
