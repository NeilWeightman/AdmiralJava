# Sparta Trainees Simulator

## Due
This project will be submitted to Neil Weightman, by email or on Teams, as a GitHub link on Monday 2022-02-21 at 09:00. In addition, a brief (10 mins max) presentation on the outcome of the project will be made on Friday 2022-02-18 at 16:00 (subject to no other academy presentations being scheduled to conflict with this).

## Overview
You have been asked to build a simulator which will help track the number of people currently training

## Stage 1 requirements:
- The tracker needs to be able to track time in a consistent way
- The program starts by asking how long the simulation will run for
- Every month, a random number of trainees are generated wanting to be trained (50 - 100)
- Every 2 months, Sparta Global opens training centres. They open instantly and can take trainees every month
- A centre can train a max of 100 trainees and takes a random number of trainees every month. (0 - 50 trainees up to their capacity)
- If a centre is full, trainees can be moved to any other centre which is not full
- If all centres are full, the trainees go onto a waiting list. This list must be served first before new trainees are taken
- At the end of the simulation, output should show:
	- number of open centres
	- number of full centres
	- number of trainees currently training
	- number of trainees on the waiting list

## Stage 2 requirements:
- Sparta will now check centres each month. If a centre has fewer than 25 trainees, it will close. The trainees will be randomly moved to another suitable centre
- The simulation should now offer the choice of data at the end of the simulation or a running output updated each month
- Trainees will now have a course type (Java, C#, Data, DevOps or Business). A trainee will be randomly assigned a course when they are created. This will never change
- Sparta now has 3 different types of centre. When a new centre can be opened, one of the following will be randomly chosen
	- Training Hub: can train a maximum of 100 trainees but 3 (randomly 1-3) can be opened at a time each month
	- Bootcamp: can train a maximum of 500 trainees but can remain open for 3 months if there are fewer than 25 trainees in attendance. If a Bootcamp has 3 consecutive months of low attendance, it will close. For the lifetime of the simulation, only 2 Bootcamps can exist at a time
	- Tech Centre: Can train 200 trainees but only teaches one course per centre. This is chosen randomly when a Tech Centre is open
- The simulation should report on the following:
	- number of open centres (breakdown for each type)
	- number of closed centres (breakdown for each type)
	- number of full centres (breakdown for each type)
	- number of trainees currently training (breakdown for each type)
	- number of trainees on the waiting list (breakdown for each type)

## Stage 3 requirements:
- If a trainee has been in training for a year, they are moved to a bench state
- Clients will begin to be randomly created after 1 year of the simulation
- A client will have a requirement when they are created e.g a need for 27 Java trainees. The requirement can be any value greater than or equal to 15
- A client will take a random number of trainees from the bench each month (1 - full requirement) until their requirement is met
- A client will only take one type of trainee (Java, C#, Data, DevOps or Business)
- If a client does not collect enough trainees from the bench within a year, they will leave unhappy
- If a client does collect enough trainees from the bench within a year, they will leave happy and return the next year with the same requirement



## Groups
### The Pure Rangers ([Autonomous Collective](https://www.youtube.com/watch?v=ACvXR0sQDkM))
- Mihai Udrea
- Gideon Troy
- Donovan Cupueran
- Sami Zirak
- Andrew Murray
- Jack Gilbride

### The Determined Wolves
- Hassan Said (Storage)
- Piotr Sulek (Simulation)
- Roberto Lovece (Class Structure, Simulation)
- **Aiden Sykes (Scrum, Tests, Presentation)**
- Conor Porteous (View)
- Suyash Srivastava (Storage)

### The Hungry Blazers
- Harry Lewis
- Brandon Johnson
- **Stephen Jones (Scrum)**
- Ben Wong
- Natasha Reilly
- Mehmet Yetim

### The Strong Dragons
- Sajad Gulzar (Trello)
- **Dale Bernardo (Scrum)**
- Antony Ademefun (GitHub)
- Autumn Peles (Lead Developer)
- Alvaro Gonzalez (Database)