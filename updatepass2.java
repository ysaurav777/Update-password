let newPasswordEl = document.getElementById("newPassword");
let confirmPasswordEl = document.getElementById("confirmPassword");
let newPasswordErrMsgEl = document.getElementById("newPasswordErrMsg");
let confirmPasswordErrMsgEl = document.getElementById("confirmPasswordErrMsg");
let updatePasswordFormEl = document.getElementById("updatePasswordForm");

function newpass() {
    if (newPasswordEl.value === "") {
        newPasswordErrMsgEl.textContent = "Required*";
        newPasswordErrMsgEl.classList.add("error");
    } else {
        newPasswordErrMsgEl.textContent = "";
    }
}

function valpass() {
    if (confirmPasswordEl.value !== newPasswordEl.value) {
        confirmPasswordErrMsgEl.textContent = "Passwords must be same";
        confirmPasswordErrMsgEl.classList.add("error");
    } else {
        confirmPasswordErrMsgEl.textContent = "";
    }
}

newPasswordEl.addEventListener("blur", newpass);

confirmPasswordEl.addEventListener("blur", valpass);

updatePasswordFormEl.addEventListener("submit", function(event) {
    event.preventDefault();
    newpass();
    valpass();
});