package org.wso2.carbon.apimgt.rest.api.store;

import org.wso2.carbon.apimgt.rest.api.store.*;
import org.wso2.carbon.apimgt.rest.api.store.dto.*;

import org.wso2.carbon.apimgt.rest.api.store.dto.ErrorDTO;

import java.util.List;

import java.io.InputStream;


import javax.ws.rs.core.Response;

public abstract class TagsApiService {
    public abstract Response tagsGet(String accept,String ifNoneMatch,String query);
}

