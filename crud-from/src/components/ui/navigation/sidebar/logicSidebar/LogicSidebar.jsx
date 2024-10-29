import '../styles/sideNavbar.css'

export default function LogicSidebar({ setModalToOpen, children }) {
	return (
		<div className='SNavbar__globalContainer'>
			<div className='SNavbar__modalContainer'>
                <div className='SNavbar__mainLy'>
                    <span 
                        className='SNavbar__close'
                        onClick={() => setModalToOpen(b=> !b)}
                    >
                        cerrar
                    </span>
                    {children}
                </div>
			</div>
		</div>
	)
}