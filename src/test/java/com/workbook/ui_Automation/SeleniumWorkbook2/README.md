# Selenium Workbook #2 – PDF Content Validation

## Problem statement
Automate the process of downloading a PDF file via UI, extracting its text content, and asserting the presence of key business data within it.

---

## Real world examples
- Invoice or report verification
- Ticket/receipt content validation
- Order summary confirmation after transactions
- Certificate or document content checks

---

## Concepts practiced
- Chrome browser preferences for auto-download
- PDF content extraction using Apache PDFBox
- String normalization for accurate assertions
- File existence check and content verification

---

## Approach

1. Used a test site to trigger PDF download
2. Configured Chrome preferences to:
    - Bypass in-browser PDF viewer
    - Download directly to a custom path
3. Waited for the file to appear using a loop
4. Extracted content using PDFBox
5. Used a custom assertion utility to validate expected text

---

## Challenges faced
- Chrome opened PDF in a viewer instead of downloading - Resolved using browser preference config
- File path issues due to dynamic project structure - Resolved file path issue by dynamically constructing the download path using Base.getDownloadDir() and appending the filename.
- Extracted PDF text had inconsistent whitespace - Used `trim()` and `replace()` to normalize content
- Assertions were repeated → Created a reusable utility class for PDF validations

---

## Bonus Challenge
- Add support for validating multiple keywords in one pass
- Integrate failure screenshots and attach downloaded PDF to test reports
- Implement logging for test step tracing

---

## Learnings
- Integrated third-party library (PDFBox) in test automation
- Controlled browser behavior via ChromeOptions
- Understood real-world constraints in file handling
- Reinforced modularity through custom utilities
