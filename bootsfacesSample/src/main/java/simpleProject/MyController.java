package simpleProject;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class MyController implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 7951884817817378649L;
    private boolean myValue;

    public boolean getMyValue() {
        return myValue;
    }

    public void setMyValue(boolean myValue) {
        this.myValue = myValue;
    }

    // change to Wrapper Class Boolean, and its works like a charme!!!

    // public Boolean getMyValue() {
    // return myValue;
    // }
    //
    // public void setMyValue(Boolean myValue) {
    // this.myValue = myValue;
    // }

}
