# Weather API Project
For this project, you will be building a testing framework to test the Open Weather Map API. 
Your framework will only be focused on the [Current Weather](https://openweathermap.org/current) section

## Service Object Model
Since the API has a number of different responses, you will need to use a Service Object Model. 
This model represents the various API requests using the following components:

1. DTO: Classes that represent the different types of responses that can be called.
2. ConnectionManager: A class which handles the connection to the live system and collecting the response.
3. Injector: A class responsible for injecting the JSON response into a weather DTO.

These are the main components; you are not limited to just these. 
The DTOs should provide access to all the data that testers could find useful.

Along with providing the DTOs, you should also provide an example test bed showing examples of ALL the 
different types of test that can be performed. Include support for defining tests using Cucumber.
The framework itself should also be internally tested 
using unit testing and mocking.

## Scrum Masters
- Hold stand ups and set tasks from backlog for sprints.
- Report any major issues to product owner.
- Meet with product owner at 16:00 each day (Wednesday & Thursday) to go through progress.
- Give feedback on the rest of the group.

## Git
- Master branch can only contain production ready code. No code can be submitted to the master branch without 
being approved by the scrum master.
- Dev branch should contain development features that have been tested, reviewed and approved. 
No code can be submitted to the dev branch without being approved by 2 members of the team.
- Feature branches contain features that are being worked on. These will be numerous and a suitable naming 
strategy needs to be used. Aim to have a branch for each feature you are working on.
- The API key used for your project must NOT be uploaded to GitHub as this would be a security risk.
- GitHub link must be submitted to Neil Weightman by 09:00 on 2022-02-28.

## Presentation
At the end of the week, you will be presenting your framework (hopefully 16:00 on 2022-02-25, 15 minutes per group). 
The aim will be to demonstrate how it works. 
This will be aimed at testers looking to use your framework. The presentation should cover:
- The requirements you were given.
- The approach you took (tools, techniques).
- A demonstration of the framework in action.
- Your challenges and successes.
 
## Groups
### Storm Hamsters
- **Natasha Reilly** Scrum
- Brandon Johnson
- Ben Wong
- Autumn Peles
- Antony Ademefun

### Warthogs
- Roberto Lovece
- Donovan Cupueran
- **Mehmet Yetim** Scrum
- Suyash Srivastava
- Stephen Jones
- Aiden Sykes

### Magic Pythons
- **Andrew Murray** Scrum
- Dale Bernardo
- Hassan Said
- Jack Gilbride
- Harry Lewis
- Conor Porteous

### Steel Swans
- Sami Zirak
- Alvaro Gonzalez
- **Gideon Troy** Scrum
- Piotr Sulek
- Sajad Gulzar
- Mihai Udrea