/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.prob1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author michael
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private TextField nameTf;
    @FXML
    private TextField streetTf;
    @FXML
    private TextField cityTf;
    @FXML
    private TextField stateTf;
    @FXML
    private TextField zipTf;
    @FXML
    private Button submitBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleSubmitBth(MouseEvent event) {
        System.out.println(nameTf.getText());
        System.out.println(streetTf.getText());
        System.out.println(cityTf.getText() + "," +  stateTf.getText() + " " + zipTf.getText());
    }
    
}
