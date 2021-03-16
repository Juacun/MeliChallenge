
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SellerReputation_ {

    @SerializedName("transactions")
    @Expose
    private Transactions_ transactions;
    @SerializedName("power_seller_status")
    @Expose
    private String powerSellerStatus;
    @SerializedName("metrics")
    @Expose
    private Metrics_ metrics;
    @SerializedName("level_id")
    @Expose
    private String levelId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SellerReputation_() {
    }

    /**
     * 
     * @param powerSellerStatus
     * @param levelId
     * @param metrics
     * @param transactions
     */
    public SellerReputation_(Transactions_ transactions, String powerSellerStatus, Metrics_ metrics, String levelId) {
        super();
        this.transactions = transactions;
        this.powerSellerStatus = powerSellerStatus;
        this.metrics = metrics;
        this.levelId = levelId;
    }

    public Transactions_ getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions_ transactions) {
        this.transactions = transactions;
    }

    public String getPowerSellerStatus() {
        return powerSellerStatus;
    }

    public void setPowerSellerStatus(String powerSellerStatus) {
        this.powerSellerStatus = powerSellerStatus;
    }

    public Metrics_ getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics_ metrics) {
        this.metrics = metrics;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("transactions", transactions).append("powerSellerStatus", powerSellerStatus).append("metrics", metrics).append("levelId", levelId).toString();
    }

}
