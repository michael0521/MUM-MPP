/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6.prob2;

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
    private Button countBtn;
    @FXML
    private TextField inputTf;
    @FXML
    private TextField outputTf;
    @FXML
    private Button reverseBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCountBtn(MouseEvent event) {
        outputTf.setText(String.valueOf(inputTf.getText().length()));
    }

    @FXML
    private void handleReverseBtn(MouseEvent event) {
        outputTf.setText(new StringBuilder(inputTf.getText()).reverse().toString());
    }
    
     @FXML
    private void handleRemoveBtn(MouseEvent event) {
        char[] chs = inputTf.getText().toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for(char c: chs){
            if(!sb.toString().contains(String.valueOf(c)))
                sb.append(c);
        }
        System.out.println(sb);
        outputTf.setText(sb.toString());
    }
    
}
