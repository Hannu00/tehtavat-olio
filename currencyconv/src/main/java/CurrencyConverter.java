import java.util.HashMap;
import java.util.Map;

public class CurrencyConverter {

    private final Map<String, Double> conversionRates = new HashMap<>();

    public CurrencyConverter() {
        initializeConversionRates();
    }

    private void initializeConversionRates() {
        // Sample conversion rates (replace with your actual rates)
        conversionRates.put("USD", 1.0);
        conversionRates.put("EUR", 0.85);
        conversionRates.put("GBP", 0.73);
        conversionRates.put("JPY", 110.0);
    }

    public double convert(double amount, String sourceCurrency, String targetCurrency) {
        try {
            double sourceRate = conversionRates.get(sourceCurrency);
            double targetRate = conversionRates.get(targetCurrency);
            return (amount / sourceRate) * targetRate;
        } catch (NullPointerException ex) {
            throw new IllegalArgumentException("Invalid currency");
        }
    }

    public String[] getAvailableCurrencies() {
        return conversionRates.keySet().toArray(new String[0]);
    }
}
