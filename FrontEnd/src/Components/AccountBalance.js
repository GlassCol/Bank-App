import React from "react";
import { Card, Badge, Button, Alert } from "react-bootstrap";

function AccountBalance() {
    return (
        <div className="card bg-dark sticky-top" style={{ minHeight: '184px', height: "30%",marginTop: '10%', 
        minwidth: '257px', width: '95%'}}>
            <div className="card-body">
                <h5 className="card-title" style={{ height: "20%" }}>Account Balance</h5>
                <p class="card-text" style={{ height: "30%" }}>Your account balance is : $0.00</p>
                <a href="#" class="btn btn-primary" style={{ height: "25%" }}>Deposit</a>
                <a href="#" class="btn btn-primary ms-5" style={{ height: "25%" }}>Withdraw</a>
            </div>
         </div>
    )
}

export default AccountBalance