Algoritmo "menudeoperacoes"

Var
   x, y: real
   operacao: inteiro


Inicio
      Escreva("Entre com o valor 1: ")
      leia(x)
      Escreva("Entre com o valor 2: ")
      leia(y)
      
      escreval("--------------------------------")
      Escreval("Escolha uma das opcoes abaixo:")
      Escreval("1 - Soma")
      Escreval("2 - Subtracao")
      Escreval("3 - Multiplicacao")
      Escreval("4 - Divisao")
      
      Escreval("Digite o numero da opcao desejada")
      leia(operacao)
      
      escreval("================================")
      escolha operacao
           caso 1
                escreval("Resultado e :", x + y)
           caso 2
                escreval("Resultado e :", x - y)
           caso 3
                escreval("Resultado e :", x * y)
           caso 4
                escreval("Resultado e :", x / y)
      fimescolha
Fimalgoritmo
