import { Link } from 'react-router-dom'
import './mainHeader.css'

export default function MainHeader() {
	return (
		<div className='MainHeader__navCtn'>
			<div className='MainHeader__navBody'>

				<span>
					<Link to="/" className='MainHeader__link'>
						inicio
					</Link>
				</span>
				{/*    navigation link   */}
				<span>
					<Link to="/encuestas" className='MainHeader__link'>
						encuestas
					</Link>
				</span>
				<span>
					<Link to="/crear-encuestas" className='MainHeader__link'>
						iniciar encuesta
					</Link>
				</span>
				<span>
					<Link to="/signUp" className='MainHeader__link'>
						crear cuenta
					</Link>
				</span>
				<span>
					<Link to="/signIn" className='MainHeader__link'>
						iniciar sesión
					</Link>
				</span>


			</div>
		</div>
	)
}
