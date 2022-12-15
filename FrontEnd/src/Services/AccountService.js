import axios from "axios";
import LoginRedirect from "../LoginRedirect";
const ACCOUNT_API_BASE_URL = "http://localhost:8080/api/v1/accounts";

class AccountService {

    getAccounts() {
        return axios.get(ACCOUNT_API_BASE_URL);
    }
    saveAccount(account) {
        return axios.post(ACCOUNT_API_BASE_URL, account);
    }
    getItemById(accountId) {
        return axios.get(ACCOUNT_API_BASE_URL + "/" + accountId);
    }
    deleteItem(accountId) {
        return axios.delete(ACCOUNT_API_BASE_URL + "/" + accountId);
    }
    updateAccount(accountId, account) {
        return axios.put(ACCOUNT_API_BASE_URL + "/" + accountId, account);
    }
    checkLoginStatus() {
        //axios.get(ACCOUNT_API_BASE_URL + "/LoginCheck").then(response => {
           //console.log("logged in", response);
           // if (response === false) {
                LoginRedirect.RedirectToAccountPage();
           // }
        //}).catch(error => {
        //    console.log("check login error", error);
        //});
    }
}

export default new AccountService();