/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualcrlogin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author AHMED EeSha
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ImageView shutdown,minus;
    private AnchorPane home;
    
    
    @FXML
    private void handleButtonAction(MouseEvent event) {
        if(event.getTarget()==shutdown){
            home.setVisible(false);
        }
        else if(event.getTarget()==minus){
            home.setVisible(false);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
