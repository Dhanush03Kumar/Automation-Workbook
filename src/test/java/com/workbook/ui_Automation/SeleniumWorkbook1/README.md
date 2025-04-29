# Selenium workbook #1 - Dynamic dropdown

## Problem statement
Automate selecting an option from a dynamic autocomplete dropdown list that appears after typing partial text into an input field.

---

## Real world examples
    -Google search suggestions
    -Amazon product search
    -Flight Booking
---

## Concpets practiced
    -Explicit waits
    -Handling List of WebElements
    -Selecting based on text matching
    -Dealing with dynamic content

---

## Approach

1.Worked on Make my trip
2. Had to enter partial text to from & to cities
3. Once entered , used to JavaScriptExecutor to scroll down to find desired city
4. Used Waits and thread.sleep as elements were dynamic

---
## Challenges faced
 - Couldnt enter text to input fields, but could click on it
 - Later found out, once clicked new input tag appears dynamically, so have to enter text there by extracting new xpath
 - Code i wrote was faster that i didnt wait for the elements to appear, which didnt give us desired result
 - Had to go with Thread.sleep in few lines of code, couldnt find any alternative way.
 - Have to come back , to polish the code.

## Bonus Challenge
- Handle cases where no matching suggestion appears.
- Take screenshot if selection fails.

---
## Learnings
- Explicit waits
- JavaScriptExecutor
- Handling Dynamic elements


