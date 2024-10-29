import { redirect, useNavigate } from 'react-router-dom'
import './styles/HomePageUI.css'

export default function HomePageUI() {
    const navigate = useNavigate() 
    function navigateTo(path) {
        navigate(path)
    }

    return (
        <div className="Home__grid">
            <div className="Home__content">
                <div>
                    <h2>Pagina de inicio</h2>
                </div>
                <div>
                    <button 
                        type='button'
                        className='SignIn__formBtn'
                        onClick={()=> {
                            console.log('click')
                            navigateTo("/encuestas")
                        }}
                    >
                        ver el reporte de encuestas
                    </button>
                </div>
            </div>
        </div>
    )
}
