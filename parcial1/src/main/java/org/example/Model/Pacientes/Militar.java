package org.example.Model.Pacientes;

import java.util.UUID;

public class Militar extends Paciente{
    private final int cambioInfeccion;
    private final int cambioSalud;

    public Militar(int nivelInfeccion, int nivelSalud, String genoma){
        super(nivelInfeccion, nivelSalud, genoma);
        cambioInfeccion = 7;
        cambioSalud = -10;
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
