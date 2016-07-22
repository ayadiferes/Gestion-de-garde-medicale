/*
 * Copyright (c) 2016 GestionDeGardes
 */
package com.company.gestiondegardes.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

/**
 * @author pc
 */
@NamePattern("%s|doctorName")
@Table(name = "GESTIONDEGARDES_WRITE_DISPONIBILITY")
@Entity(name = "gestiondegardes$WriteDisponibility")
public class WriteDisponibility extends StandardEntity {
    private static final long serialVersionUID = -1078480688527408776L;

    @Column(name = "DOCTOR_NAME", nullable = false)
    protected String doctorName;

    @Column(name = "CIN", nullable = false)
    protected String cin;

    @Column(name = "EMAIL", nullable = false)
    protected String email;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DAY_NO_DISPO", nullable = false)
    protected Date dayNoDispo;

    @Column(name = "REASONS", nullable = false)
    protected String reasons;

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getCin() {
        return cin;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setDayNoDispo(Date dayNoDispo) {
        this.dayNoDispo = dayNoDispo;
    }

    public Date getDayNoDispo() {
        return dayNoDispo;
    }

    public void setReasons(String reasons) {
        this.reasons = reasons;
    }

    public String getReasons() {
        return reasons;
    }


}