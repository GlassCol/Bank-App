import React, {useState } from 'react'
import Container from 'react-bootstrap/Container'
import Form from 'react-bootstrap/Form'
import Button from 'react-bootstrap/Button'
import Header from './Components/Header'
import Logo from './Logo.png'
import './CSS/home.css'
import { Nav } from 'react-bootstrap'
const Login = () => {
  return (
    <div className='parent'>
    <div><Header /></div>
    <Container id='main-container' className='d-grid w-50'>
        <Form id='sign-in-form' className='text-center w-100'>
          <img
            className='mb-4 bootstrap-logo'
            src={Logo}
            alt='Logo' />
            <h1>Please Sign In</h1>
            <Form.Group className='mb-1' controlId="sign-in-email-address">
                <Form.Control type='email' size='lg' placeholder='Email Address' autoComplete='username' className='position-relative'/>
            </Form.Group>
            <Form.Group className='mb-3' controlId="sign-in-password">
                <Form.Control type='password' size='lg' placeholder='Password' autoComplete='Password' className='position-relative' />
            </Form.Group>
            <Form.Group className='d-flex justify-content-center mb-1' controlId="remember-me">
            <Form.Check label="Remember Me" />
            </Form.Group>
            <div className='d-grid'>
            <Button variant='dark' size='lg'>Sign In</Button>
            </div>
        </Form>
        <div className='link'>
        <Nav.Link href='/CreateAnAccount'>Create A New Account</Nav.Link>
        </div>
    </Container>
    </div>
  )
}

export default Login