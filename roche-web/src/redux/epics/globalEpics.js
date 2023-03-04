import { filter, switchMap } from 'rxjs/operators'
import { DO_NOTHING } from '../actions/global/GlobalActionConstants'
import {
  doNothing,
  hideSpinner,
  showMessageAction,
  showSpinner,
} from '../actions/global/GlobalActions'
import { messages } from '../../utils/MessageUtils'
import { concat } from 'rxjs'

export const commonActionsEpic = (action$) =>
  action$.pipe(
    filter((action) => action.type !== DO_NOTHING),
    switchMap((action) => {
      let emitActions = []
      if (messages[action.type] === undefined) {
        emitActions.push(doNothing)
      } else {
          console.log(action)
          if (action.type === 'GLOBAL_FAIL_ACTION' && action.payload.error !== undefined) {
              var text = 'An Unknown Error has occured. (' + action.payload.error.request.url + ')'
              if(action.payload.error.response !== null){
                text = action.payload.error.response.message
              }
                emitActions.push(showMessageAction(
                             { message: { text: text, type: 'error' } }
                        ))
          } else {
              let actions = messages[action.type]
              actions.forEach((a) => {
                  switch (a.action) {
                      case 'showspinner':
                          emitActions.push(showSpinner())
                          break
                      case 'hidespinner':
                          console.log(action.type, 'gfdgdgdfgfdgdgdfdgfdfgdf')
                          emitActions.push(hideSpinner())
                          break
                      case 'showsuccess':
                      case 'showerror':
                          console.log(a.payload)
                          emitActions.push(showMessageAction(a.payload))
                          break
                      default:
                          emitActions.push(doNothing())
                  }
              })
          }
      }
      return concat(emitActions)
    }),
  )
