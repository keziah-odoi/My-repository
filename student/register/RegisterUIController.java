/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.register;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author kezia
 */
public class RegisterUIController implements Initializable {

    @FXML
    private TextField txtSurname;

    @FXML
    private TextField txtFname;

    @FXML
    private TextField txtMName;

    @FXML
    private TextField txtExt;

    @FXML
    private TextField txtGender;

    @FXML
    private TextField txtPops;

    @FXML
    private TextField txtMoms;

    @FXML
    private TextField txtNum;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextArea txtAdd;

    @FXML
    private TextField txtProg;

    @FXML
    private TextField txtHall;

    @FXML
    private Button btnSubmitReg;

    @FXML
    private TextField txtDOB;
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
     String lname = txtSurname.getText();
     String fname = txtFname.getText();
     String mname = txtMName.getText();
     String ext = txtExt.getText();
     String gender = txtGender.getText();
     String pops = txtPops.getText();
     String moms = txtMoms.getText();
     String num = txtNum.getText();
     String email = txtEmail.getText();
     String prog = txtProg.getText();
     String address = txtAdd.getText();
     String hall = txtHall.getText();
     

     
    @FXML
    private void handleRegSubmit(MouseEvent event) {
    }
    
}
