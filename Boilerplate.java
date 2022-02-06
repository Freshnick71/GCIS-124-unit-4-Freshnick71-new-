/*import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Boilerplate extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label mylabel = new Label("Label 1!");
        Label mylabel2 = new Label("Label 2...");

        mylabel.setPadding(new Insets(40));
        mylabel2.setPadding(new Insets(40));
        mylabel.setFont(new Font("Utopia", 20));
        mylabel2.setFont(new Font("Utopia", 20));
        
        HBox hb = new HBox();
        VBox vb = new VBox();
        hb.getChildren().add(mylabel);
        hb.getChildren().add(mylabel2);
        hb.setMinWidth(900);
        vb.getChildren().addAll(MakeDdefLabel("viabel 1"), MakeDdefLabel("v label 2!"));
        //vb.getChildren().add(addmylabel, mylabel2);

        BorderPane pane = new BorderPane();
        pane.setTop(hb);
        pane.setLeft(vb);

        Scene s = new Scene (hb);

        stage.setTitle("Boilerplate");
        stage.setScene(s);
        stage.show();        
    }

    public static void main(String[] args) {
        launch(args);
    }
    private static Label MakeDdefLabel(String text){
        Label mylabel = new Label(text);

        mylabel.setFont(new Font("Utopia", 20));
        mylabel.setPadding(new Insets(40));
        mylabel.setTextFill(Color.LIGHTGREEN);
        mylabel.setBackground(new Background(new BackgroundFill(Color.DARKSLATEGREY, CornerRadii.EMPTY, Insets.EMPTY)));
        return mylabel;
    }
}
*/
