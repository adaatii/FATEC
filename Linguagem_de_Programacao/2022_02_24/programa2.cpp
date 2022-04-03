#include <iostream>
using namespace std;

class Media
{
private:
    float n1, n2, media;

public:
    void lerDados(void);
    void calcularMedia(void);
    void imprimirMedia(void);
};

int main()
{
    Media x;
    x.lerDados();
    x.calcularMedia();
    x.imprimirMedia();
    return (0);
}

void Media::lerDados(void)
{
    cout << "Informe a primeira nota: ";
    cin >> n1;
    cout << "Informe a segunda nota: ";
    cin >> n2;
}

void Media::calcularMedia(void)
{
    media = ((n1 * 2) + (n2 * 3)) / (2+3);
}

void Media::imprimirMedia(void)
{
    if (media >= 5)
    {
        cout << "\n\nAluno aprovado com nota: " << media;
        cout << "\n\n";
    }
    else
    {
        cout << "\n\nAluno reprovado com nota: " << media;
        cout << "\n\n";
    }
}