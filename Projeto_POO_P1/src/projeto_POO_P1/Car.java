package projeto_POO_P1;

public class Car extends Vehicle{    
    public Car(int linha, int coluna, int direction) {
        super(linha, coluna, "\u001B[41m", 13, 2, direction);//vermelho
    }
    
}
