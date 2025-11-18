package Q4;

import java.util.Set;

public class GeoLocationCheckHandler extends FraudCheckHandler {

    private final Set<String> blacklistedCountries;

    public GeoLocationCheckHandler(Set<String> blacklistedCountries) {
        this.blacklistedCountries = blacklistedCountries;
    }

    @Override
    protected FraudCheckResult check(Transaction tx) {
        if (blacklistedCountries.contains(tx.getCountry())) {
            return new FraudCheckResult(false, "País de origem bloqueado: " + tx.getCountry());
        }
        System.out.println("[GeoCheck] País permitido: " + tx.getCountry());
        return new FraudCheckResult(true, "Geolocalização permitida");
    }
}
