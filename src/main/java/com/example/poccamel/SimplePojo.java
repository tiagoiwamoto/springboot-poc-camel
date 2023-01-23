package com.example.simplerest;

import java.time.LocalDateTime;


public class SimplePojo {

    private Integer key;
    private LocalDateTime timestamp;
    private String correlationid;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getCorrelationid() {
        return correlationid;
    }

    public void setCorrelationid(String correlationid) {
        this.correlationid = correlationid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimplePojo{");
        sb.append("key=").append(key);
        sb.append(", timestamp=").append(timestamp);
        sb.append(", correlationid='").append(correlationid).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
