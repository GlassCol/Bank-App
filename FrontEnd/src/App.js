import React from 'react'
import Home from './Home';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'
import Login from './Login';
import CreateAccount from './CreateAccount';
import AccountPage from './AccountPage';
import AccountService from './Services/AccountService';

export default function App() {
  return (
    <Router>
      <Routes>
            <Route path='/' element={<Home />} />
            <Route path='/login' element={<Login />} />
            <Route path='/CreateAnAccount' element={<CreateAccount />} />
            <Route path='/AccountPage' element={<AccountPage />} />
      </Routes>
    </Router>

  )
}
