package ar.org.centro8.java.curso.interfaces;

import java.util.ArrayList;

import ar.org.centro8.java.curso.entidades.relaciones.herencia.Vehiculo;

public interface IVehiculo {

    public abstract void buscarMasCaro(ArrayList<Vehiculo> listaVehiculos);

    public abstract void buscarMasBarato(ArrayList<Vehiculo> listaVehiculos);

    public abstract void buscarPorLetra(ArrayList<Vehiculo> listaVehiculos, String letra);
    
    public abstract void buscarPorPrecioAsc(ArrayList<Vehiculo> listaVehiculos);
    
    public abstract void buscarOrdenAlfabetico(ArrayList<Vehiculo> listaVehiculos);
}