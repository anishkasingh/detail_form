package detail.pages;
import java.util.*;
import org.apache.tapestry5.annotations.*;

import org.apache.tapestry5.corelib.components.*;
public class Delete {
    @InjectPage
    Display display;

    //   to check whether the element is the the list or not
//    int flag =0;
    Object onSuccess() {
        return this;
    }
}