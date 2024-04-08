package practicasClase;

public class ArrayBi {
    public static void main(String[] args) {

        // construir un array de 10 array de 3 String
        // un array de tres String:

        String[] español = { "perro", "gato", "casa", "coche", "arbol" };
        String[] ingles = { "dog", "cat", "house", "car", "tree" };
        String[] rumano = { "caine", "pisica", "casa", "masina", "pom" };

        String[][] arrayIdiomas = new String[5][3];// solo lo he declarado
        // cada array de String va a ser un lenguaje (columna : ingles 0, esoañol
        // 1,rumano 2)
        // cada array va aser un cojunto de palabras
        // la composisicion va a ser la trtadcuccion de la misma oalaba en su idioma

        // 10 palabras:
        // perro ,gato,casa,coche,arbol
        // caine,pisica,casa,masina,pom

        for (int i = 0; i < arrayIdiomas.length; i++) {
            for (int x = 0; x < arrayIdiomas[i].length; x++) {
                if (x == 0) {
                    arrayIdiomas[i][x] = ingles[i];
                } else if (x == 1) {
                    arrayIdiomas[i][x] = español[i];
                } else {
                    arrayIdiomas[i][x] = rumano[i];

                }

            }
        }
        for (int i = 0; i < arrayIdiomas.length; i++) {
            for (int x = 0; x < arrayIdiomas[i].length; x++) {
                System.out.print(arrayIdiomas[i][x]+"\t");
            }
            System.out.println();
        }
    }
}
