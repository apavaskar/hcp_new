import { ajax } from 'rxjs/ajax';
import {AUTH_CERTIFICATE, BASE_URL} from "./apiConstants";
import {template} from "lodash";

/*
export const createRequest = (api, certificate, body) => {
    const isAuth = api.auth;
    let headers = {};
    headers['Content-Type'] = 'application/json';
    if (isAuth) {
        headers[AUTH_CERTIFICATE] = certificate;
    }
    if (api.method === 'POST' || api.method === 'PUT') {
        return ajax({
            url: `${BASE_URL}${api.url}`,
            method: api.method,
            headers: headers,
            body: body,
        });
    } else {
        return ajax({
            url: `${BASE_URL}${api.url}`,
            method: api.method,
            headers: headers,
        });
    }

}*/

export const createMultipartRequest = (api, body, token, params) => {
    return create(api, body, token, params, 'multipart/form-data');
};

export const createRequest = (api, body, token, params) => {
    return create(api, body, token, params, 'application/json');
};

const create = (api, body, token, params, contentType) => {
    const isAuth = api.auth;
    let headers = {};
    headers['Content-Type'] = contentType;
    headers['Access-Control-Allow-Origin'] = '*';
    let url = api.url;
    if (params !== null && params !== undefined) {
        url = template(url)(params);
    }
    if (isAuth) {
        headers['Authorization'] = `${token}`;
    }
    if (api.method === 'POST' || api.method === 'PUT') {
        return ajax({
            url: `${BASE_URL}/${url}`,
            crossDomain: true,
            method: api.method,
            headers: headers,
            body: body,
        });
    } else {
        return ajax({
            url: `${BASE_URL}/${url}`,
            crossDomain: true,
            method: api.method,
            headers: headers,
        });
    }
};


