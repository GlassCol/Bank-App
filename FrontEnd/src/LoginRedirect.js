import { useNavigate } from "react-router-dom"
const LoginRedirect = () => {
    const navigate = useNavigate();

    const redirectToLogin = () => {
        navigate('/login');
    }
    const redirectToAccountPage = () => {
        navigate('/AccountPage');
    }
    return (
        <>
        </>
    )
}
export default LoginRedirect;