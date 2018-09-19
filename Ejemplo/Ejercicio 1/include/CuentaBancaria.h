#ifndef CUENTABANCARIA_H
#define CUENTABANCARIA_H
#include <string>
#include <cmath>

using namespace std;
class CuentaBancaria
{
    public:
        CuentaBancaria();

        string GetnumCuenta() { return numCuenta; }
        void SetnumCuenta(string val) { numCuenta = val; }
        string Getfecha() { return fecha; }
        void Setfecha(string val) { fecha = val; }
        int Getmovimiento() { return movimiento; }
        void Setmovimiento(int val) { movimiento = val; }
        float Getimporte() { return importe; }
        void Setimporte(float val) { importe = val; }




        bool abrirCuenta(string cuenta);
        bool cerrarCuenta();
        float retirarDinero(float retirar);
        float ingresarDinero(float ingresar);

    protected:

    private:
        string numCuenta;
        string fecha;
        float movimiento;
        float importe;

};

#endif // CUENTABANCARIA_H
