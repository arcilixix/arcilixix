package org.example.Model.Pacientes;

import java.util.UUID;

public class Medico extends Paciente{
    private final int cambioInfeccion;
    private final int cambioSalud;

    public Medico(UUID Id, int nivelInfeccion, int nivelSalud, String genoma){
        super(Id, nivelInfeccion, nivelSalud, genoma);
        cambioInfeccion = 20;
        cambioSalud = -30;
    }

    @Override
    public void Curar() {

    }

    @Override
    public void Degradar(int cambioInfeccion, int cambioSalud) {

    }
}
