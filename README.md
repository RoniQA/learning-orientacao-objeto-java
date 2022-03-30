# learning-orientacao-objeto-java
*Programação Orientada a Objeto com Java
- Vantagens (COMERNada)
	. Confiável: O isolamento entre as partes gera software seguro. Ao alterar uma parte, nenhuma outra é afteda.

	. Oportuno: Ao dividir tudo em partes, várias delas podem ser desenvolvida em paralelo.

	. Manutenível: Atualizar um software é mais fácil. Uma pequena modificação vai beneficiar todas as partes que usarem o objeto.

	. Extensível: O software não é estático. Ele deve crescer para permanacer util.

	. Reutilizável: Podemos usar objetos de um sistema que criamos em outro sistema futuro.

	. Natural: Mais fácil de entender. Você se preocupa mais na funcionalidade do que nos detalhes de implementação.

* Oque é um objeto
- Coisa material ou abstrata que pode ser percebida pelos sentidoos e descrita por meio das suas características, comportamento e estado atual. (característica, comportamento e estado).

* Oque deve ter em uma classe:
- Coisas que eu tenho (Atributo)


- Coisas que eu faço (Métodos)


- Como eu estou agora? (Estado)

* Classe: Define os atributos e métodos comuns que serão compartilhados por um objetivo.

* Objeto: É uma instância de uma classe.

* Modificadores de visibilidade
	- Indicam o nível de acesso aos componentes internos de uma classe.
		. + = público: a classe atual e todas as outras classes terão acesso a ela.

		. - = privado: somente a classe atual.

		. # = protegido: a classe atual e todas as suas subclasses.

* Métodos especiais
	- modificadores:
		. GETTER

		. SETTER

		. CONSTRUCT

* Encapsular
	- Ocultar partes independente da imlementação, permitindo construir partes invisíveis ao mundo exterior.
		. Encapsular não é obrigatório, mas é uma boa prática para produzir classes mais eficientes.

	- Vantagens:
		. Tornar mudanças invisiveis.
		. Facilitar a reutilização de códigos.
		. Reduzir os efeitos colaterais.

* Insterface
	- É uma lista de serviços fornecidos por um componente. É o contato com o mundo exterior,que define oque deve ser feito com o objeto dessa classe. 

* Herança 

	- Permite basear uma nova classe na definição de uma outra classe previamente existente.

	- A herança seá aplicada tanto para as características quanto para os comportamentos.

* Nomenclaturas;

	- Mãe (super classe): Uma classe que é mãe de outras classes.

	- Filhas (sub classe): Uma classe que possui uma mãe.

	- Raiz: Classe que não tem super mãe (superclasse).

	- Folhas: Classes que não tem filhas (subclasse).

	- Descendente: São decendentes todas as classes que não estão ligadas diretamente e que vem depois da classe mãe.

	- Ancestral: São ancestrais as classes que originaram as bubclasses (não ligadas diretamente).

	- De cima para baixo: Especialização.

	_ De baixo para cima: Generalização.

* Tipos de classe e métodos

	- Classe abstrata: Não pode ser instanciada. Só pode servir como progenitora.


	- Método abstrato: Declarado, mas não implementado na progenitora.


	- Classe final: Não pode ser herdada por outra classe. Obrigatoriamente FOLHA (Estéril)


	- Método final: Não pode ser subrescrito pelas suas subclasses. Obrigatoriamente herdado.

* Polimorfismo ( poli = muitas morfo = formas)

	- Permite que um mesmo nome represente vários comportamentos diferentes.

* Tipos de polimorfismo

	- Sobreposição: Acontece quando substituímos um método de uma superclasse na sua subclasse, usando a mesma assinatura.

	- Sobrecarga: 
