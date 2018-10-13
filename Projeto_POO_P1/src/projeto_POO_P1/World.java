package projeto_POO_P1;

import java.util.ArrayList;
import java.util.Random;
import java.io.IOException;

/**
 *
 * @author mathe
 */
public class World {

    /**
     *
     * @throws InterruptedException
     * @throws IOException
     */
    public World() throws InterruptedException, IOException {
        ArrayList<Bike> bikes = new ArrayList();
        ArrayList<Moto> motos = new ArrayList();
        ArrayList<Car> cars = new ArrayList();
        ArrayList<Truck> trucks = new ArrayList();
        
        Random random = new Random();
        //Cria 10 veiculos de cada tipo nos ArrayList
        for (int i = 0; i < 10; i++) {
            bikes.add(new Bike((random.nextInt(28)+ 1), (random.nextInt(58)+ 1), random.nextInt(4)));
            motos.add(new Moto((random.nextInt(28)+ 1), (random.nextInt(58)+ 1), random.nextInt(4)));
            cars.add(new Car((random.nextInt(28)+ 1), (random.nextInt(58)+ 1), random.nextInt(4)));
            trucks.add(new Truck((random.nextInt(28)+ 1), (random.nextInt(58)+ 1), random.nextInt(4)));
        }
        boolean run = true;
        //Inicia loop
        while (run == true) {
            int[][] map = {
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,55,55,55,55,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            };
            
            //desenha veiculos no mapa
            for (int i = 0; i < bikes.size(); i++) {
                map[bikes.get(i).getLinha()][bikes.get(i).getColuna()] += bikes.get(i).getType();
            }
            for (int i = 0; i < motos.size(); i++) {
                map[motos.get(i).getLinha()][motos.get(i).getColuna()] += motos.get(i).getType();
            }
            for (int i = 0; i < cars.size(); i++) {
                map[cars.get(i).getLinha()][cars.get(i).getColuna()] += cars.get(i).getType();
            }
            for (int i = 0; i < trucks.size(); i++) {
                map[trucks.get(i).getLinha()][trucks.get(i).getColuna()] += trucks.get(i).getType();
            }

            //colisoes
            for (int i = 0; i < 30; i++) {
                for (int j = 0; j < 60; j++) {
                    //truck x car
                    if (map[i][j] == 33) {
                        map[i][j] = trucks.get(0).getType();
                        for (int k = 0; k < cars.size(); k++) {
                            if (cars.get(k).getLinha() == i && cars.get(k).getColuna() == j) {
                                cars.remove(k);
                            }
                        }
                    }
                    //truck x moto
                    if (map[i][j] == 25) {
                        map[i][j] = trucks.get(0).getType();
                        for (int k = 0; k < motos.size(); k++) {
                            if (motos.get(k).getLinha() == i && motos.get(k).getColuna() == j) {
                                motos.remove(k);
                            }
                        }
                    }
                    //truck x bike
                    if (map[i][j] == 22) {
                        map[i][j] = trucks.get(0).getType();
                        for (int k = 0; k < bikes.size(); k++) {
                            if (bikes.get(k).getLinha() == i && bikes.get(k).getColuna() == j) {
                                bikes.remove(k);
                            }
                        }
                    }
                    //car x moto
                    if (map[i][j] == 18) {
                        map[i][j] = cars.get(0).getType();
                        for (int k = 0; k < motos.size(); k++) {
                            if (motos.get(k).getLinha() == i && motos.get(k).getColuna() == j) {
                                motos.remove(k);
                            }
                        }
                    }
                    //car x bike
                    if (map[i][j] == 15) {
                        map[i][j] = cars.get(0).getType();
                        for (int k = 0; k < bikes.size(); k++) {
                            if (bikes.get(k).getLinha() == i && bikes.get(k).getColuna() == j) {
                                bikes.remove(k);
                            }
                        }
                    }
                    //moto x bike
                    if (map[i][j] == 7) {
                        map[i][j] = motos.get(0).getType();
                        for (int k = 0; k < bikes.size(); k++) {
                            if (bikes.get(k).getLinha() == i && bikes.get(k).getColuna() == j) {
                                bikes.remove(k);
                            }
                        }
                    }
                    //truck x truck
                    if (map[i][j] == 40) {
                        map[i][j] = 0;
                        for (int k = 0; k < trucks.size(); k++) {
                            if (trucks.get(k).getLinha() == i && trucks.get(k).getColuna() == j) {
                                trucks.remove(k);
                            }
                        }
                    }
                    //car x car
                    if (map[i][j] == 26) {
                        map[i][j] = 0;
                        for (int k = 0; k < cars.size(); k++) {
                            if (cars.get(k).getLinha() == i && cars.get(k).getColuna() == j) {
                                cars.remove(k);
                            }
                        }
                    }
                    //moto x moto
                    if (map[i][j] == 10) {
                        map[i][j] = 0;
                        for (int k = 0; k < motos.size(); k++) {
                            if (motos.get(k).getLinha() == i && motos.get(k).getColuna() == j) {
                                motos.remove(k);
                            }
                        }
                    }
                    //bike x bike
                    if (map[i][j] == 4) {
                        map[i][j] = 0;
                        for (int k = 0; k < bikes.size(); k++) {
                            if (bikes.get(k).getLinha() == i && bikes.get(k).getColuna() == j) {
                                bikes.remove(k);
                            }
                        }
                    }
                    //bike x fabrica
                    if (map[i][j] == 57) {
                        map[i][j] = 2;
                        bikes.add(new Bike((random.nextInt(28) + 1), (random.nextInt(58) + 1), random.nextInt(4)));
                    }
                    //moto x fabrica
                    if (map[i][j] == 60) {
                        map[i][j] = 3;
                        motos.add(new Moto((random.nextInt(28) + 1), (random.nextInt(58) + 1), random.nextInt(4)));
                    }
                    //carro x fabrica
                    if (map[i][j] == 68) {
                        map[i][j] = 8;
                        cars.add(new Car((random.nextInt(28) + 1), (random.nextInt(58) + 1), random.nextInt(4)));
                    }
                    //truck x fabrica
                    if (map[i][j] == 75) {
                        map[i][j] = 12;
                        trucks.add(new Truck((random.nextInt(28) + 1), (random.nextInt(58) + 1), random.nextInt(4)));
                    }
                }
            }
            
            //cores
            String reset = "\u001B[0m";            
            String purple = "\u001B[45m";
            String white = "\u001B[47m";
            
            //atribuindo cores a cada tipo de veiculo
            // 20: truck; 13: car; 5: moto; 2: bike; 1: borda; 0: background;
            for (int i = 0;i < 30; i++) {
                System.out.println("");
                for (int j = 0; j < 60; j++) {
                    switch (map[i][j]) {
                        case 0:
                            System.out.print(purple + " " + reset);
                            break;                    
                        case 1:
                            System.out.print(white + " " + reset);
                            break;
                        case 2:
                            System.out.print(bikes.get(0).color + " " + reset);
                            break;
                        case 5:
                            System.out.print(motos.get(0).color + " " + reset);
                            break;
                        case 13:
                            System.out.print(cars.get(0).color + " " + reset);
                            break;
                        case 20:
                            System.out.print(trucks.get(0).color + " " + reset);
                            break;
                        case 55:
                            System.out.print(white + " " + reset);
                            break;                        
                    }
                }
            }

            //numero atual de veiculos
            System.out.println("");
            System.out.println("Bicicletas: " + bikes.size() + ";");
            System.out.println("Motos: " + motos.size() + ";");
            System.out.println("Carros: " + cars.size() + ";");
            System.out.println("Caminhoes: " + trucks.size() + ";");
            
            int contBike = 0;//contador para bike ficar uma iteracao parada
            //movimenta e depois muda direcao aleatoriamente
            for (int i = 0; i < trucks.size(); i++) {
                for (int j=0; j< trucks.get(i).getSpeed(); j++)
                trucks.get(i).move();
                
            trucks.get(i).changeDirection();
            }
            
            for (int i = 0; i < cars.size(); i++) {
                for (int j=0; j< cars.get(i).getSpeed(); j++)
                cars.get(i).move();
                
            cars.get(i).changeDirection();
            }
            
            for (int i = 0; i < motos.size(); i++) {
                for (int j=0; j< motos.get(i).getSpeed(); j++)
                motos.get(i).move();
                
            motos.get(i).changeDirection();
            }
            
            if ((contBike % 2) == 0) {
                for (int i = 0; i < bikes.size(); i++) {
                    bikes.get(i).move();
                    bikes.get(i).changeDirection();
                }
            }
            contBike += 1;
            clear();
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){}
        }
    }

    /**
     *
     */
    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();       
    }

}
