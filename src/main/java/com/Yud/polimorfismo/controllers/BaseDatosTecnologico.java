package com.adr.polimorfismo.controllers;

import com.adr.polimorfismo.App;
import com.adr.polimorfismo.models.Etudiante;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class BaseDatosTecnologico {
    @FXML
    private TableView<Etudiante> studentsTable;

    @FXML
    private TableColumn matriculaColumn;

    @FXML
    private TableColumn nombreColumn;

    @FXML
    void onMouseClickedCerrar(MouseEvent event) {
        App.getStageView().close();
    }
    private ObservableList<Etudiante> students;
    @FXML
    void initialize() {
        students = FXCollections.observableArrayList();
        ArrayList<Etudiante> estudiantes;
        estudiantes = App.getBases().getStudentBase1();
        this.matriculaColumn.setCellValueFactory(new PropertyValueFactory("matricula"));
        this.nombreColumn.setCellValueFactory(new PropertyValueFactory("nombre"));
        for (int i = 0; i < estudiantes.size(); i++) {
            students.add(estudiantes.get(i));
        }
        studentsTable.setItems(students);
    }

}
