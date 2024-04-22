package com.adr.polimorfismo.models;

import java.util.ArrayList;

public interface IAlumnos {
    boolean save(Etudiante newStudent);
    boolean upDate(Etudiante editedStudent);
    ArrayList<Etudiante> getStudent();
}