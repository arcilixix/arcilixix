package org.example.Model.Pacientes;

import java.util.UUID;

public class Militar extends Paciente{
    private final int cambioInfeccion;
    private final int cambioSalud;

    public Militar(UUID Id, int nivelInfeccion, int nivelSalud, String genoma){
        super(Id, nivelInfeccion, nivelSalud, genoma);
        cambioInfeccion = 7;
        cambioSalud = -10;
    }

    @Override
    public void Degradar(int cambioInfeccion, int cambioSalud) {

    }

    @Override
    public void Curar() {

    }
}
