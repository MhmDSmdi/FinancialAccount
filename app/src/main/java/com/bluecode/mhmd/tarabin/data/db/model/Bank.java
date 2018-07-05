package com.bluecode.mhmd.tarabin.data.db.model;

public enum Bank {

    EGHTESAD_NOVIN(0),
    KOSAR(1);

    private int code;

    Bank(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
