package org.example.Services;

import org.example.Model.Pacientes.Paciente;

import java.util.LinkedList;
import java.util.Queue;

public class UCI {
    private Queue<Paciente> colaUCI;

    public UCI(){
        colaUCI = new LinkedList<>();
    }

    public void ingresarPaciente(Paciente P){
        colaUCI.add(P);
    }
    public Queue<Paciente> getColaUCI(){
        return colaUCI;
    }
}
