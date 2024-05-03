## 📝 Sobre
Este é um conjunto de classes e interfaces em Java para um projeto de gerenciamento de filmes e séries. Aqui estão as principais partes do código:

### Pacote `screenmovie.model`:
- Contém as classes relacionadas aos modelos do projeto, como `Titulo`, `Movie`, `Serie` e `Episodio`.
- Cada classe neste pacote representa entidades específicas do domínio do projeto, como filmes, séries e episódios.
- Essas classes contêm atributos e métodos para representar e manipular informações sobre os títulos, como nome, ano de lançamento, duração e outras características relevantes.

### Classe `Titulo`:
- Serve como uma classe base para os títulos de filmes e séries.
- Possui atributos comuns a todos os títulos, como nome, ano de lançamento, duração em minutos e outras informações.
- Inclui métodos para acessar e modificar esses atributos, além de métodos para exibir a ficha técnica e calcular a média das avaliações.

### Classe `Movie` (Filme):
- Representa um filme e estende a classe `Titulo`.
- Além dos atributos herdados, possui um atributo específico para o diretor do filme.
- Implementa a interface `Classificavel`, que fornece uma classificação com base nas avaliações recebidas.
- O método `getClassificacao()` retorna a classificação calculada dividindo a média das avaliações por 2.

### Classe `Serie`:
- Representa uma série de TV e estende a classe `Titulo`.
- Além dos atributos herdados, inclui informações adicionais, como o número de temporadas, se está ativa, o número de episódios por temporada e a duração dos episódios.
- Sobrescreve o método `getDuracaoEmMinutos()` para calcular a duração total da série com base no número de temporadas, episódios por temporada e duração dos episódios.

### Classe `Episodio`:
- Representa um episódio de uma série.
- Implementa a interface `Classificavel` e fornece uma classificação com base no número total de visualizações.
- O método `getClassificacao()` retorna uma classificação específica dependendo do número total de visualizações do episódio.

### Pacote `screenmovie.calculation`:
- Contém classes relacionadas a cálculos e filtros relacionados aos títulos de filmes e séries.
- Inclui a interface `Classificavel` e as classes `FiltroRecomendacao` e `TimeCalculator`.

### Interface `Classificavel`:
- Define o contrato para objetos que podem ser classificados.
- Possui um único método `getClassificacao()`, que retorna a classificação do objeto.

### Classe `FiltroRecomendacao`:
- Responsável por aplicar filtros e fornecer recomendações com base na classificação de um objeto `Classificavel`.
- Possui um método `filtro()` que recebe um objeto `Classificavel` como argumento e imprime uma recomendação com base na sua classificação.

### Classe `TimeCalculator`:
- Realiza cálculos relacionados ao tempo total de reprodução de filmes e séries.
- Possui um atributo `tempoTotal` que armazena a soma do tempo de duração de todos os títulos adicionados.
- Inclui métodos `inclui()` para adicionar filmes e títulos à soma total do tempo de reprodução.

## 🚀 Tecnologias
<div>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java" title="Java" width="40" height="40"/>
</div>

## 💼 Linkedin
### link: [Francisco Hélio](https://www.linkedin.com/in/francisco-helio/)
