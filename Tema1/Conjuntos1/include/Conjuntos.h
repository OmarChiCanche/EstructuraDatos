#ifndef CONJUNTOS_H
#define CONJUNTOS_H


class Conjuntos
{
    public:
        Conjuntos();

        int Getnumero() { return numero; }
        void Setnumero(int val) { numero = val; }
        int Getpos() { return pos; }
        void Setpos(int val) { pos = val; }

        int lista(int conjuntoA[], int conjuntoB[]);
        void ConjuntoVacio();
        int elementoA(int conjunto[]);
        int PerteneceAlConjunto(int conjunto[]);
        int elementoR(int conjunto[]);
        int Union(int conjuntoA[], int conjuntoB[]);
        int Interseccion(int conjuntoA[], int conjuntoB[]);
        int Diferencia(int conjuntoA[], int conjuntoB[]);

    protected:

    private:
        int numero;
        int pos;
};

#endif // CONJUNTOS_H
