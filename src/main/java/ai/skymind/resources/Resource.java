package ai.skymind.resources;

import ai.skymind.ApiException;
import ai.skymind.Skil;
import lombok.Data;

/**
 * Resource
 *
 * A SKIL  resource is an abstraction for (cloud and on-premise)
 * compute or storage capabilities.
 *
 * @author Max Pumperla
 */
@Data
public class Resource {

    protected Skil skil;
    protected Long resourceId = null;

    public Resource(Skil skil) {

        this.skil = skil;
    }

    public Resource(Skil skil, Long resourceId) {

        this.skil = skil;
        this.resourceId = resourceId;
    }

    /**
     * Delete the resource from SKIL.
     */
    public void delete() throws ApiException {
        this.skil.getApi().deleteResourceById(this.resourceId);

    }

    public Long getResourceId(){
        return this.resourceId;
    }
}
