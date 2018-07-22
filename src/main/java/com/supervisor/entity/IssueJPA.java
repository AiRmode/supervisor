package com.supervisor.entity;

import org.springframework.data.annotation.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Objects;

@Entity
public class IssueJPA implements Serializable {
    @Id
    private String issueId;

    private String issueLink;

    @CreatedDate
    private Calendar createdDate;
    @LastModifiedDate
    private Calendar lastModifiedDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String lastModifiedBy;

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueLink() {
        return issueLink;
    }

    public void setIssueLink(String issueLink) {
        this.issueLink = issueLink;
    }

    public Calendar getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IssueJPA issueJPA = (IssueJPA) o;
        return Objects.equals(issueId, issueJPA.issueId) &&
                Objects.equals(issueLink, issueJPA.issueLink) &&
                Objects.equals(createdDate, issueJPA.createdDate) &&
                Objects.equals(lastModifiedDate, issueJPA.lastModifiedDate) &&
                Objects.equals(createdBy, issueJPA.createdBy) &&
                Objects.equals(lastModifiedBy, issueJPA.lastModifiedBy);
    }

    @Override
    public int hashCode() {

        return Objects.hash(issueId, issueLink, createdDate, lastModifiedDate, createdBy, lastModifiedBy);
    }
}
