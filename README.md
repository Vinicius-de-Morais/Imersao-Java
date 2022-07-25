<h1 align="center"> Imersão Java </h1>

![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)
![Badge License](https://img.shields.io/github/license/Vinicius-de-Morais/Imersao-Java)

Esse é um projeto de imersão da alura, com o fim de dar um primeiro mergulho e conhecer melhor a linguagem java!
Também vizite [projeto de API](https://github.com/Vinicius-de-Morais/Api-imersao-java), pois faz parte do projeto

| 🪧 Vitrine.Dev |     |
| -------------  | --- |
| ✨ Nome        | Imersao-Java
| 🏷️ Tecnologias | Java, Spring, MongoDB, Heroku, Git
| 🚀 URL         | https://vini-api-languages.herokuapp.com/languages
| 🤿 Desafio | https://www.alura.com.br/imersao-java

## ✔️ Tecnologia utilizada

- ``Java 17``

# Challenges
    A imersão possui alguns desafios para instigar ainda mais curiosidade e aumentar o aprendizado.
## Day one
\
    - Content: Dia de início do projeto, onde são apresentados os conhecimentos de como funciona uma API, uma 
    pincelada no que é JSON juntamente com a explicação de como usar o Java para consumir APIs. 
    Cria-se a classe App e um parser para o Json usando expressões regulares.

    - []Consumir o endpoint de filmes mais populares da API do IMDB. 
        Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores 
        séries e o que retorna as séries mais populares.(API FORA DO AR)
    - [x]Usar sua criatividade para deixar a saída dos dados mais bonitinha: 
        usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o 
        terminal com cores, negrito e itálico usando códigos ANSI, e mais!
    - [x]Colocar a chave da API do IMDB em algum lugar fora do código como um 
        arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente
    - [ ]Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON
    - [ ]Desafio supremo: criar alguma maneira para você dar uma avaliação ao filme, 
        puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.
## Day two
\
    - Content: Nesse dia há mais mão na massa. Os instrutores ensinam o funcionamento maior do Java, 
    em conjunto com a utilização de bibliotecas graficas para editar as imagens. 
    O código fica um pouco mais desacoplado, mas ainda bagunçadinho. Cria-se a "Fabrica" para os Stikers.

    - [x] Ler a documentação da classe abstrata InputStream.
    - [x] Centralizar o texto na figurinha.
    - [x] Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!
    - [x] Criar diretório de saída das imagens, se ainda não existir.
    - [x] Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.
    - [x] Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha!
    - [ ] Colocar contorno (outline) no texto da imagem.
    - [ ] Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao 
        invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante
        a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.
    - [ ] Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.
    - [ ] Desafio supremo: usar alguma biblioteca de manipulação de imagens como OpenCV pra extrair 
        imagem principal e contorná-la.
## Day three
\
    - Content: O aula de maior raciocínio. Aqui os instrutores auxiliam na refatoração, mostrando as vantagens 
    de ter um código encapsulado, salientando boas práticas que deixam o código mais limpo e flúido. 
    Aqui são criadas diversas classes que ajudam no desacoplamento do código.
    
    - [x]Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16
    - [x]Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP
    - [x]Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra
    - [ ]Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado
    - [ ]Desafio supremo: consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente.

## Day Four
\
    - Content: Foi o dia em que mais ultilizamos bibliotécas do java, salientando o Spring. Foi criado um novo projeto de API e a aula se passou em torno disso.
    [repositório da API](https://github.com/Vinicius-de-Morais/Api-imersao-java)

    - [x]Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma 
        linguagem cadastrada;
    - [x]Devolver a listagem ordenada pelo ranking;
    - [ ]Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu 
        próprio extrator de informações personalizado OU, manter com o nome title e image e 
        traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);
    - [ ]Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
    - [ ]Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo,
         modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.

## Day Five
\
    - Content: O ultimo dia e aula da imersão. Uma aula ensiando o deploy do projeto ultilizando o Heroku.
    [API no Heroku](https://vini-api-languages.herokuapp.com/languages)
    
    - [x] Compartilhe com seus amigos a sua URL do Heroku, para que eles possam consumir a sua API 
        (com o padrão de atributos title e image) e gerar figurinhas do conteúdo que você utilizou;
    - [ ] Colocar a aplicação no cloud da Oracle;
    - [ ] Implementar algum mecanismo de votação na API, para que outros amigos votem nas linguagens preferidas para 
        que se possa fazer um ranking;
    - [ ] Desafio supremo: Evoluir o projeto das três primeiras aula para que ele gere um bundle de stickers, 
        para que se possa fazer o download e já incluir vários stickers no WhatsApp; Usar os conhecimentos aprendidos em 
        alguma imersão React da Alura e fazer uma aplicação front-end para gerar esse bundle, onde possa se passar a 
        URL do conteúdo e já visualizar os stickers
## License

Imersao-Java is [GNU General Public License v3.0](./LICENSE).
