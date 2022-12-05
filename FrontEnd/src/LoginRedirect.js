import { useNavigate } from "react-router-dom"
const LoginRedirect = () => {
    const navigate = useNavigate();
    const redirectToLogin = () => {
        navigate('/login');
    }
    return (
        <>
        </>
    )
}
export default LoginRedirect;