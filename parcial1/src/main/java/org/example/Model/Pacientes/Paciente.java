package org.example.Model.Pacientes;

import java.util.UUID;

public abstract class Paciente {
    int ID;
    int NivelInfeccion;
    int NivelSalud;
    String Genoma;
    boolean isMuerto;
    public static int totalPacientes;

    public Paciente(int nivelInfeccion, int nivelSalud, String genoma){
        ID = ++totalPacientes;
        NivelInfeccion = nivelInfeccion;
        NivelSalud = nivelSalud;
        Genoma = genoma;
        isMuerto = false;
    }
    public abstract void Degradar();
    public abstract void Curar();
}
