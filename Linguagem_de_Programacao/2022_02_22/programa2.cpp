#include <iostream>

using namespace std;

class funcionario
{
    private:
        int mat;
        float salario;
    public:
        void cadastrar(void);
        void listagem(void);
};

int main()
{
    funcionario x;//objetos(variavel criada apartir da classe)
    x.cadastrar();
    x.listagem();
    return(0);
}

void funcionario::cadastrar(void)
{
    cout<<"Informe a matricula do funcionario: ";
    cin>>mat;
    cout<<"Informe o salario do funcionario: ";
    cin>>salario;
}

void funcionario::listagem(void)
{
    cout<<"\n\n";
    cout<<"Matricula do funcionario = "<<mat<<endl;
    cout<<"Salario do funcionario = "<<salario<<endl;
}