# 📧 Send Mail
The purpose of this project is to show how to send an email in a simple way, using either a **Microsoft** or **Google** account.
You have to create an App Password, here is a guide:

## With Microsoft

### 1️⃣  Enable two-step verification (2FA/MFA)
👉 Go to [account manager](https://account.live.com/proofs/manage)

- 🔑 Login with your email (@outlook.com, @hotmail.com, etc.).
- If you don't have two-step verification enabled, enable it now.
- Microsoft will ask for a phone number or the Microsoft Authenticator app.

⚠️ _**This step is mandatory**_, because without 2FA, application passwords are not enabled.

### 2️⃣  Access advanced security options
👉 Go to: [advancedsecurity](https://account.live.com/security/advancedsecurity)

- Scroll down to the _App passwords section_.
- Create a new application password
- Click on Create a new application password.
  Microsoft will generate a 16-character code which you should save (example: `abcd efgh ijkl mnop`).

💡 Use this code as your password in the program.

## 🟥 With Gmail

### 1️⃣  Enable two-step verification (2FA)
👉 Go to your account at [google account](https://myaccount.google.com/)

👉 Go to **Security** → **Two-step verification**.
- Set up your number or the Google Authenticator app.

⚠️ _**This is mandatory**_: without 2FA, Google will not let you use application passwords.

### 2️⃣  Access the application passwords section
- Once 2FA is active, go to [apppasswords](https://myaccount.google.com/apppasswords), login again (**Google will ask for your password**).

- Create a new application password
  ![img.png](images/create.app.png)

- Click on Create.
- Get the application key
  Google will generate a 16-character code which you should save (example: abcd efgh ijkl mnop).

💡 Use this code as your password in the program.

---

## 📝 Email Content
You have **two ways** to send content:
1. 🌐 Using an **HTML template**
2. 📄 Using **plain text**

Here’s an example of how it looks with each:

![img.png](images/mail.content.png)