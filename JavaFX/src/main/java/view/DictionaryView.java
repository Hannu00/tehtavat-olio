package view;

import controller.DictionaryController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class DictionaryView extends Application {
    private DictionaryController controller;

    public DictionaryView(DictionaryController controller) {
        this.controller = controller;
    }

    @Override
    public void start(Stage stage) {
        Label label = new Label("Enter a word:");
        TextField textField = new TextField();
        Button button = new Button("Search");
        Label resultLabel = new Label();

        button.setOnAction(e -> {
            String word = textField.getText();
            String meaning = controller.searchWord(word);
            resultLabel.setText(meaning != null ? meaning : "Word not found");
        });

        FlowPane root = new FlowPane(label, textField, button, resultLabel);
        Scene scene = new Scene(root, 300, 100);
        stage.setScene(scene);
        stage.setTitle("Dictionary");
        stage.show();
    }
}