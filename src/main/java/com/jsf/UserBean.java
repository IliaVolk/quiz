package com.jsf;

import com.entities.User;
import org.springframework.context.annotation.Scope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

@ManagedBean
@Scope("session")
@Named
//@Stateful
public class UserBean implements Serializable {

    private User user = new User();

    public String getUsername() {
        return user.getUsername();
    }

    public void setUsername(String username) {
        user.setUsername(username);
    }
    public void sighOut(){
        user.setUsername("");
    }
    public void standToQueue() throws IOException {

    }
}
