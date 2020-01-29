package com.rami.lajmi;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //List<Car> cars= new ArrayList<Car>();

        // Point du démarrage du bateau
        BoardPlot ptToulouse = new BoardPlot(2,2);
        // Création Bateau
        Ship Toulouse = new Ship("Toulouse", ptToulouse, 3, Direction.EAST);


        System.out.println("-- Démarrage du jeu --");

        System.out.println(Toulouse.toString());

    }
}
