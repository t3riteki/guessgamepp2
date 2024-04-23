import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class GuessGameFX extends Application{
   int ranVal = (int) Math.floor(Math.random() * 10);

   public void start(Stage stage){
   
      TextField guessTextField = new TextField("Pick a number: 1-10");
      guessTextField.setMaxWidth(250);
      
      Label verifyLabel = new Label();
      verifyLabel.setTextFill(Color.GREEN);
      verifyLabel.setFont(Font.font("Arial", 20));
      
      Button guessButton = new Button();
      guessButton.setText("Take a Chance?");
      guessButton.setOnAction(e -> {
            if (Integer.parseInt(guessTextField.getText()) > ranVal){
               verifyLabel.setText("Lower");
            }
            
            else if (Integer.parseInt(guessTextField.getText()) < ranVal){
               verifyLabel.setText("Higher");
            }
            
            else{
               verifyLabel.setText("You win");
            }
         
         });
      
      VBox root = new VBox();
      root.setSpacing(10);
      root.setAlignment(Pos.CENTER);
      
      root.getChildren().addAll(guessTextField, guessButton, verifyLabel);
     
      Scene scene = new Scene(root, 350, 150);
      
      stage.setScene(scene);
      stage.setTitle("GuessGameGab");
      stage.show();   
   }
   
   public static void main(String [] args){
      launch(args);
   }
}