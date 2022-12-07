import React, { Component } from 'react'
import Header from './Components/Header'
import Sidebar from './Components/SideBar';
import './CSS/home.css';
import AccountBalance from './Components/AccountBalance';
import { Row, Col, Container } from 'react-bootstrap';
const AccountPage = ({ account }) => {

  return (
    <div className='parent'>
      <Header />
      <div >
        <div class="row">
          <div class="col-2">
            <Sidebar />
          </div>
          <div class="col align-self-start p-5">
            <AccountBalance />
          </div>
          <div class="col-sm">
          </div>
        </div>
      </div>
    </div>
  )
}

export default AccountPage

