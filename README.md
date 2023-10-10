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

