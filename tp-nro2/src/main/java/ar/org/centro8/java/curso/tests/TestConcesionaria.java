package ar.org.centro8.java.curso.tests;

import java.util.ArrayList;

import ar.org.centro8.java.curso.entidades.relaciones.Auto;
import ar.org.centro8.java.curso.entidades.relaciones.Moto;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.Vehiculo;

public class TestConcesionaria {
    public static void main(String[] args) {
    Auto auto1 = new Auto("Peugeot", "206", "4", 200000);
    Moto moto1 = new Moto("Honda", "Titan", "125c", 60000);
    Auto auto2 = new Auto("Peugeot", "208", "5", 250000);
    Moto moto2 = new Moto("Yamaha", "YBR", "160c", 80500.50);

    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    listaVehiculos.add(auto1);
    listaVehiculos.add(moto1);
    listaVehiculos.add(auto2);
    listaVehiculos.add(moto2);
    
    System.out.println(listaVehiculos); // Lista de vehículos

    System.out.println("\n" + "=".repeat(29)+ "\n");

    System.out.println("Vehículo más caro: "); // 
    System.out.println("Vehículo más barato: ");
    System.out.println("Vehículo que contiene en el modelo la letra 'Y': ");

    System.out.println("\n" + "=".repeat(29)+ "\n");

    System.out.println("Vehículos ordenados por precio de mayor a menor: ");

    System.out.println("\n" + "=".repeat(29)+ "\n");

    System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio): ");

    }
}
