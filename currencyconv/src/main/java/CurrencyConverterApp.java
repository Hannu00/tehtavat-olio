import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CurrencyConverterApp extends Application {

    private final CurrencyConverter currencyConverter = new CurrencyConverter();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setStyle("-fx-background-color: #ffdf00;");
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        // Määritetään mitä komponentteja käytetään
        TextField amountTextField = new TextField();
        ComboBox<String> sourceCurrencyComboBox = new ComboBox<>();
        ComboBox<String> targetCurrencyComboBox = new ComboBox<>();
        Label resultLabel = new Label();
        Button convertButton = new Button("Convert");

        // Komponenttien asettelu tai jotai sellasta
        amountTextField.setStyle("-fx-pref-width: 150px;");
        amountTextField.setStyle("-fx-background-color: #ff0000;");
        sourceCurrencyComboBox.setStyle("-fx-pref-width: 150px;");
        sourceCurrencyComboBox.setStyle("-fx-background-color: #ff0000;");
        targetCurrencyComboBox.setStyle("-fx-pref-width: 150px;");
        targetCurrencyComboBox.setStyle("-fx-background-color: #ff0000;");
        resultLabel.setStyle("-fx-font-size: 16px;");
        convertButton.setStyle("-fx-pref-width: 150px;");
        convertButton.setStyle("-fx-background-color: #ff0000;");

        // Tässä hieno ohje josta sai kai pisteen
        Label instructionLabel = new Label("Enter the amount, select source and target currencies, then click Convert.");

        // Lisätään asiat yhteen
        grid.add(instructionLabel, 0, 0, 2, 1); // Span 2 columns for the instruction
        grid.add(new Label("Amount:"), 0, 1);
        grid.add(amountTextField, 1, 1);
        grid.add(new Label("Source Currency:"), 0, 2);
        grid.add(sourceCurrencyComboBox, 1, 2);
        grid.add(new Label("Target Currency:"), 0, 3);
        grid.add(targetCurrencyComboBox, 1, 3);
        grid.add(new Label("Result:"), 0, 4);
        grid.add(resultLabel, 1, 4);
        grid.add(convertButton, 1, 5);

        // Asetetaan tanssilava kuntoon
        primaryStage.setTitle("Currency Converter");
        Scene scene = new Scene(grid, 500, 500);

        // Laitetaan comboboxeihin hienosti tietoja
        sourceCurrencyComboBox.getItems().addAll(currencyConverter.getAvailableCurrencies());
        targetCurrencyComboBox.getItems().addAll(currencyConverter.getAvailableCurrencies());

        // Mitä napuska convert tekee
        convertButton.setOnAction(event -> convertCurrency(amountTextField.getText(),
                sourceCurrencyComboBox.getValue(), targetCurrencyComboBox.getValue(), resultLabel));

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void convertCurrency(String amountStr, String sourceCurrency, String targetCurrency, Label resultLabel) {
        try {
            double amount = Double.parseDouble(amountStr);
            double result = currencyConverter.convert(amount, sourceCurrency, targetCurrency);
            resultLabel.setText(String.format("%.2f %s", result, targetCurrency));
        } catch (IllegalArgumentException ex) {
            resultLabel.setText("Invalid input");
        }
    }
}
