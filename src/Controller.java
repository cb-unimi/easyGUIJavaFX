import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField lblName;

    @FXML
    private TextField lblNumber;

    @FXML
    private Button btnOK;
    
    @FXML
    private Label lblMessage;

    @FXML
    void handleName(ActionEvent event) {

    }

    @FXML
    void handleNumber(ActionEvent event) {

    }

    @FXML
    void handleOK(ActionEvent event) {
    	//System.out.println("Button pressed");
    	//String messaggio = "Button pressed";
    	lblMessage.setVisible(true);
    	
    	String numS = lblNumber.getText();
    	Integer num = Integer.parseInt(numS);
    	
    	String message;
    	if (num>1) {
    		message = "vi";
    	} else {
    		message = "ti";
    	}
    	String messaggio = lblName.getText() + ", " + message + " aspettiamo!";
        lblMessage.setText(messaggio);
    }

    @FXML
    void initialize() {
        assert lblName != null : "fx:id=\"lblName\" was not injected: check your FXML file 'ex.fxml'.";
        assert lblNumber != null : "fx:id=\"lblNumber\" was not injected: check your FXML file 'ex.fxml'.";
        assert btnOK != null : "fx:id=\"btnOK\" was not injected: check your FXML file 'ex.fxml'.";
        assert lblMessage != null : "fx:id=\"lblMessage\" was not injected: check your FXML file 'ex.fxml'.";
        lblMessage.setVisible(false);
    }
}
