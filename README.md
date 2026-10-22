# Amazon TestNG Automation Project

This is a Selenium WebDriver and TestNG test automation project built using Maven to launch and verify `amazon.in` in Google Chrome.

## 🛠️ Tech Stack & Dependencies

- **Java**: 11+
- **Build Tool**: Apache Maven
- **Automation Framework**: TestNG (7.10.2)
- **Web Automation**: Selenium Java (4.25.0)
  - Uses built-in **Selenium Manager** (automatically downloads and configures the matching ChromeDriver for your installed Chrome browser).

---

## 📁 Project Structure

```
.
├── pom.xml                                    # Maven configuration & dependencies
├── testng.xml                                 # TestNG suite runner XML
├── .gitignore                                 # Git ignore patterns
├── README.md                                  # Documentation
└── src
    └── test
        └── java
            └── com
                └── amazon
                    └── tests
                        ├── BaseTest.java          # WebDriver setup & teardown
                        └── AmazonLaunchTest.java  # Amazon test scenarios
```

---

## 🚀 How to Run the Tests

### Option 1: Using Maven CLI
Execute the entire TestNG suite via Maven:
```powershell
mvn clean test
```

### Option 2: Using IDE (IntelliJ IDEA / Eclipse / VS Code)
1. Right-click on [testng.xml](file:///e:/Antigravity/AmazonLaunch/testng.xml) and choose **Run 'testng.xml'**.
2. Or right-click on [AmazonLaunchTest.java](file:///e:/Antigravity/AmazonLaunch/src/test/java/com/amazon/tests/AmazonLaunchTest.java) and choose **Run 'testLaunchAmazonIndia()'**.

---

## 📊 Test Reports

After running the tests, TestNG and Maven generate reports in:
- `target/surefire-reports/index.html` (TestNG HTML Report)
- `target/surefire-reports/emailable-report.html` (Quick Summary Report)