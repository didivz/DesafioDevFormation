# Desafio do Workstation

Nesse desafio, devemos modelar o workstation da empresa. Um exercício para treinar a Orientação à Objetos
e a abstração das entidades do mundo real, modelando classes e objetos em Java.

### O que é um workstation e pelo que ele é composto?

No mundo real o workstation nada mais é que o local de trabalho nosso. Por exemplo, trabalhamos aqui 
com um computador, cujo tem tela, mouse, teclado, cpu e outros periféricos. Também temos mesa, cadeira, 
companheiros, ferramentas e etc.

Para a nossa modelagem devemos abstrair certos quesítos, por exemplo, o teclado do computador tem N teclas
mas não iremos nos importar com isso, bem como não vamos nos importar se o mouse é sem fio ou não.

### Quais entidades do Workstation devemos considerar?

Para ser simplista nos ateremos à: Mesa, Pessoa, Computador...

#### Mesa

A mesa é composta por 2 computadores (`new Computador[2]`) e duas pessoas(`new Pessoa[2]`) e claro, ela
também tem métodos:
* **adicionarComputador**: Método responsável por adicionar computadores na mesa.


* **mostraComputadores**: Esse método deve, para cada computador, mostrar as informações (tela, teclado, mouse, cpu).


* **[Pendente] mostraComputadoresDesligados**: Os computadores podem estar ligados ou desligados. Esse método
irá mostrar as informações **apenas** dos computadores que estiverem desligados.
```txt
// Resultado esperado:
- Computador 'LG PHILIPS PHILIPS FORTREK' esta desligado.
```

* **[Pendente] mostrarPessoas**: A mesa pode ter até duas pessoas, esse método deverá mostrar o nome de cada 
pessoa que está nela. **Obs:** Precisará criar uma forma de adicionar a pessoa na mesa.
```txt
// Resultado esperado:
- Beatriz
- Larissa
```

#### Pessoa

Essa classe já está finalizada e ela é utilizada pra representar uma pessoa que senta na mesa.

#### Computador

Um computador é composto por muitos componente, nós abstraímos e criamos uma classe que representa cada
computador, onde tem apenas tela, teclado, mouse e cpu.

## O Desafio

Algumas classes já estão implementadas, a estrutura de chamadas já está na classe `Main`. O desafio é
implementar os métodos `mostraComputadoresDesligados` e `mostrarPessoas`.