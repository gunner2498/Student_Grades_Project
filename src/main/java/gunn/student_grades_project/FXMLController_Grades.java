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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

 

public class FXMLController_Grades implements Initializable {
//imports    

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
    
    int round=0;
    double[ ][ ] Class = new double[14][6];
    int cAvg = 0;
    
    @FXML
    void addClick(MouseEvent event) 
    {
     
    if (round < 15){
    Class[round][0]= Integer.parseInt(TXTF_NAME1.getText());
    Class[round][1]= Integer.parseInt(TXTF_NAME2.getText());
    Class[round][2]= Integer.parseInt(TXTF_TEST1.getText());
    Class[round][3]= Integer.parseInt(TXTF_TEST2.getText());
    Class[round][4]= Integer.parseInt(TXTF_TEST3.getText());
    Class[round][5]= Integer.parseInt(TXTF_TEST4.getText());
    Class[round][6]= (Class[round][2] + Class[round][3] + Class[round][4] + Class[round][5])/4 ;
    
    round = round+1;
    
    }

    else{ 
    TXTA_OUTPUT.setText("Too many Students in program, Maximum Fifteen");
    }
    TXTF_NAME1.setText(""); //resetting text fields not working?
    TXTF_NAME1.setText("");
    TXTF_NAME2.setText("");
    TXTF_TEST1.setText("");
    TXTF_TEST2.setText("");
    TXTF_TEST3.setText("");
    TXTF_TEST4.setText("");  
    
    }

    
    @FXML
    void listClick(MouseEvent event) 
    {
     TXTA_OUTPUT.setText(" ");
     for (int i=0; i <round;i++){
     TXTA_OUTPUT.setText("Name: " + Class[i][0] + Class[i][1] + "Marks:" + Class[i][2] + "%, " + Class[i][3] + "%, " + Class[i][4] + "%, " + Class[i][5] + "%\n" );
     }
    }
    
    @FXML
    void sAvgClick(MouseEvent event) {
     TXTA_OUTPUT.setText("");
     for (int i=0; i <round;i++){
     TXTA_OUTPUT.setText("Name: " + Class[i][0] + Class[i][1] + "Marks:" + Class[i][2] + "%, " + Class[i][3] + "%, " + Class[i][4] + "%, " + Class[i][5] + "%, " + "Avg: " + Class[i][6] + "%\n");
     }
    }
    @FXML
    void cAvgClick(MouseEvent event) {
    
     //not working, can you for loop and add? cAvg = (Class[0][6] + Class[2][6] + Class[3][6] + Class[4][6 + Class[5][6] + Class[6][6] + Class[7][6] + Class[8][6] + Class[9][6] + Class[10][6] + Class[11][6] + Class[12][6] + Class[13][6] + Class[14][6])/round;
        
     TXTA_OUTPUT.setText("");
     for (int i=0; i <round;i++){
     TXTA_OUTPUT.setText("Name: " + Class[i][0] + Class[i][1] + "Marks:" + Class[i][2] + "%, " + Class[i][3] + "%, " + Class[i][4] + "%, " + Class[i][5] + "%, " + "Avg: " + Class[i][6] + "%\n");
     }
    }
    @FXML
    void exitClick(MouseEvent event) {
       System.exit(0);
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
}
