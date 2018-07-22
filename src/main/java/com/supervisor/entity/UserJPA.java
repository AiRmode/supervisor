package com.supervisor.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Objects;

@Entity
public class UserJPA {
    @Id
    private String userId;

    private String userDisplayName;

    @CreatedDate
    private Calendar createdDate;
    @LastModifiedDate
    private Calendar lastModifiedDate;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String lastModifiedBy;

    public UserJPA(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserDisplayName() {
        return userDisplayName;
    }

    public void setUserDisplayName(String userDisplayName) {
        this.userDisplayName = userDisplayName;
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
        UserJPA userJPA = (UserJPA) o;
        return Objects.equals(userId, userJPA.userId) &&
                Objects.equals(userDisplayName, userJPA.userDisplayName) &&
                Objects.equals(createdDate, userJPA.createdDate) &&
                Objects.equals(lastModifiedDate, userJPA.lastModifiedDate) &&
                Objects.equals(createdBy, userJPA.createdBy) &&
                Objects.equals(lastModifiedBy, userJPA.lastModifiedBy);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId, userDisplayName, createdDate, lastModifiedDate, createdBy, lastModifiedBy);
    }

    public static class UserDTO extends UserJPA {
        private UserJPA userJPA;
        private boolean isChecked;
        private String userId;
        private String userDisplayName;

        public UserDTO(UserJPA userJPA) {
            super(userJPA.getUserId());
            this.userJPA = userJPA;
            this.userId = userJPA.getUserId();
            this.userDisplayName = userJPA.getUserDisplayName();
        }

        public boolean isChecked() {
            return isChecked;
        }

        public void setChecked(boolean checked) {
            isChecked = checked;
        }
    }
}
