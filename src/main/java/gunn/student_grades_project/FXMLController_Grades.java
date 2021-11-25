package gunn.student_grades_project;
/*

Name; Gavin Gunn
Class; Grade 12 Com Studies
Date; 25/11/21
Assignment#; 2
Description; Create a 2D array based grade calculator
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.effect.Light;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

 

public class FXMLController_Grades implements Initializable {
//imports    
@FXML
    private AnchorPane APNL_MAIN;

    @FXML
    private Button BTN_ADD;

    @FXML
    private Button BTN_CAVG;

    @FXML
    private Button BTN_EXIT;

    @FXML
    private Button BTN_LIST;

    @FXML
    private Button BTN_SAVG;

    @FXML
    private Label LBL_NAME1;

    @FXML
    private Label LBL_NAME2;

    @FXML
    private Label LBL_TEST1;

    @FXML
    private Label LBL_TEST2;

    @FXML
    private Label LBL_TEST3;

    @FXML
    private Label LBL_TEST4;

    @FXML
    private Label LBL_TITLE;

    @FXML
    private TextArea TXTA_OUTPUT;

    @FXML
    private TextField TXTF_NAME1;

    @FXML
    private TextField TXTF_NAME2;

    @FXML
    private TextField TXTF_TEST1;

    @FXML
    private TextField TXTF_TEST2;

    @FXML
    private TextField TXTF_TEST3;

    @FXML
    private TextField TXTF_TEST4;   
    
    
    //Variables
    int numStudent = 0;
    
    
    
    
    
    double[ ][ ] Class = new double[5][14];
    
    void add() {
    
    }
    
    void logic() { 
       for (int i = 0; i < numStudent; i++){
        Class[i][0]
           
           numStudent++; 
       }
    }
    
    @FXML
    void addClick(MouseEvent event) {
        
    }

    @FXML
    void exitClick(MouseEvent event) {
       System.exit(0);
    }
    
    
    

    
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
}
