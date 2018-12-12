/*Copyright (c) 2016-2017 wavemaker.com All Rights Reserved.
 This software is the confidential and proprietary information of wavemaker.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with wavemaker.com*/
package com.completeprofileproject.testprofiledb.models.procedure;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.sql.Date;
import java.util.List;
import java.util.Objects;

import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class TestprocResponseContent implements Serializable {


    @ColumnAlias("id")
    private Integer id;

    @ColumnAlias("year")
    private Integer year;

    @ColumnAlias("quarter")
    private Integer quarter;

    @ColumnAlias("date")
    private Date date;

    @ColumnAlias("client")
    private String client;

    @ColumnAlias("accountManager")
    private String accountManager;

    @ColumnAlias("revenue")
    private Double revenue;

    @ColumnAlias("product")
    private String product;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getQuarter() {
        return this.quarter;
    }

    public void setQuarter(Integer quarter) {
        this.quarter = quarter;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getClient() {
        return this.client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAccountManager() {
        return this.accountManager;
    }

    public void setAccountManager(String accountManager) {
        this.accountManager = accountManager;
    }

    public Double getRevenue() {
        return this.revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TestprocResponseContent)) return false;
        final TestprocResponseContent testprocResponseContent = (TestprocResponseContent) o;
        return Objects.equals(getId(), testprocResponseContent.getId()) &&
                Objects.equals(getYear(), testprocResponseContent.getYear()) &&
                Objects.equals(getQuarter(), testprocResponseContent.getQuarter()) &&
                Objects.equals(getDate(), testprocResponseContent.getDate()) &&
                Objects.equals(getClient(), testprocResponseContent.getClient()) &&
                Objects.equals(getAccountManager(), testprocResponseContent.getAccountManager()) &&
                Objects.equals(getRevenue(), testprocResponseContent.getRevenue()) &&
                Objects.equals(getProduct(), testprocResponseContent.getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(),
                getYear(),
                getQuarter(),
                getDate(),
                getClient(),
                getAccountManager(),
                getRevenue(),
                getProduct());
    }
}