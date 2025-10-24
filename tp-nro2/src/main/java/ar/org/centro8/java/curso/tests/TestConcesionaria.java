package ar.org.centro8.java.curso.tests;

import java.util.ArrayList;

import ar.org.centro8.java.curso.entidades.relaciones.Auto;
import ar.org.centro8.java.curso.entidades.relaciones.Moto;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.Vehiculo;
import ar.org.centro8.java.curso.interfaces.implementaciones.ListaVehiculo;

public class TestConcesionaria {
    public static void main(String[] args) {
    // Los objetos
    Auto auto1 = new Auto("Peugeot", "206", "4", 200000);
    Moto moto1 = new Moto("Honda", "Titan", "125c", 60000);
    Auto auto2 = new Auto("Peugeot", "208", "5", 250000);
    Moto moto2 = new Moto("Yamaha", "YBR", "160c", 80500.50);

    ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

    // Agregar objetos a la lista
    listaVehiculos.add(auto1);
    listaVehiculos.add(moto1);
    listaVehiculos.add(auto2);
    listaVehiculos.add(moto2);
    
    ListaVehiculo concesionaria = new ListaVehiculo();

    // Imprimir por consola
    // Lista de vehículos
    concesionaria.imprimirLista(listaVehiculos);
    
    concesionaria.imprimirSeparador();

    concesionaria.buscarMasCaro(listaVehiculos);
    concesionaria.buscarMasBarato(listaVehiculos);
    concesionaria.buscarPorLetra(listaVehiculos, "Y");

    concesionaria.imprimirSeparador();

    concesionaria.buscarPorPrecioAsc(listaVehiculos);

    concesionaria.imprimirSeparador();

    concesionaria.buscarOrdenAlfabetico(listaVehiculos);
    }
}