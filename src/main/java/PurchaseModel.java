public class PurchaseModel {
    public int mPurchaseID, mProductID, mCustomerID;
    public double mQuantity, mCost, mTax, mTotal;
    public String mDate;

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(mPurchaseID).append(",");
        sb.append(mCustomerID).append(",");
        sb.append(mProductID).append(",");
        sb.append("\"").append(mDate).append("\",");
        sb.append(mQuantity).append(",");
        sb.append(mCost).append(",");
        sb.append(mTax).append(",");
        sb.append(mTotal);
        sb.append(")");
        return sb.toString();
    }
}