module com.alatoo.bmicalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.alatoo.bmicalculator to javafx.fxml;
    exports com.alatoo.bmicalculator;
}