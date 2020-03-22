/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swift.download.manager.controllers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author DELL
 */
public class SwiftDashboardController implements Initializable {

    @FXML
    private JFXButton addUrlBtn;
    @FXML
    private JFXButton resumeBtn;
    @FXML
    private JFXButton stopBtn;
    @FXML
    private JFXButton refreshBtn;
    @FXML
    private JFXButton deleteBtn;
    @FXML
    private JFXButton optionsBtn;
    @FXML
    private StackPane addUrlPane;
    @FXML
    private JFXButton cancelBtn;
    @FXML
    private JFXButton submitUrl;
    @FXML
    private JFXButton resumeBtn1;
    @FXML
    private AnchorPane homePane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cancelBtn.setOnAction((ActionEvent event) -> {
            FadeTransition fade = new FadeTransition();
            fade.setDuration(Duration.millis(300));
            fade.setNode(addUrlPane);
            fade.setFromValue(1);
            fade.setToValue(0);
            fade.play();
            fade.setOnFinished((ActionEvent event1) -> {
                addUrlPane.setVisible(false);
            });
        });
    }    

    @FXML
    private void openAddUrl(MouseEvent event) {
        addUrlPane.setVisible(true);
        FadeTransition fade = new FadeTransition();
        fade.setDuration(Duration.millis(300));
        fade.setNode(addUrlPane);
        fade.setFromValue(0);
        fade.setToValue(1);
        fade.play();
    }
    
}
