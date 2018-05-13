package Extra.DataTranferObject;

/**
 * Created by FrancescoXX on 13/05/2018.
 */
public class DomainService {

    //Assume we have a backend service
    public DomainObjectDTO getData() {
        DomainObject domainObject = getObject();
        DomainObjectDTO domainObjectDTO = new DomainObjectDTO();
        domainObject.setaProperty(domainObject.getaProperty());
        return domainObjectDTO;
    }

    private DomainObject getObject() {
        return new DomainObject();
    }
}
