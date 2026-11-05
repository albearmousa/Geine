# Geine – Mobile Test Automation (Appium + Java)

Mobile UI test automation framework built with **Appium**, **Java**, and **TestNG**, with data-driven tests and HTML reporting via **Extent Reports**.

## Features
- Mobile UI automation with Appium
- Data-driven testing using TestNG `@DataProvider`
- Test suite configuration through `testng.xml`
- HTML test reports with Extent Reports
- Maven-based dependency and build management

## Tech Stack
- Java
- Appium
- TestNG
- Extent Reports
- Maven

## Application Under Test
[App name and a one-line description, e.g. a public demo app]
Platform: [Android / iOS]

## Project Structure
```
├── src/              # Framework code and tests
├── reports/          # Generated Extent HTML reports
├── pom.xml           # Maven dependencies
└── testng.xml        # TestNG suite configuration
```

## Prerequisites
- Java JDK [version]
- Maven
- Node.js and Appium [version]
- Android Studio / emulator or a real device
- [Any other requirement, e.g. Appium drivers]

## Getting Started
```bash
# Clone the repository
git clone https://github.com/albearmousa/Geine.git
cd Geine

# Start the Appium server
appium

# Run the test suite
mvn clean test
```

Update the device name, platform version, and app path in [file/config location] before running.

## Reports
After a run, the Extent HTML report is generated in the `reports/` folder. Open it in any browser.

## Test Scenarios
- [Scenario 1, e.g. Login with valid credentials]
- [Scenario 2, e.g. Login with invalid credentials]
- [Scenario 3]

## Author
**Albear Mousa** – Software Test Engineer
[LinkedIn profile link]
