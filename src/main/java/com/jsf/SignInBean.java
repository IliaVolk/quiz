package com.jsf;


import org.springframework.context.annotation.Scope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@ManagedBean
@Named
@Scope("request")
public class SignInBean implements Serializable{
    @Pattern(regexp = "^[a-zA-Z]*$", message = "Must be a alphanumerical")
    @Size(min = 4, max = 20, message = "Must be between 4 and 20 symbols")
    private String username;



    @Inject
    private UserBean userBean;

    public void setUserBean(UserBean userBean) {
        this.userBean = userBean;
    }

    public String getUsername() {
        return "";
    }

    public void setUsername(String username) {
        this.username = username;
        userBean.setUsername(username);
    }
}
