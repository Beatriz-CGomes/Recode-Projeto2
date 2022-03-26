Algoritmo "DADOS VISUALG"
//  
//  
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/10/2021
Var
   // Seção de Declarações das variáveis
   nome, data, cpf, rg, datad, destino: vetor [1 .. 2] de caracter
   opcao, i: inteiro
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   Repita
      escreval("======= DADOS DO CLIENTE ======")
      escreval("0  = Encerrar consulta")
      escreval("1 = Cadastrar")
      escreval("2 = Consultar")
      leia(opcao)

      Escolha opcao
      Caso 0
         escreval ("Programa encerrado")
      Caso 1
         para i de 1 ate 2 faca
            escreval("Digite o nome completo do cliente")
            leia(nome[i])

            escreval("Digite a data de nascimento")
            leia(data[i])

            escreval("Digite o cpf")
            leia(cpf[i])

            escreval("Digite o RG")
            leia(rg[i])

            escreval("Digite o destino escolhido")
            leia(destino[i])


            escreval("Digite a data desejada")
            leia(datad[i])
         fimpara
      Caso 2
         para i de 1 ate 2 faca
            escreval("Dados do cliente ", nome[i])
            escreval("Dados da viagem ", destino[i])
         fimpara
      fimEscolha
   ate (opcao = 0)
Fimalgoritmo