import React, {useState } from 'react'
import Container from 'react-bootstrap/Container'
import Form from 'react-bootstrap/Form'
import Button from 'react-bootstrap/Button'
import Header from './Components/Header'
import Logo from './Logo.png'
import './CSS/home.css'

const UpdateInfoPage = () => {
  return (
    <div className='parent'>
    <div><Header /></div>
    <Container id='main-container' className='d-grid w-50'>
        <Form id='reset-password-form' className='text-center w-100'>
          <img
            className='mb-4 bootstrap-logo'
            src={Logo}
            alt='Logo' />
            <h1>Update your information</h1>
            <Form.Group className='mb-1' controlId="first-name">
                <Form.Control type='string' size='lg' placeholder='First Name - Cole' autoComplete='First Name' className='position-relative'/>
            </Form.Group>
            <Form.Group className='mb-3' controlId="last-name">
                <Form.Control type='string' size='lg' placeholder='Last Name - Glass' autoComplete='Last Name' className='position-relative' />
            </Form.Group>
            <div className='d-grid'>
            <Button variant='dark' size='lg'>Update Information</Button>
            </div>
        </Form>
    </Container>
    </div>
  )
}

export default UpdateInfoPage