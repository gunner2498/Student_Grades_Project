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
    
    int round = 0;
    String Class[ ][ ] = new String[14][7];
    int cAvg = 0;
    
    @FXML
    void addClick(MouseEvent event) 
    {
     
    if (round < 15){
    Class[round][0]= TXTF_NAME1.getText();
    Class[round][1]= TXTF_NAME2.getText();
    Class[round][2]= TXTF_TEST1.getText();
    Class[round][3]= TXTF_TEST2.getText();
    Class[round][4]= TXTF_TEST3.getText();
    Class[round][5]= TXTF_TEST4.getText();
    Class[round][6]= ""+ ((Integer.parseInt(Class[round][3]) + Integer.parseInt(Class[round][4]) + Integer.parseInt(Class[round][5]) + Integer.parseInt(Class[round][2]))/4);//error here
    
    
    round++;
    
    listClick(event);
    }

    else{ 
    TXTA_OUTPUT.setText("Too many Students in program, Maximum Fifteen");
    }
    TXTF_NAME1.setText(""); 
    TXTF_NAME1.setText("");
    TXTF_NAME2.setText("");
    TXTF_TEST1.setText("");
    TXTF_TEST2.setText("");
    TXTF_TEST3.setText("");
    TXTF_TEST4.setText("");  
    
    }
    
    //TXTA_OUTPUT.getText()+ this so the text doesnt get replaced
    
    @FXML
    void listClick(MouseEvent event) 
    {
     TXTA_OUTPUT.setText(" ");
     for (int i=0; i <round;i++){
     TXTA_OUTPUT.setText(TXTA_OUTPUT.getText()+"Name: " +  Class[i][0] + " " +  Class[i][1] + " Marks: " + Integer.parseInt(Class[i][2]) + "%, " + Integer.parseInt(Class[i][3]) + "%, " + Integer.parseInt(Class[i][4]) + "%, " + Integer.parseInt(Class[i][5]) + "%" + "\n" );
     
     }
    }
    
    @FXML
    void sAvgClick(MouseEvent event) {
     TXTA_OUTPUT.setText("");
     for (int i=0; i <round;i++){
     TXTA_OUTPUT.setText(TXTA_OUTPUT.getText()+"Name: " + Class[i][0] + " " + Class[i][1] + " Marks: " + Integer.parseInt(Class[i][2]) + "%, " + Integer.parseInt(Class[i][3]) + "%, " + Integer.parseInt(Class[i][4]) + "%, " + Integer.parseInt(Class[i][5]) + "%, " + "Avg: " + Integer.parseInt(Class[i][6]) + "%\n");
    
     }
    }
    @FXML
    void cAvgClick(MouseEvent event) {
    
    cAvg = (Integer.parseInt(Class[2][6]) + Integer.parseInt(Class[0][6]) + Integer.parseInt(Class[3][6]) + Integer.parseInt(Class[4][6]) + Integer.parseInt(Class[5][6]) + Integer.parseInt(Class[6][6]) + Integer.parseInt(Class[7][6]) + Integer.parseInt(Class[8][6]) + Integer.parseInt(Class[9][6]) + Integer.parseInt(Class[10][6]) + Integer.parseInt(Class[11][6]) + Integer.parseInt(Class[12][6]) + Integer.parseInt(Class[13][6]) + Integer.parseInt(Class[14][6]))/round;
        
     TXTA_OUTPUT.setText("");
     for (int i=0; i <round;i++){
     TXTA_OUTPUT.setText("Name: " + Class[i][0] + " " + Class[i][1] + " Marks: " + Integer.parseInt(Class[i][2]) + "%, " + Integer.parseInt(Class[i][3]) + "%, " + Integer.parseInt(Class[i][4]) + "%, " + Integer.parseInt(Class[i][5]) + "%, " + "Avg: " + Integer.parseInt(Class[i][6]) + "%\n");
     TXTA_OUTPUT.setText("Class Average is: " + cAvg + "%");
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
