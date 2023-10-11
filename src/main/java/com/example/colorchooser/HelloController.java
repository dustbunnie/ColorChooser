package com.example.colorchooser;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class HelloController {

    @FXML
    private TextField redTextField;
    @FXML
    private TextField blueTextField;
    @FXML
    private TextField greenTextField;
    @FXML
    private TextField alphaTextField;

    @FXML
    private Slider redSlider;

    @FXML
    private Slider greenSlider;
    @FXML
    private Slider blueSlider;
    @FXML
    private Slider alphaSlider;

    @FXML
    private Rectangle Rectangle;

    @FXML
    protected void redSliderDragged() {
        double value = redSlider.getValue();
        redTextField.setText(String.valueOf(value));

        Color c = Color.rgb((int)value, (int)greenSlider.getValue(), (int)blueSlider.getValue() );

        Rectangle.setFill(c);


    }

    @FXML
    protected void greenSliderDragged() {

        double value = greenSlider.getValue();
        greenTextField.setText(String.valueOf(value));

        Color c = Color.rgb((int)redSlider.getValue(), (int)greenSlider.getValue(), (int)blueSlider.getValue() );

        Rectangle.setFill(c);

    }

    @FXML
    protected void blueSliderDragged() {

        double value = blueSlider.getValue();
        blueTextField.setText(String.valueOf(value));

        Color c = Color.rgb((int)redSlider.getValue(), (int)greenSlider.getValue(), (int)blueSlider.getValue() );

        Rectangle.setFill(c);

    }
    @FXML
    protected void alphaSliderDragged() {

        double value = alphaSlider.getValue();
        alphaTextField.setText(String.valueOf(value));

       Rectangle.setOpacity(alphaSlider.getValue());

    }
}