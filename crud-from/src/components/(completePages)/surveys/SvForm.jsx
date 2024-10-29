export default function SvForm() {
	async function handleSubmit(evt) {
		evt.preventDefault()
		const temp = {
			idest: evt.target.idest.value,
			nombre: evt.target.nombre.value,
			apellidoMaterno: evt.target.apellidoMaterno.value,
			apellidoPaterno: evt.target.apellidoPaterno.value,
			grupo: evt.target.grupo.value,
			contrasenia: evt.target.contrasenia.value,
		}
		console.log(temp)
		const r = await fetch("http://127.0.0.1:8081/estudiante", {
			method: 'POST',
			headers: {
				'Content-Type': 'application/json'
			},
			body: JSON.stringify(temp),
		})
		// const j = r.json()
		console.log({...r})
	}
	return (
		<div>
			<form onSubmit={e => handleSubmit(e)}>
			<label style={{display:'block'}}>{'crear estudiante'}</label>
			<input 
				type='number'
				name='idest'
				placeholder='id-est'
			/>
			<hr/>
			<input 
				type='text'
				name='nombre'
				placeholder='nombre estudiante'
			/>
			<hr/>
			<input 
				type='text'
				name='apellidoPaterno'
				placeholder='paterno'
			/>
			<hr/>
			<input 
				type='text'
				name='apellidoMaterno'
				placeholder='materno'
			/>
			<hr/>
			<input 
				type='text'
				name='grupo'
				placeholder='grupo'
			/>
			<hr/>
			<input 
				type='text'
				name='contrasenia'
				placeholder='password'
			/>
			<hr/>
			<button type='submit'>
				{'Enviar a Java Spring'}
			</button>
			</form>
		</div>
	)

}
