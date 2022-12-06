import axios from "axios";
const TRANSACTION_API_BASE_URL = "http://localhost:8080/api/v1/transactions";

class TransactionService {
getTransactions() {
return axios.get(TRANSACTION_API_BASE_URL);
}
saveTransaction(transaction) {
return axios.post(TRANSACTION_API_BASE_URL, transaction);
}
getItemById(transactionId) {
return axios.get(TRANSACTION_API_BASE_URL + "/" + transactionId);
}
getAllAccountTransactions(accountId) {
return axios.get(TRANSACTION_API_BASE_URL + "/account/" + accountId);
}
}

export default new TransactionService();