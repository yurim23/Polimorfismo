package com.Yud.polimorfismo.models;

import java.util.ArrayList;
import com.Yud.polimorfismo.models.Etudiante;

public class UP implements IAlumnos {
    private ArrayList<Etudiante> estudiantes = new ArrayList<>();
    @Override
    public boolean save(Etudiante newStudent) {
        return estudiantes.add(newStudent);
    }
    @Override
    public boolean upDate(Etudiante editedStudent) {
        boolean found=false;
        for (int i = 0; i < estudiantes.size(); i++){
            if (editedStudent.getMatricula() == estudiantes.get(i).getMatricula()){
                estudiantes.set(i, editedStudent);
                found=true;
                break;
            }
        }
        return found;
    }

    @Override
    public ArrayList<Etudiante> getStudent() {
        return estudiantes;
    }
}
