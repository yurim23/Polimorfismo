module com.adr.polimorfismo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.Yud.polimorfismo.models to javafx.base;
    opens com.Yud.polimorfismo to javafx.fxml;
    exports com.Yud.polimorfismo.models;
    exports com.Yud.polimorfismo.controllers;
    opens com.Yud.polimorfismo.controllers to javafx.fxml;
}