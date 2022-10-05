# alestI_22.2
1. Validação do usuário usando ssh 
  1.1. No windows
    --> adicionei a ferramenta client openssh
    --> rodei o cmd como administrador
    --> rodei o comando ssh-keygen sem parametros
      --> ignorei o nome do arquivo a ser gerado
      --> entrei com uma senha
    --> copiei o conteúdo do arquivo .pub que foi gerado
    --> Colei no github
      --> acessei meu perfil
      --> abri as configurações
      --> acessei o link "SSH e GSH Keys"
      --> cliquei em new ssk key, no bloco (SSH Keys)
      --> colei o conteúdo do arquivo .pub e salvei
    --> Para validar o funcionamento
      --> clonei este repositório
      --> Adicionei os passos neste arquivo
      --> estou realizando um commit e um push neste momento via console do windows
        --> precisei identificar meu usuário
          --> usei "git config --local user.name empucrs" e não funcionou
          --> usei "git config --local user.email edson.moreno@pucrs.br" e a chave ssh foi identificada, sem a necessidade de entrar com a senha
         