# 🚀 Professional Networking Platform – Microservices Architecture

A **LinkedIn-inspired backend system** built using **Spring Boot Microservices Architecture**.
This project demonstrates **scalable distributed system design**, **event-driven communication**, and **cloud-native deployment** using modern backend technologies.

---

# 📌 Project Overview

The platform allows users to:

* Create professional profiles
* Publish and interact with posts
* Send and manage connection requests
* Receive notifications for activities

The application is designed using **independent microservices**, enabling **high scalability, loose coupling, and independent deployment**.

---

# 🏗️ Microservices Architecture

```
                 ┌───────────────┐
                 │   API Gateway  │
                 └───────┬───────┘
                         │
        ┌───────────────┼───────────────┐
        │               │               │
 ┌─────────────┐ ┌─────────────┐ ┌─────────────┐
 │ User Service│ │ Post Service│ │ Connection  │
 │             │ │             │ │ Service     │
 └──────┬──────┘ └──────┬──────┘ └──────┬──────┘
        │               │               │
        └───────────────┼───────────────┘
                        │
                ┌───────────────┐
                │Notification   │
                │Service        │
                └───────────────┘

        Kafka Event Streaming between services
```

---

# 🧩 Microservices

### 👤 User Service

* Manages user profiles
* Handles user authentication
* Stores profile details

### 📝 Post Service

* Create and manage posts
* Like and interact with posts
* Fetch timeline data

### 🤝 Connection Service

* Send connection requests
* Accept / reject requests
* Manage professional network

### 🔔 Notification Service

* Sends notifications for:

  * New posts
  * Likes
  * Connection requests

### 🌐 API Gateway

* Central entry point for all services
* Handles routing and request forwarding
* Enables authentication and security layers

### 🔍 Eureka Discovery Server

* Registers all microservices
* Enables dynamic service discovery

### ⚙️ Config Server

* Centralized configuration management

---

# 📡 Event Driven Communication

**Apache Kafka** is used for asynchronous communication.

Example events:

* PostCreatedEvent
* LikeEvent
* ConnectionRequestEvent
* NotificationEvent

Benefits:

* Loose coupling
* High scalability
* Reliable message delivery

---

# 🛠 Tech Stack

## Backend

* Java
* Spring Boot
* Spring Cloud

## Microservice Infrastructure

* API Gateway
* Eureka Server
* Config Server

## Messaging

* Apache Kafka

## Database

* MySQL

## DevOps

* Docker
* AWS EC2

## Observability

* ELK Stack (Elasticsearch, Logstash, Kibana)
* Zipkin

## Tools

* Git
* IntelliJ IDEA
* Postman

---

# 📂 Project Structure

```
linkedin-microservices/
│
├── api-gateway
├── discovery-server
├── config-server
│
├── user-service
├── post-service
├── connection-service
├── notification-service
│
└── docker-compose.yml
```

---

# ⚙️ Running the Project

## 1️⃣ Clone the Repository

```
git clone https://github.com/your-username/linkedin-microservices.git
cd linkedin-microservices
```

---

## 2️⃣ Start Infrastructure Services

```
docker-compose up -d
```

This will start:

* Kafka
* Zookeeper
* Databases
* ELK Stack
* Zipkin

---

## 3️⃣ Start Microservices

Run services in this order:

1. Config Server
2. Discovery Server
3. API Gateway
4. User Service
5. Post Service
6. Connection Service
7. Notification Service

---

# 📮 Example API Endpoints

### Create User

```
POST /users
```

### Create Post

```
POST /posts
```

### Send Connection Request

```
POST /connections/request
```

### Get Notifications

```
GET /notifications
```

---

# ☁️ Deployment

The services are:

* **Containerized using Docker**
* **Deployed on AWS EC2**

Monitoring and debugging is done using:

* **ELK Stack** for centralized logging
* **Zipkin** for distributed tracing

---

# 🎯 Key Highlights

* Microservices Architecture
* Event Driven System
* Kafka Messaging
* API Gateway Routing
* Service Discovery using Eureka
* Containerization using Docker
* Cloud Deployment on AWS
* Centralized Logging & Monitoring

---

# 📚 Learning Outcomes

This project demonstrates:

* Designing scalable backend systems
* Implementing event-driven microservices
* Building resilient distributed systems
* Deploying containerized applications to cloud infrastructure

---

# 👨‍💻 Author

**Rushikesh Chavan**

Java Backend Developer
Spring Boot • Microservices • Kafka • AWS

---
