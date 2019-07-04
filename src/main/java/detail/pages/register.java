package detail.pages;

import org.apache.tapestry5.annotations.InjectComponent;
import org.apache.tapestry5.annotations.Property;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.Form;
import org.apache.tapestry5.corelib.components.PasswordField;
import org.apache.tapestry5.corelib.components.TextField;
public class register {
        @Property

        private String email;

        @Property
        private String password;

        @InjectComponent("registerForm")
        private Form form;

        @InjectComponent("email")
        private TextField eF;

        @InjectComponent("password")
        private PasswordField pF;



        Object onSuccess(){
            return this;
        }

}