package com.ticketnew.qe.api.entity;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/5/26
 */
public class Order {
    private String extLockId;
    private String tradeId;
    private String extTradeId;
    private String status;
    private Donation donation;
    private int amount;
    private Ticket ticket;
    private SeatLock seatLock;

    public String getExtTradeId() {
        return extTradeId;
    }

    public void setExtTradeId(String extTradeId) {
        this.extTradeId = extTradeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SeatLock getSeatLock() {
        return seatLock;
    }

    public void setSeatLock(SeatLock seatLock) {
        this.seatLock = seatLock;
    }

    public String getExtLockId() {
        return extLockId;
    }

    public void setExtLockId(String extLockId) {
        this.extLockId = extLockId;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public Donation getDonation() {
        return donation;
    }

    public void setDonation(Donation donation) {
        this.donation = donation;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Order{" +
            "extLockId='" + extLockId + '\'' +
            ", tradeId='" + tradeId + '\'' +
            ", extTradeId='" + extTradeId + '\'' +
            ", status='" + status + '\'' +
            ", donation=" + donation +
            ", amount=" + amount +
            ", ticket=" + ticket +
            ", seatLock=" + seatLock +
            '}';
    }
}
