package com.wangwei.cameragl.model;

public class DemoItem {
    private String     name;
    private String     sign;
    private Class<?>   clzz;

    public DemoItem(String name, String sign, Class<?> clzz) {
        this.name  = name;
        this.sign  = sign;
        this.clzz   = clzz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Class<?> getClzz() {
        return clzz;
    }

    public void setCls(Class<?> clzz) {
        this.clzz = clzz;
    }
}
