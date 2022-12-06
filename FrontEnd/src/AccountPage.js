import React, { Component } from 'react'
import Header from './Components/Header'
import Sidebar from './Components/SideBar';
import './CSS/home.css';

const AccountPage = ( {account} ) => {
  
    return (
      <div className='parent'>
        <Header />
        <Sidebar />
      </div>
    )
  }

export default AccountPage

