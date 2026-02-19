package org.example.Services;
import org.example.Model.Pacientes.Civil;
import org.example.Model.Pacientes.Medico;
import org.example.Model.Pacientes.Militar;
import org.example.Model.Pacientes.Paciente;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Recepcion {
    private String RutaArchivo;
    File archivo;
    FileReader reader;
    BufferedReader bfReader;
    private List<Paciente> pacientes;

    public Recepcion(String rutaArchivo){
        try{
            RutaArchivo = rutaArchivo;
            archivo = new File(RutaArchivo);
            reader = new FileReader(archivo);
            bfReader = new BufferedReader(reader);
            System.out.println("Working directory");
        } catch (Exception e) {
            throw new RuntimeException("Error al crear recepción" + e.getMessage());
        }
    }


    public List<Paciente> obtenerPacientes() {

        List<Paciente> pacientes = new ArrayList<>();

        try{

            String linea;

            while ((linea = bfReader.readLine()) != null) {

                linea = linea.replace(" ", "");

                String[] partes = linea.split(",");

                String tipo = partes[0].split("=")[1];
                int nivelInfeccion = Integer.parseInt(partes[1].split("=")[1]);
                int nivelSalud = Integer.parseInt(partes[2].split("=")[1]);
                String genoma = partes[3].split("=")[1];

                Paciente paciente = null;

                switch (tipo) {
                    case "Civil":
                        paciente = new Civil(nivelInfeccion, nivelSalud, genoma);
                        break;
                    case "Medico":
                        paciente = new Medico(nivelInfeccion, nivelSalud, genoma);
                        break;
                    case "Militar":
                        paciente = new Militar(nivelInfeccion, nivelSalud, genoma);
                        break;
                    default:
                        throw new IllegalArgumentException("Tipo desconocido: " + tipo);
                }

                pacientes.add(paciente);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return pacientes;
    }

}
