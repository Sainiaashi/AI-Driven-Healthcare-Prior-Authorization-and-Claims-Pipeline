public class RuleResult {

    private String ruleId;
    private RuleStatus status;
    private String reason;

    public RuleResult(String ruleId, RuleStatus status, String reason) {
        this.ruleId = ruleId;
        this.status = status;
        this.reason = reason;
    }

    public String getRuleId() {
        return ruleId;
    }

    public RuleStatus getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }
}