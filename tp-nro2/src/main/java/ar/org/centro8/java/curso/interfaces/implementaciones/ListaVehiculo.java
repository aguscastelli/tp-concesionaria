package ar.org.centro8.java.curso.interfaces.implementaciones;

import java.util.ArrayList;

import ar.org.centro8.java.curso.entidades.relaciones.herencia.Vehiculo;
import ar.org.centro8.java.curso.interfaces.IVehiculo;

public class ListaVehiculo implements IVehiculo{
    @Override
    public void buscarMasCaro(ArrayList<Vehiculo> listaVehiculos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void buscarMasBarato(ArrayList<Vehiculo> listaVehiculos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void buscarPorPrecio(ArrayList<Vehiculo> listaVehiculos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void buscarPorLetra(ArrayList<Vehiculo> listaVehiculos, String letra) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void buscarOrdenAlfabetico(ArrayList<Vehiculo> listaVehiculos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
