#include <iostream>
using namespace std;

class Tabuada
{
private:
    int n;

public:
    void lerDados(void);
    void calcularTabuada(void);
    void imprimirTabuda(void);
};

int main()
{
    Tabuada x;
    x.lerDados();
    x.calcularTabuada();
}

void Tabuada::lerDados(void)
{
    cout << "Informe o numero da tabuada: ";
    cin >> n;
}

void Tabuada::calcularTabuada(void)
{
    for (int i = 1; i <= n; i++)
    {
        cout<<"Tabuada " ;
        cout << "\n";
        
        for (int j = 1; j <= 10; j++)
        {
            
            cout << i * j;
            cout << "\n";

        }
    }
}
