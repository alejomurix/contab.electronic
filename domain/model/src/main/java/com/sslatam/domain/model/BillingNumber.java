package com.sslatam.domain.model;

import java.time.LocalDate;

/***
 * Autorización numeración de facturación.
 */
public class BillingNumber {

    private Integer id;
    private String number;
    private LocalDate dateBegin;
    private Integer vigency;
    private LocalDate dateEnd;
    private String prefix;
    private Integer numberBegin;
    private Integer numberEnd;
    private Integer consecutive;

    public BillingNumber() {}

    public BillingNumber(
            String number,
            LocalDate dateBegin,
            Integer vigency,
            LocalDate dateEnd,
            String prefix,
            Integer numberBegin,
            Integer numberEnd,
            Integer consecutive) {
        this.number = number;
        this.dateBegin = dateBegin;
        this.vigency = vigency;
        this.dateEnd = dateEnd;
        this.prefix = prefix;
        this.numberBegin = numberBegin;
        this.numberEnd = numberEnd;
        this.consecutive = consecutive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(LocalDate dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Integer getVigency() {
        return vigency;
    }

    public void setVigency(Integer vigency) {
        this.vigency = vigency;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getNumberBegin() {
        return numberBegin;
    }

    public void setNumberBegin(Integer numberBegin) {
        this.numberBegin = numberBegin;
    }

    public Integer getNumberEnd() {
        return numberEnd;
    }

    public void setNumberEnd(Integer numberEnd) {
        this.numberEnd = numberEnd;
    }

    public Integer getConsecutive() {
        return consecutive;
    }

    public void setConsecutive(Integer consecutive) {
        this.consecutive = consecutive;
    }
}
