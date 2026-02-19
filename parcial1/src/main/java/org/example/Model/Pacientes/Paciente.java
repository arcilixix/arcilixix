package org.example.Model.Pacientes;

import java.util.UUID;

public abstract class Paciente {
    UUID ID;
    int NivelInfeccion;
    int NivelSalud;
    String Genoma;

    public Paciente(UUID Id, int nivelInfeccion, int nivelSalud, String genoma){
        ID = Id;
        NivelInfeccion = nivelInfeccion;
        NivelSalud = nivelSalud;
        Genoma = genoma;
    }
    public abstract void Degradar(int cambioInfeccion, int cambioSalud);
    public abstract void Curar();
}
