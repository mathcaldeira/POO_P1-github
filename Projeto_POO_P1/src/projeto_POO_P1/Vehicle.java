package projeto_POO_P1;

import java.util.Random;

public class Vehicle {

    protected int linha, coluna, type, direction, speed;    
    protected String color;

    public Vehicle(int linha, int coluna, String color, int type, int speed, int direction) {
        this.linha = linha;
        this.coluna = coluna;
        this.color = color;
        this.type = type;
        this.speed = speed;
        this.direction = direction;
    }
    
    Random random = new Random();
    
    void changeDirection(){
        direction = random.nextInt(4);
    }

    void move() {
        switch (direction) {
            case 0:
                moveUp();
                break;
            case 1:
                moveDown();
                break;
            case 2:
                moveLeft();
                break;
            case 3:
                moveRight();
                break;
        }
    }

    void moveUp() {
        if (linha == 1){
            linha = 28;
        }
        else {
            linha -= 1;
        }
    }

    void moveDown() {
        if (linha == 28){
            linha = 1;
        }
        else {
            linha +=1;
        }
    }
    
    void moveRight() {
        if (coluna == 58){
            coluna = 1;
        }
        else {
            coluna += 1;
        }
    }
    
    void moveLeft() {
        if (coluna == 1){
            coluna = 58; 
        }
        else {
            coluna -= 1;
        }
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }
    
    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getType() {
        return type;
    }

    
}
