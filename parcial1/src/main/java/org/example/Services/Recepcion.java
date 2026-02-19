package org.example.Services;
import org.example.Model.Pacientes.Paciente;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class Recepcion {
    private String RutaArchivo;
    File archivo;
    private List<Paciente> pacientes;

    public Recepcion(String rutaArchivo){
        RutaArchivo = rutaArchivo;
        archivo = new File(RutaArchivo);
    }


    private List<Paciente> obtenerPacientes(File archivo){




        return
    }

}
