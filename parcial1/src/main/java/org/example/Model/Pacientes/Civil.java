package org.example.Model.Pacientes;

import java.util.UUID;

public class Civil extends Paciente {
    private final int cambioInfeccion;
    private final int cambioSalud;

    public Civil(int nivelInfeccion, int nivelSalud, String genoma) {
        super(nivelInfeccion, nivelSalud, genoma);
        cambioInfeccion = 10;
        cambioSalud = -15;
    }

    @Override
    public void Curar() {

    }

    @Override
    public void Degradar() {
        if(NivelSalud + cambioSalud > 0){
            NivelSalud += cambioSalud;
        }
        else{
            isMuerto = true;
        }
        NivelInfeccion += cambioInfeccion;
    }
}
