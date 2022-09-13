import './CSS/home.css';
import React from 'react'
import Header from './Components/Header';
import Logo from './Logo.png';

function Home() {
  return (
    <>
    <div><Header /></div>
    <div className='Container' style={{display: 'flex', justifyContent: 'center'}}><img src={Logo}></img></div>
    <div><h2>Safe Secure Transfers</h2></div>
    </>
  )
}

export default Home
