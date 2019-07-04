package detail.pages;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;
public class login {
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
        else if(!(this.email.equalsIgnoreCase("abc.com") && this.password.equals("xyz")))
        {
            form.recordError(eF,"SORRY");
        }
    }

    Object onSuccess() {
        return this;
    }
}
