package com.alatoo.bmicalculator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.awt.event.ActionEvent;
import java.math.MathContext;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextField height;

    @FXML
    private Text result;

    @FXML
    private TextField weight;

    @FXML
    private Label welcomeText;

    @FXML
    private ChoiceBox<String> mSystem;


    void calculateBMI() {
        try {
            String system = mSystem.getValue();
            double iheight = Double.parseDouble(height.getText());
            double iweight = Double.parseDouble(weight.getText());
            double index = 0;

            if (system.equals("Metric")) {
                // Metric: height in cm and weight in kg
                iheight = iheight / 100; // convert height from cm to meters
                index = iweight / (iheight * iheight);
            } else if (system.equals("English")) {
                // English: height in inches and weight in pounds
                index = (iweight / (iheight * iheight)) * 703;
            }

            // Determine the BMI category
            if (index < 18.5) {
                result.setText("Underweight");
            } else if (index >= 18.5 && index < 24.9) {
                result.setText("Normal");
            } else if (index >= 24.9 && index < 29.9) {
                result.setText("Overweight");
            } else {
                result.setText("Obese");
            }
        } catch (NumberFormatException e) { //Error case
            result.setText("Invalid data");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Add two metric systems in ChoiceBox
        mSystem.getItems().addAll("Metric", "English");
        mSystem.setValue("Metric"); // Set default value to Metric

        // Add listeners to recalculate BMI whenever inputs change
        height.textProperty().addListener((observable, oldValue, newValue) -> calculateBMI());
        weight.textProperty().addListener((observable, oldValue, newValue) -> calculateBMI());
        mSystem.valueProperty().addListener((observable, oldValue, newValue) -> calculateBMI());
    }
}
