package ar.org.centro8.java.curso.interfaces;

import java.util.ArrayList;

import ar.org.centro8.java.curso.entidades.relaciones.herencia.Vehiculo;

public interface IVehiculo {

    void buscarMasCaro(ArrayList<Vehiculo> listaVehiculos);

    void buscarMasBarato(ArrayList<Vehiculo> listaVehiculos);

    void buscarPorPrecio(ArrayList<Vehiculo> listaVehiculos);
    
    void buscarPorLetra(ArrayList<Vehiculo> listaVehiculos, String letra);
    
    void buscarOrdenAlfabetico(ArrayList<Vehiculo> listaVehiculos);
}
