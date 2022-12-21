import React from "react"
import { Card, Badge, Button, Alert } from "react-bootstrap"

function MostRecentTransaction() {
    return (
        <div className="card bg-dark sticky-top" style={{ minHeight: '184px', height: "30%",marginTop: '25%', 
        minwidth: '257px', width: '95%'}}>
            <div className="card-body">
                <h5 className="card-title" style={{ height: "20%" }}>Most Recent Transaction</h5>
                <p class="card-text" style={{ height: "25%" }}>You have no recent transactions.</p>
                <a href="#" class="btn btn-primary" style={{ height: "25%" }}>See All Transactions</a>
            </div>
         </div>
    )
}

export default MostRecentTransaction