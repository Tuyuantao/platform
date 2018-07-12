package com.ticketnew.qe.api.entity;

/**
 * @author qingmiao
 * @version 1.0.0
 * @since 2017/6/7
 */
public class SeatLock {
    private long currentTime;
    private int lockSecond;
    private long lockTime;
    private String lockId;
    private String status;

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public int getLockSecond() {
        return lockSecond;
    }

    public void setLockSecond(int lockSecond) {
        this.lockSecond = lockSecond;
    }

    public long getLockTime() {
        return lockTime;
    }

    public void setLockTime(long lockTime) {
        this.lockTime = lockTime;
    }

    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SeatLock{" +
            "currentTime=" + currentTime +
            ", lockSecond=" + lockSecond +
            ", lockTime=" + lockTime +
            ", lockId='" + lockId + '\'' +
            ", status='" + status + '\'' +
            '}';
    }
}
