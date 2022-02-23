#include<iostream>
using namespace std;

class Media
{
    private:
    float n1,n2,n3,media;
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
    return(0);   
}

void Media::lerDados(void)
{
    cout<<"Informe um n1: ";
    cin>>n1;
    cout<<"Informe um n2: ";
    cin>>n2;   
    cout<<"Informe um n3: ";
    cin>>n3;
}

void Media::calcularMedia(void)
{
    media = (n1+n2+n3)/3;
}

void Media::imprimirMedia(void)
{
    cout<<"Media = "<<media<<endl;
}
   
   