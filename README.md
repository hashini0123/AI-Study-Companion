# 🤖 AI Study Companion

## 📌 Overview

AI Study Companion is a smart offline-enabled learning assistant designed to help students understand their study materials more effectively using Artificial Intelligence.

This system allows users to upload notes, interact with an AI chatbot, generate quizzes, and get simplified explanations — all in one place.

---

## 🎯 Features

* 📄 Upload study notes (PDF/Text)
* 🧠 AI-powered explanations
* 💬 Chat with AI assistant
* ❓ Automatic quiz generation
* 🌍 Sinhala & English support
* 🔒 Secure authentication (JWT-based)

---

## 🏗️ System Architecture

Frontend (React)
⬇
Backend (Spring Boot)
⬇
AI Engine (Ollama - Local LLM)
⬇
Database (MySQL)

---

## ⚙️ Tech Stack

### Backend

* Spring Boot
* Spring Security (JWT)
* REST APIs

### Frontend

* React.js

### AI Integration

* Ollama (Local LLM - llama3.2)

### Database

* MySQL

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/your-username/ai-study-companion.git
cd ai-study-companion
```

---

### 2. Run Backend

* Open project in IntelliJ
* Run Spring Boot application

Backend runs on:

```
http://localhost:8080
```

---

### 3. Run Ollama (AI)

```bash
ollama run llama3.2
```

---

### 4. Run Frontend

```bash
npm install
npm run dev
```

---

## 🔐 Security

* User authentication using JWT
* Password encryption
* Protected API endpoints

---

## 📡 API Endpoints (Sample)

* POST `/api/auth/register`
* POST `/api/auth/login`
* POST `/api/ai/ask`
* POST `/api/notes/upload`
* POST `/api/quiz/generate`

---

## 🧠 Future Improvements

* 📊 Learning analytics dashboard
* 🗂️ Note categorization
* 🗣️ Voice-based interaction
* ☁️ Optional cloud AI support

---

## 👨‍💻 Author

Hashini Nanayakkara

---

## 📜 License

This project is for educational purposes.
