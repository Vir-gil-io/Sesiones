package mx.utng.s25.s25.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Long id;
    @SuppressWarnings("unused")
    private String login;
    @Column(length =100, nullable = false)
    @NotEmpty
    @Email
    private String email;
    @Column(length=40, nullable = false)
    @NotEmpty
    private String password;
    @Temporal(TemporalType.DATE)
    private Date recordAt;

    @PrePersist
    public void prePersist(){
        recordAt= new Date();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
