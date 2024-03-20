/*

Definir en el mapa:
    - Pared -> 'x'
    - Camino libre -> 'o'
    - Punto destino -> '@'
    - Celda visitada -> '.'
 */
package recursion.laberinto;

public class Main {
    public static void main(String[] args) {
        char[][] matriz = {
                {'o', 'o', 'o', 'o', 'o', 'o', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x'},
                {'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'o', 'x'},
                {'o', 'o', 'o', 'o', 'o', 'x', 'o', 'o', 'o', 'o', 'x', 'o', 'o', 'o', 'o'},
                {'o', 'x', 'x', 'x', 'x', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o'},
                {'o', 'o', 'o', 'o', 'o', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'o'},
                {'o', 'o', 'o', 'o', 'o', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'o'},
                {'o', 'o', 'o', 'o', 'o', 'x', 'o', 'x', 'o', 'o', 'o', 'o', 'o', 'x', 'o'},
                {'o', 'o', 'o', 'o', 'o', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x', 'o'},
                {'o', 'o', 'x', 'o', 'o', 'x', 'o', 'x', 'x', 'o', 'x', 'o', 'o', 'x', 'o'},
                {'o', 'o', 'x', 'o', 'o', 'x', 'o', 'x', 'x', 'o', 'x', 'o', 'o', 'x', 'o'},
                {'o', 'o', 'o', 'o', 'o', 'x', 'o', 'x', 'x', 'x', 'x', 'o', 'o', 'x', 'o'},
                {'o', 'o', 'x', 'o', 'o', 'x', 'o', 'x', 'x', 'x', 'x', 'o', 'o', 'x', 'o'},
                {'o', 'o', 'x', 'o', 'o', 'x', 'o', 'x', 'x', 'x', 'x', 'o', 'o', 'o', 'o'},
                {'o', 'o', 'x', 'o', 'o', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'o', 'o'},
                {'o', 'o', 'x', 'o', 'o', 'x', 'o', 'x', 'x', 'x', 'x', 'x', 'o', 'o', '@'},
                {'o', 'o', 'x', 'o', 'o', 'x', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'o'},
                {'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'},
                {'o', 'o', 'o', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'x', 'o', 'o'},
                {'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o'},
                {'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'o', 'x', 'x', 'x', 'x', 'x', 'o'}
        };

        Laberinto laberinto = new Laberinto(matriz);
        laberinto.resolver();
    }
}
