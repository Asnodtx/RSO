/**
 *  Este proyeto tiene como objetivo proveer un sistema de información basado en software 
 *  para el departamento universitario de enfermeria de una universidad metropolitana en Mexico. 
 *  Basicamente, los requerimientos de usuario son: Lectura, Altas, Bajas y Cambios de info. Además, 
 *  se busca proveer un buen UX. Se busca que el usuario admin cree una cuenta de firebase. 
 *  El principal desafio tecnico de nuestra app es el manejo del estado de forma lo mas mantenible y 
 *  sincrona posible. Desde tener los datos correctos de auth, pasando por jerarquía de datos que se pasarán
 *  como parámetros a consultas de BD por medio de un RESTful en el backend.
 */

import { createRoot } from 'react-dom/client'
import { BrowserRouter } from 'react-router-dom'
import { Provider } from 'react-redux'
import { configuratedStore } from './redux/store/configuratedStore'
import Page from './app/(layerOne)/page'

createRoot(document.getElementById('root'))
.render(
	<Provider store={configuratedStore}>
		<BrowserRouter>
			<Page />
		</BrowserRouter>
	</Provider>
)
