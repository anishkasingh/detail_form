package detail.pages;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.ioc.annotations.Inject;
import  java.util.*;


public class login {
    @InjectPage
    private Display display;

    @Property
    private String email;

    @Property
    private String password;

    @InjectComponent("loginForm")
    private Form form;

    @InjectComponent("email")
    private TextField eF;

    @InjectComponent("password")
    private PasswordField pF;

    void onValidateFromLoginForm(){
        if(this.email==null || this.password==null){
            form.recordError(eF,"Please enter any value");
        }
    }
    Object onSuccess() {

        return display;
    }
}
