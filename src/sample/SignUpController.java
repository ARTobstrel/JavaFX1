package sample;

import java.net.URL;
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

        signUpButton.setOnAction(event -> {
            signUpNewUser();
        });
    }

    private void signUpNewUser () {
        DatabaseHandler dbHandler = new DatabaseHandler();

        String firstName = signUpName.getText();
        String lastName = signUpLastname.getText();
        String userName = signUpLogin.getText();
        String password = signUpPassword.getText();
        String location = signUpCountry.getText();
        String gender = "";
        if (signUpCheckBoxMale.isSelected() && signUpCheckBoxFemale.isSelected())
            gender = "terminate";
        else if (signUpCheckBoxFemale.isSelected())
            gender = "Female";
        else
            gender = "Male";

        User user = new User(firstName, lastName, userName, password, location, gender);


        dbHandler.signUpUser(user);
    }
}