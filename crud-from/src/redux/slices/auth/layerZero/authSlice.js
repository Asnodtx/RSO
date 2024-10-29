import { createSlice, createAsyncThunk } from '@reduxjs/toolkit'
import { auth } from '../../../../lib/sdk/firebase'

export const fromLayerZeroGetAuthCurrentUser = createAsyncThunk('firebase/currentUser',
	async (_, { rejectWithValue }) => {
    try {
        return new Promise((resolve, reject) => {
          auth.onAuthStateChanged(
            user => {
              if(user) {
                resolve(
                  {userData: { email: user.email, uid: user.uid }}
                )
              }
              reject('common rejection - no user')
            }
          )
        })
    } catch(sdkErr) {
      rejectWithValue(`thunk rejection - ${sdkErr.message}`)
    }

	}   // callback de asynThunk
)

/*
      __tareas pendientes__    __29 de octubre__

      1. revisar si es buena práctica colocar los ifs en los reducers
      2. en lugar del setUserUID, colocar un setTrustedData que contiene los errores, loading, etc.
      3. revisar en que parte colocar un componente suspense para evitar cortes de runtime
          ¿van en el componente hijo o en el padre?






*/






const authLogicalSlice = createSlice({
  name: 'gAuth',
  initialState: {
    currentUser: null,
    loadingAuthSDK: true,
    errorInAuthSDK: false,
    currentUser: null,
  },
  reducers: {
    setUserUID: (state, action) => {
      state.currentUser = action.payload
    }
  },
  extraReducers: builder => {
    builder
    .addCase('firebase/currentUser/pending', (state, action) => {
      state.loading = false;
    })
    .addCase('firebase/currentUser/fulfilled', (state, action) => {
      state.currentUser = action.payload.userData;
    })
    .addCase('firebase/currentUser/rejected', (state, action) => {
      state.errorInAuthSDK = action;
    })
  }
})

export const { setUserUID } = authLogicalSlice.actions
export default authLogicalSlice.reducer;