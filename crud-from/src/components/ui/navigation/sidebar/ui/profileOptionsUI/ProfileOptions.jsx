import './ProfileOptions.css'

export default function ProfileOptions() {
    return (
        <div className='ProfileOptions__user-profile'>
            <div className='ProfileOptions__user-profile-content'>
                <div className='ProfileOptions__user-avatar'>
                    <ion-icon Name='ProfileOptions__people-outline'></ion-icon>
                </div>
                <div className='ProfileOptions__user-details'>
                    <span className='ProfileOptions__username'>Hola suario</span>
                    <span className='ProfileOptions__user-role'>Rol del Usuario</span>
                </div>
            </div>
        </div>
    )
}