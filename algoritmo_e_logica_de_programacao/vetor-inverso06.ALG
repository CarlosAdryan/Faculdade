Algoritmo "6.vetor-inverso"


Var
   vect: vetor[1..5] de inteiro
   i, x: inteiro

Inicio
      Escreval("Entre com os valores do vetor")
      
      para i de 1 ate 5 faca
           leia(vect[i])
      fimpara
      
      para i de 5 ate 1 passo -1 faca
           escreval(vect[i])
      fimpara
Fimalgoritmo