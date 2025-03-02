Algoritmo "pesquisaemvetor"


Var
busca: vetor[1..3] de inteiro
i,x: inteiro

Inicio
      Escreval("Entre com os valores do vetor")
      
      para i de 1 ate 3 faca
           Escreval("Valor da posicao", i,":")
           leia(busca[i])
      fimpara
      
      Escreval("Qual o valor voce deseja buscar?")
      leia(x)
      para i de 1 ate 3 faca
           se x = busca[i] entao
              escreval("O valor :",x," Esta na posicao: ",i)
           fimse
      fimpara

Fimalgoritmo