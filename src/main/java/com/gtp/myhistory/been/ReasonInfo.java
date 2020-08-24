package com.gtp.myhistory.been;

public class ReasonInfo {
    private  int contract_id;
    private  String sequence_code;
    private  String contract_code;
    private  String status;
    private  String  reason;

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }
    public String getSequence_code() {
        return sequence_code;
    }

    public void setSequence_code(String sequence_code) {
        this.sequence_code = sequence_code;
    }
    public String getContract_code() {
        return contract_code;
    }

    public void setContract_code(String contract_code) {
        this.contract_code = contract_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
