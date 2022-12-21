import React from "react";
import { Card, Badge, Button, Alert } from "react-bootstrap";

function SettingsCard() {
    return (
        <div className="card bg-dark sticky-top" style={{ minHeight: '184px', height: "30%",marginTop: '25%', 
        minwidth: '257px', width: '95%'}}>
            <div className="card-body">
                <h5 className="card-title" style={{ height: "20%" }}>Account Settings</h5>
                <p class="card-text" style={{ height: "30%" }}>Change your account settings here.</p>
                <a href="#" class="btn btn-primary" style={{ height: "25%" }}>Change Settings</a>
            </div>
         </div>
    )
}

export default SettingsCard