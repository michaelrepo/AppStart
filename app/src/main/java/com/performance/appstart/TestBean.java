package com.performance.appstart;

import java.io.Serializable;

public class TestBean {
    public  TestBean(){}

    public TestBean(int test1, String test2) {
        this.test1 = test1;
        this.test2 = test2;
    }


    private  InnerClss innerClss=new InnerClss();
    public int getTest1() {
        return test1;
    }

    public void setTest1(int test1) {
        this.test1 = test1;
    }

    public String getTest2() {
        return test2;
    }

    public void setTest2(String test2) {
        this.test2 = test2;
    }

    private int test1 = 1;
    private String test2 = "2";



}
