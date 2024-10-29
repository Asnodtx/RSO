import { useState } from 'react'
import ProfileOptions from './ui/profileOptionsUI/ProfileOptions'
import LogicSidebar from './logicSidebar/LogicSidebar'
import LogicNavcat from './navcats/LogicNavcat'
import './styles/navbar.css'

export default function SideNavbar() {
    const [isModalOpen, setModalToOpen] = useState(false)

    return (
        <>
            <span 
                className='Navbar__activator'
                // style={{display:`${isModalOpen ? 'none' : 'inherit'}`}}
            >
                <span className='Navbar__activator_item1'></span>
                <span 
                    className='Navbar__activator_item2'
                    onClick={() => setModalToOpen(true)}
                >
                    <ion-icon 
                        name='play-skip-forward-outline'
                        style={{fontSize: '1.5em'}} 
                    >
                    </ion-icon>
                </span>
            </span>
            {
                isModalOpen &&
                <LogicSidebar setModalToOpen={setModalToOpen}>
                    <ProfileOptions />
                    <LogicNavcat />
                </LogicSidebar>
            }
        </>
    )
}
