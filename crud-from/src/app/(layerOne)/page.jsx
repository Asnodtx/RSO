import { Routes, Route } from 'react-router-dom'
import '../../assets/css/global.css'
import MainHeader from '../../components/ui/headers/MainHeader'
import SideNavbar from '../../components/ui/navigation/sidebar/SideNavbar'

import NotFoundPage from '../(layerTwo)/notFound/NotFoundPage'
import HomePage from '../(layerTwo)/home/HomePage'
import SurveysPage from '../(layerOne)/surveys/LOSurveys'
import SignUpPage from '../(layerTwo)/signUp/SignUpPage'
import SignInPage from '../(layerTwo)/signIn/SignInPage'


export default function Page() {
	const pagesDirectory = {
		notFound: <NotFoundPage />,
		homePage: <HomePage/>,
		surveyPage: <SurveysPage/>,
		signUp: <SignUpPage />,
		signIn: <SignInPage />,
	}

	return (
		<div className="body">
			<MainHeader />
			<SideNavbar />
			<div style={{width:'100%',display:'grid'}} id='layout-container'>
				<Routes>
					<Route 
						path="*"
						element={pagesDirectory.notFound}
					/>{/*  UI response for not valid path segment  */}
					<Route 
						path="/"
						exact
						element={pagesDirectory.homePage}
					/>
					<Route 
						path="/encuestas"
						element={pagesDirectory.surveyPage}
					/>
					<Route 
						path="/signUp"
						element={pagesDirectory.signUp}
					/>
					<Route 
						path="/signIn"
						element={pagesDirectory.signIn}
					/>
				</Routes>
			</div>
		</div>
	)
}

