import React, { Component } from 'react'
import Header from './Components/Header'
import Sidebar from './Components/SideBar';
import './CSS/home.css';
import AccountBalance from './Components/AccountBalance';
import MostRecentTransaction from './Components/MostRecentTransaction';
import { Row, Col, Container } from 'react-bootstrap';
import SettingsCard from './Components/SettingsCard';
import UpdateInfoCard from './Components/UpdateInfoCard';
import ResetPasswordCard from './Components/ResetPasswordCard';
const AccountPage = ({ account }) => {

  return (
    <div className='parent'>
      <Header />
      <div style={{ height: '93%'}}>
        <div class="row" style={{height: '100%'}}>
          <div class="col align-self-start h-100">
            <Sidebar />
          </div>
          <div class="col align-self-start h-100 p-5" >
            <h1>Cole Glass</h1>
            <AccountBalance />
            <MostRecentTransaction />
          </div>
          <div class="col align-self-start h-100 p-5">
            <UpdateInfoCard />
            <SettingsCard />
          </div>
          <div class='col-align-self-start w-25 h-100 p-5'>
            <ResetPasswordCard />
          </div>
        </div>
      </div>
    </div>
  )
}

export default AccountPage

