/*
 * This file is generated by jOOQ.
 */
package com.tej.JooQDemo.jooq.sample.model.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String name;
    private String email;
    private String password;

    public User() {}

    public User(User value) {
        this.id = value.id;
        this.name = value.name;
        this.email = value.email;
        this.password = value.password;
    }

    public User(
        Integer id,
        String name,
        String email,
        String password
    ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * Getter for <code>yamaha.user.id</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Setter for <code>yamaha.user.id</code>.
     */
    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>yamaha.user.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>yamaha.user.name</code>.
     */
    public User setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>yamaha.user.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Setter for <code>yamaha.user.email</code>.
     */
    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Getter for <code>yamaha.user.password</code>.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>yamaha.user.password</code>.
     */
    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.password == null) {
            if (other.password != null)
                return false;
        }
        else if (!this.password.equals(other.password))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(email);
        sb.append(", ").append(password);

        sb.append(")");
        return sb.toString();
    }
}
