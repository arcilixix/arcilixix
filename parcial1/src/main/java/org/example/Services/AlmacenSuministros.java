package org.example.Services;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.example.Model.Recursos;


import java.util.Random;

public class AlmacenSuministros {

    private Bag<Recursos> almacen = new HashBag<>();
    Random random = new Random();

    public AlmacenSuministros(){
        for (Recursos r : Recursos.values()){
            almacen.add(r, random.nextInt(50));
        }
    }

    public void aumentarRecursos(){
        for (Recursos r : Recursos.values()){
            almacen.add(r, random.nextInt(10));
        }
    }

    @Override
    public String toString() {
        return "AlmacenSuministros " + "almacen=" + almacen + '}';
    }
}
