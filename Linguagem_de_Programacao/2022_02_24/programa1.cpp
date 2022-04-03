#include<iostream>

using namespace std;

class Salario
{
    private:
        float salarioAtual, salarioNovo;
    public:
        void lerSalarioAtual(void);
        void processaAumento(void);
        void imprimeSalario(void);


};

int main()
{
    Salario obj;
    obj.lerSalarioAtual();
    obj.processaAumento();
    obj.imprimeSalario();
    return(0);
}

void Salario::lerSalarioAtual()
{
    cout<<"Informe o salario atual: ";
    cin>>salarioAtual;
}

void Salario::processaAumento()
{
    salarioNovo = salarioAtual * 1.25;
}

void Salario::imprimeSalario()
{
    cout<<"\n\nSalario atual = "<<salarioAtual;
    cout<<"\nSalario novo = "<<salarioNovo;
    cout<<"\n\n";
}