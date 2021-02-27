#include <iostream>

using namespace std;

int n;
int buscaBinaria(int v[], int chave) {
    int inicio = 0;
    int aux = n - 1;
    int meio;
     
    while (inicio <= aux) {
        meio = inicio + (aux - inicio) / 2;
        if (chave == v[meio])
            return meio;
        else if (chave < v[meio])
            aux = meio - 1;
        else
            inicio = meio + 1;
    }
    return -1;
}

int main () {
    int vetor[100010];
    
    int aux;
    int medida;
    
    int qtd;
    
    while(cin >> n)
    {
        aux = 0;
        qtd = 0;
        for (int i = 0; i < n; i++) {
            cin >> medida;
            aux+= medida;
            vetor[i] = aux;
        }
        if (aux % 3 != 0){
			qtd++;
		}else{
            aux /= 3;
            for (int i = 0 ; i < n; i++) {
                if (buscaBinaria(vetor, vetor[i] + aux) != -1){
                    if (buscaBinaria(vetor, vetor[i] + 2 * aux) != -1){
						qtd++;
					} 
				}
            }
            cout << qtd << "\n";
        }
    }
}
