package org.example;

import org.example.Model.Pacientes.Paciente;
import org.example.Services.Recepcion;

import java.util.List;

public class Main {
    static void main() {
        try{
            Recepcion r = new Recepcion("src/main/java/org/example/Resources/entradaPacientes.txt");
            r.obtenerPacientes();
            System.out.println(r.getPacientes());
            List<Paciente> pacientes = r.getPacientes();
            for (Paciente p : pacientes){
                System.out.println(p.toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
    }
}
