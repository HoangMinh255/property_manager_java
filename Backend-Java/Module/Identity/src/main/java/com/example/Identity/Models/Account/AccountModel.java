package com.example.Identity.Models.Account;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Table(name = "account", uniqueConstraints = @UniqueConstraint(name = "idx_account_email", columnNames = "account_email"))
@Getter 
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class AccountModel {
    public AccountModel() {
    }

    public AccountModel(UUID accountId, String accountEmail, String accountPassword,
            LocalDateTime accountCreatedAt, LocalDateTime accountUpdatedAt, Boolean accountIsActive) {
        this.accountId = accountId;
        this.accountEmail = accountEmail;
        this.accountPassword = accountPassword;
        this.accountCreatedAt = accountCreatedAt;
        this.accountUpdatedAt = accountUpdatedAt;
        this.accountIsActive = accountIsActive;
    }

    public static AccountModelBuilder builder() {
        return new AccountModelBuilder();
    }

    public UUID getAccountId() { return accountId; }
    public String getAccountEmail() { return accountEmail; }
    public String getAccountPassword() { return accountPassword; }
    public Boolean getAccountIsActive() { return accountIsActive; }
    public void setAccountPassword(String value) { accountPassword = value; }
    public void setAccountIsActive(Boolean value) { accountIsActive = value; }

    public static class AccountModelBuilder {
        private UUID accountId;
        private String accountEmail;
        private String accountPassword;
        private Boolean accountIsActive;
        public AccountModelBuilder accountId(UUID value) { accountId = value; return this; }
        public AccountModelBuilder accountEmail(String value) { accountEmail = value; return this; }
        public AccountModelBuilder accountPassword(String value) { accountPassword = value; return this; }
        public AccountModelBuilder accountIsActive(Boolean value) { accountIsActive = value; return this; }
        public AccountModel build() {
            return new AccountModel(accountId, accountEmail, accountPassword, null, null, accountIsActive);
        }
    }

    @Id 
    @Column(name = "account_id", nullable = false)
    private UUID accountId;

    @Column(name = "account_email", nullable = false, length = 255)
    private String accountEmail;

    @Column(name = "account_password", nullable = false, length = 255)
    private String accountPassword;

    @Column(name = "account_created_at")
    private LocalDateTime accountCreatedAt;

    @Column(name = "account_updated_at")
    private LocalDateTime accountUpdatedAt;

    @Column(name = "account_is_active", nullable = false)
    private Boolean  accountIsActive;
}
