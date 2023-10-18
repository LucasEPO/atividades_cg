# atividades_cg

Pasta para armazenar as atividades do Curso de Computação Gráfica 2023/2

---
## Atividade01
Seguindo os passos da seção 2 do [artigo](https://raytracing.github.io/books/RayTracingInOneWeekend.html#outputanimage/theppmimageformat)

Optei por fazer em Java, e nele criei uma função main que gerenia as instancias dos objetos da classe MyImage.
A classe MyImage pode ser vista com mais detalhes no **javadoc**

Em resumo ela cria um objeto com largura, altura, nome e tipo.
E funções nela podem salvar imagem como **generateImage()**, **generateShapesPPM()**, **generateShapesPNG()**, a primeira gera a imagem degrade que está como exemplo no artigo,
já as outras duas funções criam ou um quadrado um uma imagem com listras na cor que quiser, podendo gerar arquivos .ppm ou .png.
Arquivos .png podem ser abertos se instanciados com o nome e tipos corretos chamando a função **openImage()**

---
## Atividade02
Seguindo os passos da seção 3 do [artigo](https://raytracing.github.io/books/RayTracingInOneWeekend.html#outputanimage/theppmimageformat)

*As classes podem ser vistas com mais detalhes no **javadoc**
A classe desenvolvda na Atividade 01 foi reaproveitada com mudanca na utilização das cores.

Foi desenvolvida as classes para trabalha com vetores de tamanho 2, 3 e 4, e uma classe para manuseio de cores.
Então no projeto da atividade02, é possivel criar vetores e realizar operações simples com ele, e para inserção de cores é possível criar uma a partir de seu valor hexadecimal, no intervalo [0, 1] e no intervalo [0, 256].
Também foram adicionados classes de testes unitários utilizando o JUnit.

A ser realizado nessa atividade classes para operações de matrizes;
Ver possibilidade de usar apenas 1 classe para vetor e 1 para matriz, usando conceitos de poo para trabalhar com os diferentes tamanhos solicitados.
