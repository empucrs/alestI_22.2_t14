#criando a classe stack para definir nossa pilha
class Stack:
    """Este arquivo tem como objetivo implementar o TAD Pilha em Python"""

    #iniciando o objeto
    def __init__(self):
        self.items = []
    
    #criando o método isEmpty, que irá retornar True se a pilha estiver vazia e False se tiver algum elemento
    def isEmpty(self):
        if self.items == []:
            return True
        else:
            return False

    #criando o método push, que insere um elemento qualquer "item" no início da pilha.
    def push(self, item):
        self.items.insert(0,item) #o método insert recebe 2 parâmetros: o índice no qual o item será inserido antes e o próprio item

    #criando o método pop que remove e retorna o primeiro elemento da pilha, desde que não seja uma pilha vazia
    def pop(self):
        if not self.items == []:
            return self.items.pop(0)
        else:
            return "Pilha vazia!"
    
    #criando o método top, que retorna o primeiro item da pilha, desde que não seja uma pilha vazia 
    def top(self):
        if not self.items == []:
            return self.items[0]
        else:
           return "Pilha vazia!"

    #criando o método size, que retorna o tamanho da pilha
    def size(self):
        return len(self.items)

    #criando o método clear, que remove todos os elementos da pilha, sem a excluir
    def clear(self):
        del self.items[:]


# -------------------------------- // --------------------------------

#criando objeto pilha, o qual vamos chamar de "s"
s = Stack()

#adicionando elementos à pilha
s.push('3')
s.push('5')
s.push('7')
s.push('9')

#verificando se a pilha está vazia
print("A pilha está vazia? Resposta:", s.isEmpty())

#verificando que o conceito de pilha (LIFO) se aplica
print("Nossa pilha agora está assim:", s.items)

#removendo e retornando o primeiro elemento de nossa pilha
print("O primeiro elemento da pilha é", s.pop(), "e ele foi removido.")

#verificando se a operação pop funcionou
print("A nova lista é", s.items)

#verificando o primeiro item da pilha após a operação
print("O novo primeiro elemento é", s.top(), ".")

#verificando o tamanho da pilha
print("Podemos afirmar que a pilha tem tamanho", s.size())

#por fim, limpando a nossa pilha
s.clear()
print("A pilha após o clear está assim:", s.items, "\nOu seja, está vazia!")

