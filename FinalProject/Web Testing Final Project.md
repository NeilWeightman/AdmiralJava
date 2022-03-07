# Web Testing Project
For this project, you will be building a testing framework to 
test [Automation Practice](http://automationpractice.com/index.php).

## Planning
The website is current unmaintained and needs to be tested before further development can take place. 
You will need to look at the website and document any assumptions you are making about expected 
behaviour based on how it currently works. Since exhaustive testing is impossible, you will need 
to carefully prioritise tests based on importance.

## Jira
You will be using Jira as your project board. Make sure that all user stories have acceptance criteria, 
tests and story points allocated.

## Page Object Model
You will need to create a Page object model that testers could use. 
This will abstract away the webdriver and provide helper methods to make testing easier. 
To ensure that the POM is working correctly you will need to internally test it using Mocking. 
If possible, you will need produce a code coverage value for your tests. 
The POM should aim to be easy to extend should more tests be needed and should include a Web Driver 
Factory that covers:

- At least 3 different browsers.
- 2 different mobile devices (with the driver of your choice).

## BDD
You will also be implementing a BDD layer using Cucumber. 
This will allow testing to happen against acceptance criteria using feature files. 
A TestRunner should also be used to run all features with tags to filter them.

## Documentation
As well as a user guide, you will need to produce a test report showing all faults you have found. 
This should be in a table with the following format:

| Test ID | Bug Description | Steps to reproduce | Expected Result | Environment |
|---------|-----------------|--------------------|-----------------|-------------|
| 01      |Adding item to shopping cart does not increment badge number | Add any item from landing page to shopping cart by clicking add item button | Item should be added and badge number should increase | iPhone 11 emulated through Chrome WebDriver 
## Artifacts 
- Kanban Board.
- README file explaining how to use the framework to perform tests.
- Bug report showing bugs found as per previous section.
- List of assumptions made before testing.

## Git
- Master branch can only contain production ready code. No code can be submitted to the master branch without being approved by the scrum master.
- Dev branch should contain development features that have been tested, reviewed and approved. No code can be submitted to the dev branch without being approved by 2 members of the team.
- Feature branches contain features that are being worked on. These will be numerous and a suitable naming strategy needs to be used. Aim to have a branch for each feature you are working on.
- Web drivers should **NOT** be pushed to GitHub.

## Presentation
At the end of the week, you will be presenting your framework. 
The aim will be to demonstrate how it works. This will be aimed at testers looking to use your framework.

## Groups
### Guarded Geckos
- Stephen Jones 
- Natasha Reilly
- Sajad Gulzar
- Ben Wong
- Alvaro Gonzalez
- Mehmet Yetim (GitHub)
- Jack Gilbride
- Brandon Johnson 
- Andrew Murray 
- Harry Lewis (Scrum)
- Conor Porteous

### Careful Chameleons
- Aiden Sykes
- Antony Ademefun
- Dale Bernardo (Scrum)
- Donovan Cupueran
- Gideon Troy (Presentation)
- Mihai Udrea
- Piotr Sulek
- Roberto Lovece (Lead Developer)
- Sami Zirak (GitHub)
- Suyash Srivastava (BDD)
- Autumn Peles (Lead Developer)
