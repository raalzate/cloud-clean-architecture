## Caso de Uso - N1
### Problema de refactorización y buenas prácticas

El siguiente proyecto esta considerado para realizar una refactorización al proyecto, buscando alinear la solución a la mejor práctica posible.

### Descripción

Se tiene un único método **CompressPDF.reduce(byte[], Long):byte[]**  que permite reducir el tamaño de un documento tipo PDF, logrando comprimir las imágenes que tiene el documento y retornar el documento optimizado. 

#### Objetivo
Usar este UserCase permite evaluar el procesamiento de información, poniendo a prueba el rendimiento y el comportamiento de un comando o consumidor del caso.  

### Tests
```java
    @Test
    public void pdfMenorQue500kb() throws IOException {
        File file = new File("src/test/resources/pdfs/90001345.pdf");
        byte[] b = Files.readAllBytes(Paths.get(file.getPath()));
        assert b.length == CompressPDF.reduce(b, 500L).length;
    }

    @Test
    public void pdfMayorQue500kb() throws IOException {
        File file = new File("src/test/resources/pdfs/cedulaD.pdf");
        byte[] b = Files.readAllBytes(Paths.get(file.getPath()));
        assert CompressPDF.reduce(b, 500L).length < b.length;
    }

    @Test
    public void pdfAumentaTamanno() throws IOException {
        File file = new File("src/test/resources/pdfs/guia.pdf");
        byte[] b = Files.readAllBytes(Paths.get(file.getPath()));
        assert CompressPDF.reduce(b, 500L).length == b.length;
    }

    @Test
    public void pdfNull() throws IOException {
        Assert.assertTrue(null == CompressPDF.reduce(null, 500L));
    }


    @Test
    public void validarOrientacion() throws IOException {
        File file = new File("src/test/resources/pdfs/cedulaP.pdf");
        PDDocument document = PDDocument.load(file);
        PDPageTree allPages = document.getDocumentCatalog().getPages();

        for (PDPage page : allPages) {
            Assert.assertEquals("v", CompressPDF.getOrientacion(page));
        }
    }
```

## Código de honor 
Nos dedicamos a proteger la integridad de de lo que hacemos.
Todos los solvers deben hacer lo siguiente:

- Enviar su propio trabajo original
- Evita compartir respuestas con otras personas
- Informar supuestas infracciones