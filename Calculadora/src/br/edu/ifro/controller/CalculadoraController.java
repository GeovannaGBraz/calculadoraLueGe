/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author 85352144291
 */
public class CalculadoraController implements Initializable {
    
    @FXML
    private TextField txtNumero1;
    
    @FXML
    private TextField txtNumero2;
          
    @FXML
    private Button btnSoma;
    
    @FXML
    private Button btnSubtrair;
    
    @FXML
    private Button btnDividir;
    
    @FXML
    private Button btnMultiplicar;
    
     @FXML
    private Label lbResultado;
          
    
    @FXML
    private void Somar (ActionEvent event) {
      Double num1, num2, result;
      num1= Double.parseDouble (txtNumero1.getText());
      num2= Double.parseDouble (txtNumero2.getText());
      result= num1+num2;
      //TODO implementar a soma
      lbResultado.setText (result.toString());
    }
    
     @FXML
    private void Subtrair (ActionEvent event) {
      Double num1, num2, result;
      num1= Double.parseDouble (txtNumero1.getText());
      num2= Double.parseDouble (txtNumero2.getText());
      result= num1-num2;
      //TODO implementar a soma
      lbResultado.setText (result.toString());
    }
    
     @FXML
    private void Dividir (ActionEvent event) {
      Double num1, num2, result;
      num1= Double.parseDouble (txtNumero1.getText());
      num2= Double.parseDouble (txtNumero2.getText());
      result= num1/num2;
      //TODO implementar a soma
      lbResultado.setText (result.toString());
    }
    
     @FXML
    private void Multiplicar (ActionEvent event) {
      Double num1, num2, result;
      num1= Double.parseDouble (txtNumero1.getText());
      num2= Double.parseDouble (txtNumero2.getText());
      result= num1*num2;
      //TODO implementar a soma
      lbResultado.setText (result.toString());
    }
    
    @FXML
    private void abrirHistorico(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Historico.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),400,400);
            Stage stage = new Stage();
            stage.setTitle("Histórico");
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){

        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
