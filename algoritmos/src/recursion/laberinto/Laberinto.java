package recursion.laberinto;

public class Laberinto {
    private char[][] mapa;
    public Laberinto(char[][] mapa) {
        this.mapa = mapa;
    }

    public boolean resolver() {
        return resolver(0, 0);
    }

    public boolean resolver(int fila, int col) {
        this.imprimir();

        // Revisar los limites del mapa
        if (col < 0 || fila < 0 || fila >= this.mapa.length || col >= this.mapa[fila].length) {
            return false;
        }

        // Caso base: Llegue al destino
        if (mapa[fila][col] == '@') {
            return true;
        }

        // Esta celda es una pared
        if (mapa[fila][col] == 'x') {
            return false;
        }

        // Esta celda ya fue visitada antes
        if (mapa[fila][col] == '.') {
            return false;
        }

        // Marco la celda como visitada
        mapa[fila][col] = '.';

        // Caso recursivo: Hago los movimientos
        if (resolver(fila, col + 1)) {
            return true;
        }

        if (resolver(fila + 1, col)) {
            return true;
        }

        if (resolver(fila, col - 1)) {
            return true;
        }

        if (resolver(fila - 1, col)) {
            return true;
        }

        // Ocurre la vuelta atras
        mapa[fila][col] = '#';
        return false;
    }

    public void imprimir() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < this.mapa.length; i++) {
            for (int j = 0; j < this.mapa[i].length; j++) {
                sb.append(this.mapa[i][j] + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
