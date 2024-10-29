import { useEffect } from 'react'
import { useDispatch, useSelector } from 'react-redux'
import { typeofHandler } from "../../../lib/utils/helpers/typeofVar"
import { setUserUID } from "../../../redux/slices/auth/layerZero/authSlice"
import { fromLayerZeroGetAuthCurrentUser } from "../../../redux/slices/auth/layerZero/authSlice"
import LTSurveys from '../../(layerTwo)/surveys/LTSurveys'

export default function SurveysPage() {
    const dispatch = useDispatch()
    const currentUser = useSelector(state => state.gAuth.currentUser)

    useEffect(() => {
        dispatch(fromLayerZeroGetAuthCurrentUser())
    }, [dispatch])

    useEffect(() => {
        let isMounted = false
        if (currentUser === null) return

        if (typeofHandler(currentUser?.uid, 'string')) {
            dispatch(
                setUserUID(currentUser.uid)
            )
        }

        return () => {
            isMounted = false
        }
    }, [dispatch])

    return (
        <LTSurveys trustedData={currentUser} />
    )
}