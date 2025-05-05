# Automation Workbook #3 – File Upload (SmallPDF)

## 📝 Problem Statement
Automate uploading a PDF file to SmallPDF's Compress PDF tool and validate successful upload using Selenium (Java).

---

## 🌐 Real World Example
- File uploads for document processing, KYC, online converters, resume uploads, etc.

---

## 🔍 Concepts Practiced
- Handling hidden `<input type="file">`
- Uploading files via `sendKeys()` in Selenium
- Waiting for post-upload confirmation UI
- File path handling

---

## 🧭 Approach

1. Navigated to `https://smallpdf.com/compress-pdf`
2. Located the hidden file input element of type `file`
3. Used `sendKeys()` to upload a PDF file directly
4. Waited for preview/compression UI to confirm successful upload
5. Downloading the compressed file will be handled in a follow-up session

---

## ⚠️ Challenges Faced

- File input is hidden — couldn’t use `.click()`, had to locate `input[type='file']` and send full file path
- Post-upload UI is dynamic and takes a few seconds to render — used `WebDriverWait`
- Couldn't complete the final download handling due to dynamic behavior and download handling complexity

---

## 🧠 Learnings

- Bypassing custom upload buttons by directly using hidden file input
- Importance of DOM inspection when standard locators don't work
- Dynamic wait usage post file upload
- Real-world platform behaviors often introduce additional asynchronous steps

---

## ✅ Bonus Challenge (Pending)
- Automate download of the compressed file and validate its presence in the download directory
