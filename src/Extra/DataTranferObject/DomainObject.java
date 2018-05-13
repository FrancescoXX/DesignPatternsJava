package Extra.DataTranferObject;

/**
 * Created by FrancescoXX on 13/05/2018.
 *
 * Domain Object
 */
public class DomainObject {

    private String aProperty;
    private String confidential; //it may contain a password

    public String getaProperty() {
        return aProperty;
    }

    public void setaProperty(String aProperty) {
        this.aProperty = aProperty;
    }

    public String getConfidential() {
        return confidential;
    }

    public void setConfidential(String confidential) {
        this.confidential = confidential;
    }
}
