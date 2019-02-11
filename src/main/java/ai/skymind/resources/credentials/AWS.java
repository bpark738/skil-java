package ai.skymind.resources.credentials;

import ai.skymind.ApiException;
import ai.skymind.Skil;
import ai.skymind.skil.model.AddCredentialsRequest;

public class AWS extends Credentials {

    public AWS(Skil skil, String uri, String name) throws ApiException {
        super(skil, AddCredentialsRequest.TypeEnum.AWS, uri, name);
    }
}
