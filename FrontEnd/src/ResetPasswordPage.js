import React, {useState } from 'react'
import Container from 'react-bootstrap/Container'
import Form from 'react-bootstrap/Form'
import Button from 'react-bootstrap/Button'
import Header from './Components/Header'
import Logo from './Logo.png'
import './CSS/home.css'

const ResetPasswordPage = () => {
  return (
    <div className='parent'>
    <div><Header /></div>
    <Container id='main-container' className='d-grid w-50'>
        <Form id='reset-password-form' className='text-center w-100'>
          <img
            className='mb-4 bootstrap-logo'
            src={Logo}
            alt='Logo' />
            <h1>Reset Password</h1>
            <Form.Group className='mb-1' controlId="previous-password">
                <Form.Control type='password' size='lg' placeholder='Previous Password' autoComplete='Previous Password' className='position-relative'/>
            </Form.Group>
            <Form.Group className='mb-3' controlId="new-password">
                <Form.Control type='password' size='lg' placeholder='New Password' autoComplete='New Password' className='position-relative' />
            </Form.Group>
            <div className='d-grid'>
            <Button variant='dark' size='lg'>Change Password</Button>
            </div>
        </Form>
    </Container>
    </div>
  )
}

export default ResetPasswordPage