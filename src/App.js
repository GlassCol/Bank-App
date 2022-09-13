import React from 'react'
import Home from './Home';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'

export default function App() {
  return (

    <Router>
    <div className='container'>
      <Routes>
            <Route path='/' element={<Home />} />
      </Routes>
    </div>
    </Router>

  )
}
