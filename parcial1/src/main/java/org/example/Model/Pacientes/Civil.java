package org.example.Model.Pacientes;

import java.util.UUID;

public class Civil extends Paciente {
    private final int cambioInfeccion;
    private final int cambioSalud;

    public Civil(UUID Id, int nivelInfeccion, int nivelSalud, String genoma) {
        super(Id, nivelInfeccion, nivelSalud, genoma);
        cambioInfeccion = 10;
        cambioSalud = -15;
    }

    @Override
    public void Curar() {

    }

    @Override
    public void Degradar(int cambioInfeccion, int cambioSalud) {

    }
}
