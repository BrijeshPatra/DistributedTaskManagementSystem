# Distributed Task Management System

The Task Manager Application is a Spring Boot project designed to manage tasks and user authentication. It provides endpoints for user registration, login, task management, and real-time updates using WebSockets. The application also includes scheduled tasks for periodic operations.

## Components
Entities

Role: Defines the role entity.

Task: Represents a task entity.

User: Defines the user entity.

## Repositories

RoleRepository: Provides CRUD operations for roles.

TaskRepository: Provides CRUD operations for tasks.

UserRepository: Provides CRUD operations for users.

## Services

AuthService: Handles user authentication and registration.

TaskService: Manages task-related operations.

UserService: Manages user-related operations.

## Controllers

AuthController: Exposes endpoints for user authentication.

TaskController: Exposes endpoints for task management.

WebSocketController: Handles WebSocket functionality for real-time updates.

## Configurations

SecurityConfig: Configures security settings for the application.

QuartzConfig: Configures scheduled tasks using Quartz Scheduler.

WebSocketConfig: Configures WebSocket functionality.

## Scheduler

ScheduledTask: Defines a scheduled task for periodic operations.

## WebSocket Integration

WebSocket integration in the Task Manager Application enables real-time updates to users when tasks are created, updated, or deleted. WebSocket functionality is implemented using Spring's WebSocket support, allowing clients to subscribe to specific topics and receive real-time updates.


## Project Outcomes


The Task Manager Application delivers several outcomes that contribute to improved task management and team collaboration:

Efficient Task Management: Users can easily create, update, and track tasks within the application, streamlining task management processes.

Real-time Updates: WebSocket integration provides real-time communication between the client and server, enabling instant updates without manual refreshes.

Automated Workflows: Scheduled tasks automate routine operations, reducing manual effort and minimizing the risk of human error.

Enhanced Collaboration: Real-time updates facilitate better collaboration among team members by ensuring everyone is aware of the latest task status and changes.


## Getting Started

To get started with the Task Manager Application:

Clone the repository to your local machine.

Configure the application properties, such as database connection settings, in the application.properties file

Run the application using Maven or your preferred IDE

Access the application via the provided URL (e.g., http://localhost:8080) and begin using the features.
