import { createRequest } from './httpUtils'
import { LOGIN_API, USER_PRIVILEGE_API, USER_PROFILE_API} from './apiConstants'

export const authRequest = (payload) => createRequest(LOGIN_API,  payload.data)

export const userProfileRequest = (payload) => {
  return createRequest(USER_PROFILE_API, null, payload.certificate, {userId: payload.id})
}
export const userPrivilegesRequest = payload => {
    return createRequest(USER_PRIVILEGE_API, null, payload.certificate, {userId: payload.id})
}
