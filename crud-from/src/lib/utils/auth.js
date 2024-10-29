import { auth } from '../../lib/sdk/firebase'
import {
    createUserWithEmailAndPassword,
    signInWithEmailAndPassword
} from 'firebase/auth'

const signUpService = async (email='', pass) => {
    try {
        await createUserWithEmailAndPassword(auth, email, pass)

    } catch(error) {
        let errorCode = ''
        errorCode = error.code
        console.log('error in 2nd layer of auth services', errorCode)
    }
}

const signInService = async (email='', pass) => {
    try {
        await signInWithEmailAndPassword(auth, email, pass)

    } catch(error) {
        let errorCode = ''
        errorCode = error.code
        console.log('error in 2nd layer of auth services', errorCode)
    }
}

export { signUpService, signInService }