package com.adr.polimorfismo.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class App {

    @FXML
    private Button addButton;

    @FXML
    private Button base1;

    @FXML
    private Button base2;

    @FXML
    private Button base3;

    @FXML
    private Button closeButton;

    @FXML
    private Button updataButton;

    @FXML
    void onMouseClickedBase1(MouseEvent event) {
        com.adr.polimorfismo.App.newStage("Up-view", "Base Up");
    }

    @FXML
    void onMouseClickedBase2(MouseEvent event) {
        com.adr.polimorfismo.App.newStage("Tecnologico-view", "Base Tecnologico ");
    }

    @FXML
    void onMouseClickedBase3(MouseEvent event) {
        com.adr.polimorfismo.App.newStage("Unach-view", "Base Unach");
    }

    @FXML
    void onMouseClickedAñadir(MouseEvent event) {
        com.adr.polimorfismo.App.newStage("añadit-view", "Añadir");
    }

    @FXML
    void onMouseClickedUpdata(MouseEvent event) {
        com.adr.polimorfismo.App.newStage("actualizar-view", "Actualizar");
    }

    @FXML
    void onMouseClickedCerrar(MouseEvent event) {
        Platform.exit();
    }
}
