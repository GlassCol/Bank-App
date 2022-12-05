import React, { Component } from 'react'
import Header from './Components/Header'

const AccountPage = ( {account} ) => {
  
    return (
      <div>
        <Header />
        <h1>Welcome {account.firstName}</h1>
      </div>
    )
  }

export default AccountPage

