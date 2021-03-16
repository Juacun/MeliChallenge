
package meli.user;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.ToStringBuilder;

public class SellerReputation {

    @SerializedName("level_id")
    @Expose
    private String levelId;
    @SerializedName("power_seller_status")
    @Expose
    private String powerSellerStatus;
    @SerializedName("transactions")
    @Expose
    private Transactions transactions;
    @SerializedName("metrics")
    @Expose
    private Metrics metrics;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SellerReputation() {
    }

    /**
     * 
     * @param powerSellerStatus
     * @param levelId
     * @param metrics
     * @param transactions
     */
    public SellerReputation(String levelId, String powerSellerStatus, Transactions transactions, Metrics metrics) {
        super();
        this.levelId = levelId;
        this.powerSellerStatus = powerSellerStatus;
        this.transactions = transactions;
        this.metrics = metrics;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getPowerSellerStatus() {
        return powerSellerStatus;
    }

    public void setPowerSellerStatus(String powerSellerStatus) {
        this.powerSellerStatus = powerSellerStatus;
    }

    public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }

    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("levelId", levelId).append("powerSellerStatus", powerSellerStatus).append("transactions", transactions).append("metrics", metrics).toString();
    }

}
