package com.enoxs.domain;

import java.io.Serializable;

public class AppInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long appId;

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Long getAppId(){
        return appId;
    }
}
