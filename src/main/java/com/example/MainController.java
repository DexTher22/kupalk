package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField heightField;

    @FXML
    private TextField radiusField;

    @FXML
    private TextField volumeField;

    @FXML
    void onClickCalculateBtn(ActionEvent event) {
        startCalc();
    }

    void startCalc() {
        double radius = Double.parseDouble(radiusField.getText());
        double height = Double.parseDouble(heightField.getText());
        Cone cone = new Cone();
        Double volume = cone.calcVolume(radius, height);
        volumeField.setText(volume.toString());
    }

}
