package sample;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField signUpName;

    @FXML
    private TextField signUpLastname;

    @FXML
    private TextField signUpLogin;

    @FXML
    private TextField signUpPassword;

    @FXML
    private TextField signUpCountry;

    @FXML
    private CheckBox signUpCheckBoxMale;

    @FXML
    private CheckBox signUpCheckBoxFemale;

    @FXML
    private Button signUpButton;

    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        signUpButton.setOnAction(event -> {
            try {
                dbHandler.signUpUser(signUpName.getText(),
                        signUpLastname.getText(),
                        signUpLogin.getText(),
                        signUpPassword.getText(),
                        signUpCountry.getText(),
                        "Male");
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }


        }
        );
    }
}
