package Q2;

public class RiskProfile {
    private final String label;
    private final double score;

    public RiskProfile(String label, double score) {
        this.label = label;
        this.score = score;
    }

    public String getLabel() {
        return label;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Perfil de risco: " + label + " (score=" + score + ")";
    }
}
