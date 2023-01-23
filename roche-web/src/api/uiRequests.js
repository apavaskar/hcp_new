import {createRequest} from "./httpUtils";
import { MENU_API} from "./apiConstants";

export const menuRequest = (payload) => {
    return createRequest(MENU_API, null, payload.certificate, {userId: payload.id})
}


