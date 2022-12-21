import React from "react";
import { Card, Badge, Button, Alert } from "react-bootstrap";

function ResetPasswordCard() {
    return (
        <div className="card bg-dark sticky-top" style={{ minHeight: '184px', height: "30%",marginTop: '27%', 
        minwidth: '257px', width: '95%'}}>
            <div className="card-body">
                <h5 className="card-title" style={{ height: "20%" }}>Reset Password</h5>
                <p class="card-text" style={{ height: "30%" }}>Change your account password here.</p>
                <a href="/ResetPassword" class="btn btn-primary" style={{ height: "25%"}}>Reset Password</a>
            </div>
         </div>
    )
}

export default ResetPasswordCard