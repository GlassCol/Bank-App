import React from "react";
import { Card, Badge, Button, Alert } from "react-bootstrap";

function AccountBalance() {
    return (
        <div className="card bg-dark sticky-top" style={{ width: '18rem' }}>
            <div className="card-body">
                <h5 className="card-title">Account Balance</h5>
                <p class="card-text">Your account balance is: $0.00</p>
                <a href="#" class="btn btn-primary">Deposit</a>
            </div>
         </div>
    )
}

export default AccountBalance